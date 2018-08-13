package com.java.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnectionToDatabase(){

        String url ="jdbc:mysql://localhost:3306/eventsnow";
        String user = "root";
        String password = "admin";

        Connection connection = null;

        try{
            Class.forName ("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection (url, user, password);

        } catch (ClassNotFoundException e) {
            System.out.println ("Where is your JDBC driver?" );
            e.printStackTrace ();
        } catch (SQLException e) {
            System.out.println ("Connection Failed! check output console" );
            e.printStackTrace ( );
        }

        if(connection != null){
            System.out.println ("Connection made in DB!" );
        }
        return connection;
    }
}
