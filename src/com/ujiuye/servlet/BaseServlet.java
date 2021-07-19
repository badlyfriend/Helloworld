package com.ujiuye.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @Author Bob
 * @Create 2021-07-18-19:11
 */
public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        Class c = this.getClass();
        String mark = req.getParameter("mark");
        try {
            Method m = c.getMethod(mark, HttpServletRequest.class, HttpServletResponse.class);
            m.invoke(this,req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
