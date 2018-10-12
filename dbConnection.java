
package dbutil;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbConnection {
   // private static final String USERNAME="yash";
    //private static final String PASSWORD="12345";
    //private static final String CONN="jdbc:mysql://localhost/schoolmanagement";
    private static final String SQCONN="jdbc:sqlite:schoolsystem.sqlite";
    
    
    
   public static Connection getConnection() throws SQLException{
       try{
           Class.forName("org.sqlite.JDBC");
           return DriverManager.getConnection("jdbc:sqlite:schoolsystem.sqlite");
       }
       catch(ClassNotFoundException|SQLException ex){
           ex.printStackTrace();
           
       }
       return null;
   }
    
}
