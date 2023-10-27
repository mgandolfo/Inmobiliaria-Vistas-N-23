package inmobiliaria23.accesoaDatos;

import static inmobiliaria23.accesoaDatos.conexion.conectar;
import inmobiliaria23.vistas.MensajeEmergentesAdvertencias;
import inmobiliaria23.vistas.mensajeCorrecto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class usuarioData {

    public void accesoUsuario(String user, String pass) {

        conexion db = new conexion();
        String usuario = null;
        String contrasena = null;
        try {
            Connection cn = conectar();
            
            String sql = "SELECT usuario, contrasena FROM login";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = rs.getString(1);
                contrasena = rs.getString(2);

            } else if (!user.equals(usuario) || pass.equals(contrasena)) {
                String mensaje = "Bienvenidos a nuestra aplicación " + usuario;
                mensajeCorrecto ms = new mensajeCorrecto(null, true);
                ms.textoMensaje(mensaje);
                ms.setVisible(true);

            } else {

                String mensaje = "Usuario o Contraseña Incorrecto!!";
                MensajeEmergentesAdvertencias ms = new MensajeEmergentesAdvertencias(null, true);
                ms.TextoMensaje(mensaje);
                ms.setVisible(true);

            }

        } catch (Exception es) {

            JOptionPane.showMessageDialog(null, "error" + es.getMessage());

        }
    }

}
