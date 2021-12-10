package com.basicjava.server;

import java.net.ServerSocket;
import java.net.Socket;
import com.basicjava.server.handler.RequestHandler;
import com.basicjava.server.manager.RequestManager;
import com.basicjava.server.manager.ResponseManager;

public class SimpleWebServer {
    public static void main(String[] args) {
        SimpleWebServer server = new SimpleWebServer();
        server.run();
    }

    public void run() {
        ServerSocket server = null;
        try {
            server = new ServerSocket(9000);

            while (true) {
                Socket request = server.accept();
                RequestHandler handler = new RequestHandler(request);
                handler.run();
                request.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}