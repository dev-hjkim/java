package com.basicjava.server.manager;

import java.net.Socket;
import java.io.PrintStream;
import java.util.Date;
import com.basicjava.server.dto.RequestDTO;

public class ResponseManager {
    private Socket socket;
    private RequestDTO dto;

    public ResponseManager(Socket socket, RequestDTO reqDto) {
        this.socket = socket;
        this.dto = reqDto;
    }


    public void writeResponse() throws Exception {
        PrintStream response = null;
        response = new PrintStream(socket.getOutputStream());
        response.println(dto.getHttpVersion() + " 200 OK");
        response.println("Content-type: text/html");
        response.println();

        if (dto.getRequestMethod().equals("GET") && dto.getUri().equals("/")) {
            response.println("It is working");
        } else if (dto.getRequestMethod().equals("GET") && dto.getUri().equals("/today")) {
            response.println(new Date());
        }

    }
}