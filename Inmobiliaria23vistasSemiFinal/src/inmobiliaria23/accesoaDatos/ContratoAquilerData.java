package inmobiliaria23.accesoaDatos;

import inmobiliaria23.entidades.ContratoAlquiler;
import inmobiliaria23.entidades.Inquilino;
import inmobiliaria23.entidades.PropiedadInmueble;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ContratoAquilerData {

    private Connection con = null;
    private PropiedadInmuebleData pid = new PropiedadInmuebleData();
    private InquilinoData id = new InquilinoData();

    public ContratoAquilerData() {
        con = conexion.conectar();
    }

    public void crearContrato(ContratoAlquiler contrato) {
        String sql = "INSERT INTO contrato_aquiler(FechaInicio, FechaFin, MontoAlquilerPesos, Detalles, Estado, IdInmueble, IdInquilino) VALUES (?,?,?,?,?,?,?) ";
//        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(2, Date.valueOf(contrato.getFechaFinal()));
            ps.setDouble(3, contrato.getMontoAlquilerPesos());
            ps.setString(4, contrato.getDetalles());
            ps.setString(5, contrato.getEstado());
            ps.setInt(6, contrato.getIdpropiedad().getIdInmueble());
            ps.setInt(7, contrato.getInquilino().getId_inquilino());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                contrato.setId_contrato(1);
                JOptionPane.showMessageDialog(null, "contrato creado correctamente");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al generar contrato" + ex.getMessage());
        }

    }

    public void rescindirContrato(int id) {
        String sql = "UPDATE contrato_aquiler SET Estado = 0 WHERE idContratoAlquiler = ? ";
        PreparedStatement ps;
        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int actualizado = ps.executeUpdate();
            if (actualizado > 0) {
                JOptionPane.showMessageDialog(null, "contrato rescindido con el id especificado");
            } else {
                JOptionPane.showMessageDialog(null, "no se pudo encontrar contrato con el id especificado");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al conectar con inmobiliaria23" + ex.getMessage());
        }

    }

    public void renovarContrato(LocalDate fechaInicio, LocalDate fechaFin, Double montoNuevo, int id) {

        String sql = "UPDATE contrato_aquiler SET Estado = 2,FechaInicio = ?, FechaFin= ?, MontoAlquilerPesos= ? WHERE idContratoAlquiler = ? AND FechaFin < NOW()  ";
        PreparedStatement ps;
        try {

            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaInicio));
            ps.setDate(2, Date.valueOf(fechaFin));
            ps.setDouble(3, montoNuevo);
            ps.setInt(4, id);

            int actualizado = ps.executeUpdate();
            if (actualizado > 0) {
                JOptionPane.showMessageDialog(null, "contrato RENOVADO");
            } else {
                JOptionPane.showMessageDialog(null, "no se pudo encontrar contrato con el id especificado");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al conectar con inmobiliaria23" + ex.getMessage());
        }

    }

    public List<ContratoAlquiler> listarContratosVigentes(int estado) {
        String sql = " SELECT * FROM contrato_aquiler WHERE Estado = 1  ";
        ArrayList<ContratoAlquiler> contratos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ContratoAlquiler ca = new ContratoAlquiler();
                ca.setId_contrato(rs.getInt("idContratoAlquiler"));
                Inquilino soloid = id.buscarInquilinoPorid(rs.getInt("IdInquilino"));
                ca.setInquilino(soloid);
                PropiedadInmueble idsolo = pid.buscarInmuebleXid(rs.getInt("IdInmueble"));
                ca.setIdpropiedad(idsolo);
                ca.setFechaInicio(rs.getDate("FechaInicio").toLocalDate());
                ca.setFechaFinal(rs.getDate("FechaFin").toLocalDate());
                ca.setMontoAlquilerPesos(rs.getDouble("MontoAlquilerPesos"));
                ca.setDetalles(rs.getString("Detalles"));
                ca.setEstado(rs.getString("Estado"));
                contratos.add(ca);
            }

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ContratoAquilerData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contratos;
    }

}
