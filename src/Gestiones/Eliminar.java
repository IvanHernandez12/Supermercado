package Gestiones;

import BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Eliminar
{

     public void EliminarP(int id)
     {
          String sql = "DELETE FROM Tb_productos WHERE id = ?";

          try (Connection conn = Conexion.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql))
          {

               stmt.setInt(1, id);

               int filasAfectadas = stmt.executeUpdate();
               System.out.println(filasAfectadas + " fila(s) eliminada(s)");

          } catch (SQLException e)
          {
               System.err.println("Error al eliminar producto:");
               e.printStackTrace();
          }
     }
}
