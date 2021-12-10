package com.basicjava.server.handler;

import java.net.Socket;
import com.basicjava.server.manager.RequestManager;
import com.basicjava.server.manager.ResponseManager;
import com.basicjava.server.dto.RequestDTO;

public class RequestHandler extends Thread {
    private Socket socket;

    public RequestHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            RequestManager requestManager = new RequestManager(socket);
            RequestDTO requestDto = requestManager.readRequest();

            ResponseManager responseManager = new ResponseManager(socket, requestDto);
            responseManager.writeResponse();
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}