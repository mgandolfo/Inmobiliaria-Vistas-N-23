package inmobiliaria23.accesoaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexion {

    public String url = "jdbc:mariadb://localhost/";
    public String bd = "inmobiliariagrupo23";
    public String user = "mgandolfo"; //o reemplaza con root
    public String pass = "utunu675ithi."; //o reemplazar con "" vacio
    public String driver = "org.mariadb.jdbc.Driver";
    public Connection cn = null;

    public static Connection conectar() {
        try {

            Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost/inmobiliariagrupo23", "mgandolfo", "utunu675ithi.");
            //System.out.println("Conectado");
            return cn;

        } catch (SQLException e) {
            System.out.println("Error en la conexion local " + e);
        }
        return (null);
    }

}
