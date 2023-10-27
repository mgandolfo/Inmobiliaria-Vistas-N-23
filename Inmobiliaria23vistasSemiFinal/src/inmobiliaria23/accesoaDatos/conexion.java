package inmobiliaria23.accesoaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexion {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "inmobiliaria2023fin";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    conexion() {
    }

    public static Connection conectar() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
                //JOptionPane.showMessageDialog(null,"Conectado");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el driver" + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos" + ex.getMessage());
            }

        }
        return connection;
    }

}
