package inmobiliaria23.accesoaDatos;

import inmobiliaria23.entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class propietarioData {

    private Connection con = null;

    public propietarioData() {
        con = conexion.conectar();
    }

    public void nuevoPropietario(Propietario propietario) {
        String sql = "insert into propietario (apellido, nombre, dni,tel, domicilio,estado)values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, propietario.getApellido());
            ps.setString(2, propietario.getNombre());
            ps.setInt(3, propietario.getDni());
            ps.setInt(4, propietario.getTel());
            ps.setString(5, propietario.getDomicilio());
            ps.setBoolean(6, propietario.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                propietario.setId_propietario(1);
                JOptionPane.showMessageDialog(null, "Propietario creado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario");
        }
    }

    public void bajaPropietario(int idPropietario) {
        try {
            // Actualizar el estado del propietario a 0 en la tabla Propietario
            String sqlPropietario = "UPDATE Propietario SET Estado = 0 WHERE idPropietario = ?";
            PreparedStatement psPropietario = con.prepareStatement(sqlPropietario);
            psPropietario.setInt(1, idPropietario);
            psPropietario.executeUpdate();

            // Actualizar el estado de los inmuebles asociados al propietario a 0 en la tabla Inmueble
            String sqlInmueble = "UPDATE Inmueble SET Estado = 0 WHERE idPropietario = ?";
            PreparedStatement psInmueble = con.prepareStatement(sqlInmueble);
            psInmueble.setInt(1, idPropietario);
            psInmueble.executeUpdate();
            System.out.println("Estado del propietario y sus inmuebles borrados correctamente.");
            // Cerrar los PreparedStatement
            psPropietario.close();
            psInmueble.close();

        } catch (SQLException ex) {
            System.out.println("Error al cambiar el estado: " + ex.getMessage());
        }

    }

    public void modificarPropietario(Propietario propietario) {
        String sql = "UPDATE propietario SET idPropietario=?,Apellido = ?, Nombre = ?, "
                + "Dni = ?, tel = ?, domicilio=?, estado=? WHERE idPropietario=?";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, propietario.getId_propietario());
            ps.setString(2, propietario.getApellido());
            ps.setString(3, propietario.getNombre());
            ps.setInt(4, propietario.getDni());
            ps.setInt(5, propietario.getTel());
            ps.setString(6, propietario.getDomicilio());
            ps.setBoolean(7, propietario.isEstado());
            ps.setInt(8, propietario.getId_propietario());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Propietario modificado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
    }

    public Propietario buscarPropietarioPorId(int id) {
        String sql = "SELECT apellido,nombre, dni,tel,domicilio,estado FROM propietario WHERE idPropietario=? ";
        Propietario propietario = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                propietario = new Propietario();
                propietario.setId_propietario(id);
                propietario.setApellido(rs.getString("apellido"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setTel(rs.getInt("Tel"));
                propietario.setDomicilio(rs.getString("Domicilio"));
                propietario.setEstado(rs.getBoolean("Estado"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe un Propietario con ese Id");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietario;
    }
    public Propietario buscarPropietarioPorDni(int dni) {
        String sql = "SELECT idPropietario,apellido,nombre, dni,tel,domicilio,estado FROM propietario WHERE dni=? ";
        Propietario propietario = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                propietario = new Propietario();
                propietario.setId_propietario(rs.getInt("IdPropietario"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setDni(rs.getInt("Dni"));
                propietario.setTel(rs.getInt("Tel"));
                propietario.setDomicilio(rs.getString("Domicilio"));
                propietario.setEstado(rs.getBoolean("Estado"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe un Propietario con ese Dni");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietario;
    }
    
    public ArrayList<Propietario> listarPropietarios() {
        ArrayList<Propietario> milista = new ArrayList<>();
        String sql = "SELECT * FROM propietario";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Propietario propietario = new Propietario();
                propietario.setId_propietario(rs.getInt("idPropietario"));
                propietario.setNombre(rs.getString("Apellido"));
                propietario.setApellido(rs.getString("Nombre"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setTel(rs.getInt("tel"));
                propietario.setDomicilio(rs.getString("Domicilio"));
                propietario.setEstado(rs.getBoolean("estado"));
                

                milista.add(propietario);

            }

            return milista;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo listar los propietarios " + "\n error:" + ex.getMessage());
            return milista;
        }

    }



}