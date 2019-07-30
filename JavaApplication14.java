package javaapplication14;

import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
public class JavaApplication14 { 
    public static void main(String[] args) throws Exception {
        /////////////////////////////////////////////////////// Test insert to database without forms : 
    Connection conn=null;
        try {
Class.forName("com.mysql.jdbc.Driver");
 
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
           Statement st=conn.createStatement();
            String ServerId="4";
            String ClientId = "1234";

          String insert="INSERT INTO server VALUES('"+ServerId+"','"+ClientId+"')";
      st.executeUpdate(insert);
        } catch (SQLException ex) {
        ex.printStackTrace();
                  }


 
    
    
    
    }
    
}