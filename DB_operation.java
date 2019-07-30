package javaapplication14;

 
import java.sql.*;
public class DB_operation {
    private Connection con ;
    private Statement st ;
    private ResultSet rs;
    
    public Connection getCon(){
        try{
            String url =   "jdbc:mysql://localhost:3306/atm";
            String user = "root";
            String pass = "";
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection(url, user, pass);
           
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return con ;
    }
    
    public ResultSet Search (String sql){
        try {
            getCon();
            st =con.createStatement();
            rs = st.executeQuery(sql);
            
            
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return rs ;
    }
    
}
