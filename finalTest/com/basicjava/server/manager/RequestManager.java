package com.basicjava.server.manager;

import java.net.Socket;

public class RequestManager {
    public RequestManager(Socket socket);

    public RequestDTO readRequest() {
        RequestDto dto = new RequestDto();

        return dto;
    }
}