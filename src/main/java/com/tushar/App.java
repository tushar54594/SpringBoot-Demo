package com.tushar;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}

/*
for making web applications, we need a servlet which will interact with the user to get data
A servlet is a small Java program that runs within a Web server. Servlets receive and respond to
requests from Web clients, usually across HTTP
servlet will run on a server to run - normally we use Apache Tomcat
Tomcat is basically a servlet container and a web server (since it is able to process HTTP requests using its
internal Coyote HTTP server)
By deploying your servlets on Tomcat you're putting them in a container, which then will manage all edges of their functionality, including the lifecycle.
Both Tomcat and your app can be considered as a “server” in the context of your question

 */
