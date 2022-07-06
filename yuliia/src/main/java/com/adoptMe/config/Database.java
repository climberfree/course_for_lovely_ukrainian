package com.adoptMe.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Connection connection;

    private Database(){
    }

    public static Connection getConnection(){
        if(connection == null){
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adoptme", "yulia" , "yulia");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }

    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}