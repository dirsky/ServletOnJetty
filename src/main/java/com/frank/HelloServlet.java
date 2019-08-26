package com.frank;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Guozhong Xu
 * @date: Create in 15:40 2019/8/26
 * @version: 1.0
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello Servlet");
        resp.getWriter().write("this is my jetty servlet");
    }
}
