/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author My
 */
public class ConnectionDB
{
private Connection Database;
public ConnectionDB()
{
        
            try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Database =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "DELETEHB", "123");
            }catch(Exception ex){System.out.println(ex);}
        }
public Connection getConn() {
        return Database;
    }
}

