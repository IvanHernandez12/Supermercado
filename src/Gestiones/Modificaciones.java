package Gestiones;

import BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Modificaciones
{

     public void ModificacionesP(int id, String nombre, double costo, String descripcion)
     {
          String sql = "UPDATE Tb_productos SET Nombre = ?, costo = ?, WHERE id = ?";

          try (Connection conn = Conexion.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql))
          {

               stmt.setString(1, nombre);
               stmt.setDouble(2, costo);
               stmt.setString(3, descripcion);
               stmt.setInt(4, id);

               int filasAfectadas = stmt.executeUpdate();
               System.out.println(filasAfectadas + " fila(s) actualizada(s)");

          } catch (SQLException e)
          {
               System.err.println("Error al actualizar producto:");
               e.printStackTrace();
          }
     }
}
