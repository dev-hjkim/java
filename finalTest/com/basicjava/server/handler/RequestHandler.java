package com.basicjava.server.handler;

import java.net.Socket;

public class RequestHandler extends Thread {
    private Socket socket;

    RequestHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {

    }
}