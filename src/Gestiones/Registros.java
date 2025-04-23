package Gestiones;

import BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registros
{

     public boolean insertarProducto(String nombre, double precio, int id)
     {
          String sql = "INSERT INTO Tb_productos (Nombre, costo, id) VALUES (?, ?, ?)";
          boolean success = false;

          try (Connection conn = Conexion.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql))
          {

               stmt.setString(1, nombre);
               stmt.setDouble(2, precio);
               stmt.setInt(3, id);

               int filasAfectadas = stmt.executeUpdate();
               success = filasAfectadas > 0;

          } catch (SQLException e)
          {
               System.err.println("Error al insertar producto:");
               e.printStackTrace();
          }
          return success;
     }
     
}

