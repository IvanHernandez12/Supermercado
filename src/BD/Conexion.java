package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{

     private static final String URL = "jdbc:mysql://localhost:3306/bd_supermercado";
     private static final String USER = "root";
     private static final String PASSWORD = "Kipmm079";

     public static Connection getConnection() throws SQLException
     {
          return DriverManager.getConnection(URL, USER, PASSWORD);
     }
     
    
}
