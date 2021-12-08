package com.basicjava.server.manager;

import java.net.Socket;

public class ResponseManager {
    private Socket socket;
    private RequestDTO dto;

    ResponseManager(Socket socket, RequestDTO reqDto) {
        this.socket = socket;
        this.dto = reqDto;
    }


    public void writeResponse() {

    }
}