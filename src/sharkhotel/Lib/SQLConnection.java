/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharkhotel.Lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Orics
 */
public class SQLConnection {
    private static String connectString;
    private static String username;
    private static String password;

    public static Connection getConnection(){
        try {
            connectString = "jdbc:sqlserver://localhost\\DESKTOP-EJBMRCJ:1433;databaseName=hotel";
            username = "sa";
            password = "123456";
            return DriverManager.getConnection(connectString, username, password);
        } catch (SQLException ex) {
            return null;
        }
    } 
    
    public static void Test(){
        if(getConnection()!= null)
            System.out.println("Connect OK");
        else
            System.out.println("Connect faild");
    }
}