package com.springboot;

public class JettyWebServer implements WebServer{
    @Override
    public void start() {
        System.out.println("启动jetty容器！");
    }

    public JettyWebServer() {
    }
}
