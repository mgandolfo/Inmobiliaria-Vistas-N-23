package inmobiliaria23.entidades;

import javax.swing.JInternalFrame;

public class InternaljFrameImagen extends JInternalFrame {

    private panelesImagenes pi = new panelesImagenes();

    public InternaljFrameImagen() {
        
        this.setContentPane(pi);
        
    }
    
    public void setImage(String nombreImagen){
        
        pi.setImage(nombreImagen);
        
    }

}
