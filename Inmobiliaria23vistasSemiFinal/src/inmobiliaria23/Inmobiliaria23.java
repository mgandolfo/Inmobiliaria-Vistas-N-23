package inmobiliaria23;

import inmobiliaria23.accesoaDatos.PropiedadInmuebleData;
import inmobiliaria23.accesoaDatos.conexion;
import inmobiliaria23.accesoaDatos.propietarioData;
import inmobiliaria23.entidades.PropiedadInmueble;
import inmobiliaria23.entidades.Propietario;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;

public class Inmobiliaria23 {

    public static void main(String[] args) {

        /*PropiedadInmuebleData BuscarporID = new PropiedadInmuebleData();
        BuscarporID.buscarInmuebleXid(5);
        if (BuscarporID != null) {
            System.out.println("ID: " + BuscarporID.listarInmuebles() + "\n");

        } else {
            System.out.println("No se encontró el ID");
        }*/
        //---------------------------------------------------------------------------
        /*Buscar segun los criterios multiples*/
 /*PropiedadInmuebleData inmueble = new PropiedadInmuebleData();
        PropiedadInmueble inmuebleEncontrado = inmueble.buscarInmueblePorCriterios("Casa", "Zona A", 200, 150000);
        if (inmuebleEncontrado != null) {
            System.out.println("ID: " + inmuebleEncontrado.getIdInmueble() + "\n Tipo Local: " + inmuebleEncontrado.getTipoDeLocal() + "\n Zona: " + inmuebleEncontrado.getZona() + "\n Superficie: " + inmuebleEncontrado.getSuperficie() + "\n Precio Base: " + inmuebleEncontrado.getPrecioTasado());
        } else {
            System.out.println("No se encontró el criterio deseado");*/
 /*try {
            PropiedadInmuebleData propiedadBuscada = new PropiedadInmuebleData();
            List<PropiedadInmueble> listarBuscado = propiedadBuscada.listarInmueblesPorCriterios("Casa", "Zona A", 200, 150000, 6);;
            //propiedadBuscada.buscarInmueblePorCriterios("Casa", "Zona A", 200, 150000);
            if (!listarBuscado.isEmpty()) {
                for (PropiedadInmueble propiedadinmueble : listarBuscado) {
                    System.out.println(propiedadinmueble.getIdInmueble() + "\n" + propiedadinmueble.getTipoDeLocal() + "\n");
                    System.out.println(propiedadinmueble.getZona() + "\n" + propiedadinmueble.getDireccion() + "\n");
                    System.out.println(propiedadinmueble.getPrecioTasado());
                    System.out.println("---------------------------------");

                }
            } else {
                System.out.println("No exite inmueble");
            }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, "error no se encuentra  propietario " + npe.getMessage());
        }*/
        try {
            PropiedadInmuebleData PrecioBase = new PropiedadInmuebleData();
            List<PropiedadInmueble> ListarPrecio = PrecioBase.listarInmueblesPorPrecioBaseEnRango(10000, 90000);
            if (!ListarPrecio.isEmpty()) {
                for (PropiedadInmueble propiedadinmueble : ListarPrecio) {
                    System.out.println("\nZona: " + propiedadinmueble.getZona() + "\nPrecio Base: " + propiedadinmueble.getPrecioTasado() + "\nDireccion: " + propiedadinmueble.getDireccion()
                    +"\nTipo Local: "+propiedadinmueble.getTipoDeLocal());
                    System.out.println("--------------------------------------");    
                }
                
            }

        } catch (NullPointerException npe) {

            JOptionPane.showMessageDialog(null, "No se encuentra el precio adecuado" + npe.getMessage());

        }

    }

}
