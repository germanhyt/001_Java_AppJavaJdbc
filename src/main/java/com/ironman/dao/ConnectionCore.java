package com.ironman.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCore {

    public Connection getConnection() throws Exception {
        // Attributes
        String hostname = "dpg-cpa0r9tds78s73cp2ueg-a.oregon-postgres.render.com";
        String port = "5432";
        String dbName = "restaurant_management_db";
        String userName = "developer";
        String password = "Uj65aOw7qX1OqalviBjSpn4EPiubf468";

        //- Process

        // Load Driver
        Class.forName("org.postgresql.Driver");

        // URL Connection
        String url = "jdbc:postgresql://" + hostname + ":" + port + "/" + dbName;

        //Result
        return DriverManager.getConnection(url, userName, password);

    }
}
