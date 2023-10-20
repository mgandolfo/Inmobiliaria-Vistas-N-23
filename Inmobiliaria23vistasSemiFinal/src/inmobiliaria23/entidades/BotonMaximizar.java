package inmobiliaria23.entidades;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class BotonMaximizar extends JButton {

    public BotonMaximizar() {
        this.setContentAreaFilled(false);
        this.setForeground(Color.WHITE);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //this.setBackground(Color.blue);

    }

    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Color colores = Color.decode("#000000");
        g2.setPaint(new GradientPaint(0, 0, colores, 0, this.getHeight(), colores)); // Cambia los colores a rojo
        g2.fillRect(0, 0, this.getWidth(), this.getHeight()); // Utiliza fillRect para un fondo cuadrado
        g2.dispose();
        super.paint(grphcs);
    }

}
