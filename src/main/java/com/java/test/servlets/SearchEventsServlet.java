package com.java.test.servlets;

import com.java.test.beans.Event;
import com.java.test.dao.ApplicationDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/searchEvents2jhçlhj")
public class SearchEventsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String searchString = req.getParameter("searchEvents");String searchString =
       // Connection connection = (Connection) getServletContext ().getAttribute ("dbconnection");

        ApplicationDao dao = new ApplicationDao ();
        //List<Event> events =dao.getEvents (searchString, connection);
        List<Event> events =dao.getEvents ();

        req.setAttribute ("events", events);
        req.getRequestDispatcher ("/html/searchEvents.jsp").forward (req,resp);
    }
}
