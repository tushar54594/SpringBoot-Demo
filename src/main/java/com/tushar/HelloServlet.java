package com.tushar;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello") --> use this when using external tomcat. here, we are using embedded tomcat
public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("in service");
//        res.getWriter().println("Hello world!");

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.println("<h2>Hello world</h2>");
    }

}
