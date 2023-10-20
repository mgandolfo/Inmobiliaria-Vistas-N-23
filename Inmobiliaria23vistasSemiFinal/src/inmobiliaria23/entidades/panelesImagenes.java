package inmobiliaria23.entidades;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class panelesImagenes extends JPanel {
    
    private Image imagen;
    
    public panelesImagenes() {
        imagen = null;
    }
    
    public panelesImagenes(String nombreImagen) {
        
        if (nombreImagen != null) {
            imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
            
        }
        
    }
    
    public void setImage(String nombreImagen) {
        if (nombreImagen != null) {
            imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
            
        } else {
            
            imagen = null;
            
        }
        repaint();
        
    }
    
    @Override  //es abstracto
    public void paint(Graphics g) {
        if (imagen != null) {
            
            g.drawImage(imagen, 0, 0, this.getWidth(), this.getHeight(), this);
            this.setOpaque(false);
        }else{
            this.setOpaque(true);
        }
        
        super.paint(g);
        
    }
    
}
