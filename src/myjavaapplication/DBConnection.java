/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavaapplication;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MAXPRO
 */
public class DBConnection {
    
    public static void main(String args[])
    {
        getConnection();
        Connection con = DBConnection.getConnection();
        if(con!= null){
            System.out.println("Database Connected successfully");
        }else{
            System.out.println("Connection Failed");
        }
    }
    
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/librarydb",
                "root",
                ""
            );
            System.out.println("connection don");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
}
