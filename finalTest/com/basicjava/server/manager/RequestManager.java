package com.basicjava.server.manager;

import java.net.Socket;
import java.io.InputStream;
import java.io.BufferedInputStream;
import com.basicjava.server.dto.RequestDTO;


public class RequestManager {
    private Socket socket;
    public RequestManager(Socket socket) {
        this.socket = socket;
    };

    private final int BUFFER_SIZE = 2048;

    public RequestDTO readRequest() throws Exception {
        InputStream request = null;
        RequestDTO dto = new RequestDTO();
        request = new BufferedInputStream(socket.getInputStream());
        byte[] receivedBytes = new byte[BUFFER_SIZE];
        request.read(receivedBytes);
        String requestData = new String(receivedBytes).trim();
        dto.setRequestMethod(requestData.split(" ")[0]);
        if (!requestData.split(" ")[1].equals("/favicon.ico")) {
            dto.setUri(requestData.split(" ")[1]);
        }
        dto.setHttpVersion(requestData.split(" ")[2].split("\n")[0]);

        System.out.println(dto.getRequestMethod());
        System.out.println(dto.getUri());
        System.out.println(dto.getHttpVersion());
        System.out.println(dto.getRequestMethod() + " " + dto.getUri() + " " + dto.getHttpVersion());


        return dto;
    }
}