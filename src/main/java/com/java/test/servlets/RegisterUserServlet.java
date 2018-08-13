package com.java.test.servlets;

import com.java.test.beans.User;
import com.java.test.dao.ApplicationDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registerUser")
public class RegisterUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String username = req.getParameter ("name");
            String useremail = req.getParameter ("email");
            String usercurse = req.getParameter ("curse");
            String userinstitute = req.getParameter ("inst");
            String userpassword = req.getParameter ("password");
            String userpassword2 = req.getParameter ("password2");

            User user = null;
            String infoMessage = null;

        if (!(userpassword.equals (userpassword2))) {
            infoMessage = "As senhas inseridas não são iguais!!";

        } else {
            user = new User (username, useremail, usercurse, userinstitute, userpassword);

            ApplicationDao dao = new ApplicationDao ( );
            int rows = dao.registerUser (user);


            if (rows == 0) {
                infoMessage = "Desculpe, um erro correu!, ou usuario já cadastrado";
            } else {
                infoMessage = "Usuario registrado com sucesso!";
            }
        }
        req.setAttribute ("error2", infoMessage);
        req.getRequestDispatcher ("html/register.jsp").forward (req, resp);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher ("html/register.jsp").forward (req, resp);
    }
}