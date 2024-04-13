/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author Sneha
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","123456");
            return con;
        }
        catch(SQLException e){
            System.out.println(e);
            return null;
            
        }
    }
   
}
