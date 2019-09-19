package com.frank;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Server server = new Server(8888);
        //JVM退出时关闭Jetty
        server.setStopAtShutdown(true);

        ServletHandler handler = new ServletHandler();
        handler.addServletWithMapping(
                HelloServlet.class, "/h");

        server.setHandler(handler);


        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
