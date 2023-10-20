/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria23.vistas;

import inmobiliaria23.entidades.InternaljFrameImagen;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Administrador
 */
public class MenuView extends javax.swing.JFrame {

    int xMouse, yMouse;
    private String users;

    public MenuView() {
        initComponents();
        this.setSize(1024, 768);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (int) (screenSize.getWidth() - this.getWidth()) / 2;
        int centerY = (int) (screenSize.getHeight() - this.getHeight()) / 2;
        this.setLocation(centerX, centerY);
    }

    public void setUsuarios(String users) {
        this.users = users;
        //AccesoUsuario.setText(users);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/inmobiliaria23/recursos/FondoFinalINTERNA_1.jpg"));
        Image miImagen=icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }

        };
        jPanelMenuPrincipal = new javax.swing.JPanel();
        BtnRegistrar = new inmobiliaria23.entidades.BotonNegro();
        BtnRegistrar1 = new inmobiliaria23.entidades.BotonNegro();
        botonNegro2 = new inmobiliaria23.entidades.BotonNegro();
        botonNegro3 = new inmobiliaria23.entidades.BotonNegro();
        botonNegro4 = new inmobiliaria23.entidades.BotonNegro();
        botonRojo1 = new inmobiliaria23.entidades.BotonRojo();
        header = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenuPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        jPanelMenuPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanelMenuPrincipal.setInheritsPopupMenu(true);
        jPanelMenuPrincipal.setOpaque(false);
        jPanelMenuPrincipal.setPreferredSize(new java.awt.Dimension(512, 50));
        jPanelMenuPrincipal.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        BtnRegistrar.setBorder(null);
        BtnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/registrar-usuario25px.png"))); // NOI18N
        BtnRegistrar.setText("PROPIETARIOS");
        BtnRegistrar.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        BtnRegistrar.setPreferredSize(new java.awt.Dimension(120, 28));
        BtnRegistrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/registrar-usuario25px.png"))); // NOI18N
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });
        jPanelMenuPrincipal.add(BtnRegistrar);

        BtnRegistrar1.setBorder(null);
        BtnRegistrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/registrar-usuario25px.png"))); // NOI18N
        BtnRegistrar1.setText("INQUILINOS");
        BtnRegistrar1.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        BtnRegistrar1.setPreferredSize(new java.awt.Dimension(120, 28));
        BtnRegistrar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/registrar-usuario25px.png"))); // NOI18N
        BtnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrar1ActionPerformed(evt);
            }
        });
        jPanelMenuPrincipal.add(BtnRegistrar1);

        botonNegro2.setBorder(null);
        botonNegro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/inmuebles-menu.png"))); // NOI18N
        botonNegro2.setText(" INMUEBLES");
        botonNegro2.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        botonNegro2.setPreferredSize(new java.awt.Dimension(120, 28));
        botonNegro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNegro2ActionPerformed(evt);
            }
        });
        jPanelMenuPrincipal.add(botonNegro2);

        botonNegro3.setBorder(null);
        botonNegro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/contract-25.png"))); // NOI18N
        botonNegro3.setText(" CONTRATOS");
        botonNegro3.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        botonNegro3.setPreferredSize(new java.awt.Dimension(120, 28));
        botonNegro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNegro3ActionPerformed(evt);
            }
        });
        jPanelMenuPrincipal.add(botonNegro3);

        botonNegro4.setBorder(null);
        botonNegro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/lupa-25.png"))); // NOI18N
        botonNegro4.setText(" BUSCADOR");
        botonNegro4.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        botonNegro4.setPreferredSize(new java.awt.Dimension(120, 28));
        botonNegro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNegro4ActionPerformed(evt);
            }
        });
        jPanelMenuPrincipal.add(botonNegro4);

        botonRojo1.setBorder(null);
        botonRojo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/exits.png"))); // NOI18N
        botonRojo1.setText("SALIR ");
        botonRojo1.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        botonRojo1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonRojo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRojo1ActionPerformed(evt);
            }
        });
        jPanelMenuPrincipal.add(botonRojo1);

        header.setBackground(new java.awt.Color(0, 0, 0));
        header.setOpaque(false);
        header.setPreferredSize(new java.awt.Dimension(250, 40));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        escritorio.setLayer(jPanelMenuPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(header, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jPanelMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(720, Short.MAX_VALUE))
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed

        //escritorio.removeAll();
        escritorio.repaint();
        registroPropietario Rp = new registroPropietario();
        Rp.setVisible(true);
        escritorio.add(Rp);
        escritorio.moveToFront(Rp);


    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void botonRojo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRojo1ActionPerformed
        mensajeOKyCancel msSalir = new mensajeOKyCancel(this, true);
        msSalir.setVisible(true);
    }//GEN-LAST:event_botonRojo1ActionPerformed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void BtnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrar1ActionPerformed
        //escritorio.removeAll();
        escritorio.repaint();
        registroInquilinoyGarante Rp = new registroInquilinoyGarante();
        Rp.setVisible(true);
        escritorio.add(Rp);
        escritorio.moveToFront(Rp);
    }//GEN-LAST:event_BtnRegistrar1ActionPerformed

    private void botonNegro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNegro2ActionPerformed
        //escritorio.removeAll();
        escritorio.repaint();
        registroInmueble Rp = new registroInmueble();
        Rp.setVisible(true);
        escritorio.add(Rp);
        escritorio.moveToFront(Rp);
    }//GEN-LAST:event_botonNegro2ActionPerformed

    private void botonNegro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNegro3ActionPerformed
        //escritorio.removeAll();
        escritorio.repaint();
        contratoDeAlquiler Rp = new contratoDeAlquiler();
        Rp.setVisible(true);
        escritorio.add(Rp);
        escritorio.moveToFront(Rp);
    }//GEN-LAST:event_botonNegro3ActionPerformed

    private void botonNegro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNegro4ActionPerformed
        //escritorio.removeAll();
        escritorio.repaint();
        buscadorInmuebles Rp = new buscadorInmuebles();
        Rp.setVisible(true);
        escritorio.add(Rp);
        escritorio.moveToFront(Rp);
    }//GEN-LAST:event_botonNegro4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private inmobiliaria23.entidades.BotonNegro BtnRegistrar;
    private inmobiliaria23.entidades.BotonNegro BtnRegistrar1;
    private inmobiliaria23.entidades.BotonNegro botonNegro2;
    private inmobiliaria23.entidades.BotonNegro botonNegro3;
    private inmobiliaria23.entidades.BotonNegro botonNegro4;
    private inmobiliaria23.entidades.BotonRojo botonRojo1;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanelMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
