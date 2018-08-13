package com.java.test.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ViewProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.print ("User email in profile servlet: " + req.getSession ().getAttribute ("usermail"));

        req.getRequestDispatcher ("html/profile.jsp").forward (req,resp);
    }
}
