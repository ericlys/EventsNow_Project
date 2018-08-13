package com.java.test.servlets;

import com.java.test.beans.Event;
import com.java.test.dao.ApplicationDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.MessageFormat;

@WebServlet("/registerEvent")
public class registerEventServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String eventTitle = req.getParameter ("title");
        Date eventStartDate = Date.valueOf (req.getParameter ("StartDate"));
        Date eventFinalDate = Date.valueOf(req.getParameter ("FinalDate"));
        String eventTheme = req.getParameter ("theme");
        Float eventLatitude = Float.valueOf (req.getParameter ("txtLatitude"));
        Float eventLongitude = Float.valueOf(req.getParameter ("txtLongitude"));
        String eventAddress = req.getParameter ("txtEndereco");
        String userMail = (String) req.getSession ().getAttribute ("usermail");

        Event event = new Event (eventTitle, eventStartDate, eventFinalDate, eventTheme, eventLatitude, eventLongitude, eventAddress,userMail);

        System.out.println (event.toString () );

        String infoMessage = null;

        ApplicationDao applicationDao = new ApplicationDao ();
        int rows = applicationDao.registerEvent (event);

        if (rows == 0) {
            infoMessage = "Desculpe, um erro correu!, ou o evento já esta cadastrado";
        } else {
            infoMessage = "Evento registrado com sucesso!";
        }

        String page = getHTMLString (req.getServletContext ( ).getRealPath ("html/index.html"), infoMessage);
        resp.getWriter ( ).write (page);

    }

    public String getHTMLString(String filePath, String message ) throws IOException {
        BufferedReader reader = new BufferedReader (new FileReader (filePath));
        String line = "";
        StringBuffer buffer = new StringBuffer ( );
        while ((line = reader.readLine ( )) != null) {
            buffer.append (line);
        }

        reader.close ( );
        String page = buffer.toString ( );

        page = MessageFormat.format (page, message);

        return page;

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = getHTMLString(req.getServletContext ().getRealPath ("html/index.html"), "");
        resp.getWriter ().write (page);
    }
}
