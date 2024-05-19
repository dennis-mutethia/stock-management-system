/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author vinayak
 */
public class DBConnect {
    static Connection ConnectDb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Connection con;
    private Statement st;
    private ResultSet rs;
   
    @SuppressWarnings({"BroadCatchBlock", "TooBroadCatch"})
    public DBConnect(){
    try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          con = DriverManager.getConnection(
                    "jdbc:mysql://"
                            + Init.APPLICATION_PROPERTIES.getProperty("db_host")+":"
                            + Init.APPLICATION_PROPERTIES.getProperty("db_port")+"/" 
                            + Init.APPLICATION_PROPERTIES.getProperty("db_name"),
                    Init.APPLICATION_PROPERTIES.getProperty("db_user"),
                    Init.APPLICATION_PROPERTIES.getProperty("db_user_password")
          );
                  
          //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_stock","root","");
          st = con.createStatement();
    
    }catch(Exception e){System.out.println("Error"+e);}
    
    } 
}
