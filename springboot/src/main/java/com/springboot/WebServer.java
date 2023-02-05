package com.springboot;

import org.springframework.web.context.WebApplicationContext;

//可能用tomcat、jetty等，不能写死
public interface WebServer {
    public void start();
}
