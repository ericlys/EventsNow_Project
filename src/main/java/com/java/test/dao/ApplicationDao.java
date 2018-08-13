package com.java.test.dao;

import com.java.test.beans.Event;
import com.java.test.beans.User;

import java.sql.*;

public class ApplicationDao {

    public int registerUser (User user){
        int rowAffected = 0;

        try{
            Connection connection = DBConnection.getConnectionToDatabase();

            String insertQuery = " insert into users values (?,?,?,?,?)";


            PreparedStatement statement = connection.prepareStatement (insertQuery);
            statement.setString (1, user.getUsername ());
            statement.setString (2, user.getEmail ());
            statement.setString (3, user.getCurse ());
            statement.setString (4, user.getInstitute ());
            statement.setString (5, user.getPassword ());


            rowAffected = statement.executeUpdate ();


        }catch (SQLException exeption){
            exeption.printStackTrace ();
        }
        return rowAffected;
    }

    public Boolean validateUser( String email, String password){
        boolean isValidUser = false;

        try{
            Connection connection = DBConnection.getConnectionToDatabase ();

            String sql = "select * from users where email = ? and password = ?";

            PreparedStatement statement = connection.prepareStatement (sql);
            statement.setString (1, email);
            statement.setString (2, password);

            ResultSet Set = statement.executeQuery ();
            while (Set.next ()){
                isValidUser = true;
            }


        }catch (Exception e){
            System.out.println (e );
        }
        return isValidUser;
    }

    public User getProfileDetails(String username){
        User user = null;
        try {
            Connection connection = DBConnection.getConnectionToDatabase ();

            String sql = " select * from users where username = ?";
            PreparedStatement statement = connection.prepareStatement (sql);
            statement.setString (1, username);

            ResultSet set = statement.executeQuery ();
            while(set.next ()){
                user = new User ();
                user.setUsername (set.getString ("username"));
                user.setEmail (set.getString ("email"));
                user.setCurse (set.getString ("curse"));
                user.setInstitute (set.getString ("institute"));
                user.setPassword (set.getString ("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace ( );
        }
        return user;

    }

    public int registerEvent(Event event){
        int rowAffected = 0;
        try {
            Connection connection = DBConnection.getConnectionToDatabase ();

            String insertQuery = "insert into events(title, startdate, finaldate, theme, latitude, longitude, address, mail_user) " +
                    "values (?,?,?,?,?,?,?,?)";
            PreparedStatement sta = connection.prepareStatement (insertQuery);
            sta.setString (1, event.getTitle ());
            sta.setDate (2, (Date) event.getStartDate ());
            sta.setDate (3, (Date) event.getFinalDate ());
            sta.setString (4, event.getTheme ());
            sta.setFloat (5, event.getLatitude ());
            sta.setFloat (6, event.getLongitude ());
            sta.setString (7, event.getAddress());
            sta.setString (8, event.getUserMail ());

            rowAffected = sta.executeUpdate ();

        }catch (SQLException ex){
            ex.printStackTrace ();
        }

        return rowAffected;
    }
}
