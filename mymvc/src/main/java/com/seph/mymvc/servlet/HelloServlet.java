package com.seph.mymvc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{

    System.out.println("HelloServlet.service");

    System.out.println("request = " + request);
    System.out.println("response = " + response);

    String nickname = request.getParameter("nickname");
    System.out.println("nickname = " + nickname);

    //헤더 정보에 들어간다.
    response.setContentType("text/plain");
    response.setCharacterEncoding("utf-8");

    response.getWriter().write("hello " + nickname);
  }
}
