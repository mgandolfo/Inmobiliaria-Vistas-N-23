package inmobiliaria23.entidades;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class BotonVerde extends JButton {

    private boolean mouseSobreElBoton = false;

    public BotonVerde() {
        this.setContentAreaFilled(false);
        this.setForeground(Color.WHITE);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Agregar un MouseListener para detectar cuando el mouse pasa sobre el botón
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseSobreElBoton = true;
                repaint(); // Redibuja el botón para cambiar el color
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseSobreElBoton = false;
                repaint(); // Redibuja el botón para restaurar el color original
            }
        });
    }

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Color colores;

        if (mouseSobreElBoton) {
            colores = Color.decode("#339933"); // Cambia el color cuando el mouse está sobre el botón
        } else {
            colores = Color.decode("#5cb85c");
        }

        g2.setPaint(new GradientPaint(0, 0, colores, 0, this.getHeight(), colores));
        g2.fillRect(0, 0, this.getWidth(), this.getHeight());
        g2.dispose();
        super.paint(grphcs);
    }
}

