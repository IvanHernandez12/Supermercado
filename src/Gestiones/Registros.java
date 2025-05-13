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

     public boolean insertarProveedor(String Nombre, String ubicacion, int id, int telefono)
     {
          String sql = "INSERT INTO Tb_proveedores (Nombre, ubicacion, id, telefono) VALUES (?, ?, ?, ?)";
          boolean success = false;
          try (Connection conn = Conexion.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql))
          {

               stmt.setString(1, Nombre);
               stmt.setString(2, ubicacion);
               stmt.setInt(3, id);
               stmt.setInt(4, telefono);

               int rowsAffected = stmt.executeUpdate();
               success = rowsAffected > 0;

          } catch (SQLException e)
          {
               System.out.println("Error para insertar");
               e.printStackTrace();
          }
          return success;
     }

     public boolean insertarEmpleados(String nombre, int id, int telefono)
     {

          String sql = "INSERT INTO Tb_empleados (Nombre, id, telefono) VALUES (?, ?, ?)";
          boolean success = false;
          try (Connection conn = Conexion.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql))
          {
               stmt.setString(1, nombre);
               stmt.setInt(2, id);
               stmt.setInt(3, telefono);
          } catch (SQLException e)
          {
               System.out.println("Error para insertar");
               e.printStackTrace();
          }

          return success;
     }

     public boolean CrearVenta(String nombreP, int idVenta, String Status)
     {
          String sql = "INSERT INTO Tb_ventas (id,NombreP,status) VALUES (?,?,?)";
          boolean success = false;

          try (Connection conn = Conexion.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql))
          {
               stmt.setString(1, nombreP);
               stmt.setInt(2, idVenta);
               stmt.setString(3, Status);
          } catch (SQLException e)
          {
               System.out.println("Error para insertar");
               e.printStackTrace();
          }

          return success;
     }

}
