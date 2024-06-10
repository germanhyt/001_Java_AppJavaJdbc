package com.ironman;

import com.ironman.entity.Category;
import dao.ConnectionCore;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ConnectionCore connection= new ConnectionCore();
        connection.getConnection();

        System.out.println("Connection Successfull!!");
    }
}