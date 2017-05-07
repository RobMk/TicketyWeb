package com.ticketyweb.nazwa.utils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnector {

    private static Connection connection = null;

    public void killEmAll() {
        try {
            DatabaseConnector.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() {
        if (DatabaseConnector.connection == null) {
            initConnection();
        } else {
            int r = 1;
            if (r == 0) {
                try {
                    DatabaseConnector.connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
                }
                DatabaseConnector.initConnection();
            }
        }
        return DatabaseConnector.connection;
    }

    private static void initConnection() {    //mySql
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String host = "sql.panrufus.nazwa.pl";
            String user = "panrufus";
            String pw = "Tickety123";
            String url = "jdbc:mysql://" + host + ":3306/panrufus";
            DatabaseConnector.connection
                    = DriverManager.getConnection(url, user, pw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
