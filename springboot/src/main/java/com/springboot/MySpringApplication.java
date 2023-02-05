package com.springboot;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;


import java.util.Map;

public class MySpringApplication {

    public static void run(Class clazz){
        //创建装配bean的spring容器
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();

        //容器配置、注册
        applicationContext.register(clazz);  //解析该类的注解和bean
        applicationContext.refresh();

        //启动tomcat或者jetty容器
        //通过@condition注解判断导入的依赖判定
        WebServer webServer = getWebServer(applicationContext);
        webServer.start();
    }

    private static WebServer getWebServer(WebApplicationContext applicationContext) {
        Map<String, WebServer> beansOfType = applicationContext.getBeansOfType(WebServer.class);
        if(beansOfType.size() == 0) {
            throw new NullPointerException();
        }
        if (beansOfType.size() > 1) {
            throw new IllegalStateException();
        }
        return beansOfType.values().stream().findFirst().get();
    }


}
