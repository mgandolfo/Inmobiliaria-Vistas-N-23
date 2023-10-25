package inmobiliaria23.vistas;

import inmobiliaria23.entidades.InternaljFrameImagen;
import inmobiliaria23.entidades.panelesImagenes;
import java.awt.Image;
import javax.swing.JTextField;

/**
 *
 * @author Administrador
 */
public class buscadorInmuebles extends InternaljFrameImagen {

    private panelesImagenes pi = new panelesImagenes();
    //private JTextField TxtTipo2 = new JTextField();

    public buscadorInmuebles() {
        initComponents();
        this.setSize(1024, 770);
        this.setImage("/inmobiliaria23/recursos/fondoMadera.jpg");
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextID = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        DatosInquilinos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_id_Inmueble = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Local_Inmueble = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarInmuebles = new inmobiliaria23.entidades.BotonVerde();
        botonAzul1 = new inmobiliaria23.entidades.BotonAzul();
        DatosInquilinos1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_Zona_Inmueble = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_Otros_Inmueble = new javax.swing.JTextField();
        DatosInquilinos2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_Superficie_Inmueble = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_Valor_Inmueble = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ListadInmuebles = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListadoInmuebles = new javax.swing.JTable();
        DatosInquilinos3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        TxtTipo = new javax.swing.JTextField();

        jTextID.setBackground(new java.awt.Color(236, 226, 200));
        jTextID.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jTextID.setForeground(new java.awt.Color(51, 51, 51));
        jTextID.setText(" ");
        jTextID.setBorder(null);
        jTextID.setPreferredSize(new java.awt.Dimension(165, 30));

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Roboto Bk", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 51));
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/seek.png"))); // NOI18N
        Titulo.setText("Buscador de Inmuebles Disponibles");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        DatosInquilinos.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        DatosInquilinos.setOpaque(false);
        DatosInquilinos.setPreferredSize(new java.awt.Dimension(500, 390));
        DatosInquilinos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel1.setText("ID:");
        DatosInquilinos.add(jLabel1);

        txt_id_Inmueble.setBackground(new java.awt.Color(236, 226, 200));
        txt_id_Inmueble.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        txt_id_Inmueble.setForeground(new java.awt.Color(51, 51, 51));
        txt_id_Inmueble.setText(" ");
        txt_id_Inmueble.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray));
        txt_id_Inmueble.setPreferredSize(new java.awt.Dimension(165, 30));
        txt_id_Inmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_InmuebleActionPerformed(evt);
            }
        });
        DatosInquilinos.add(txt_id_Inmueble);

        jLabel2.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel2.setText("Uso de Local:");
        DatosInquilinos.add(jLabel2);

        txt_Local_Inmueble.setBackground(new java.awt.Color(236, 226, 200));
        txt_Local_Inmueble.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        txt_Local_Inmueble.setForeground(new java.awt.Color(51, 51, 51));
        txt_Local_Inmueble.setText(" ");
        txt_Local_Inmueble.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray));
        txt_Local_Inmueble.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos.add(txt_Local_Inmueble);

        getContentPane().add(DatosInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, 140));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        btnBuscarInmuebles.setBorder(null);
        btnBuscarInmuebles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/buscar-interna.png"))); // NOI18N
        btnBuscarInmuebles.setText("BUSCAR");
        btnBuscarInmuebles.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        btnBuscarInmuebles.setPreferredSize(new java.awt.Dimension(120, 30));
        btnBuscarInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarInmueblesActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarInmuebles);

        botonAzul1.setBorder(null);
        botonAzul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inmobiliaria23/recursos/exits.png"))); // NOI18N
        botonAzul1.setText(" SALIR");
        botonAzul1.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        botonAzul1.setPreferredSize(new java.awt.Dimension(120, 30));
        botonAzul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAzul1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonAzul1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 1000, 50));

        DatosInquilinos1.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        DatosInquilinos1.setOpaque(false);
        DatosInquilinos1.setPreferredSize(new java.awt.Dimension(500, 390));
        DatosInquilinos1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel12.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel12.setText("Zona:");
        DatosInquilinos1.add(jLabel12);

        txt_Zona_Inmueble.setBackground(new java.awt.Color(236, 226, 200));
        txt_Zona_Inmueble.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        txt_Zona_Inmueble.setForeground(new java.awt.Color(51, 51, 51));
        txt_Zona_Inmueble.setText(" ");
        txt_Zona_Inmueble.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray));
        txt_Zona_Inmueble.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos1.add(txt_Zona_Inmueble);

        jLabel13.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel13.setText("Otros:");
        DatosInquilinos1.add(jLabel13);

        txt_Otros_Inmueble.setBackground(new java.awt.Color(236, 226, 200));
        txt_Otros_Inmueble.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        txt_Otros_Inmueble.setForeground(new java.awt.Color(51, 51, 51));
        txt_Otros_Inmueble.setText(" ");
        txt_Otros_Inmueble.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray));
        txt_Otros_Inmueble.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos1.add(txt_Otros_Inmueble);

        getContentPane().add(DatosInquilinos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 180, 140));

        DatosInquilinos2.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        DatosInquilinos2.setOpaque(false);
        DatosInquilinos2.setPreferredSize(new java.awt.Dimension(500, 390));
        DatosInquilinos2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel8.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel8.setText("Superficie Mínima:");
        DatosInquilinos2.add(jLabel8);

        txt_Superficie_Inmueble.setBackground(new java.awt.Color(236, 226, 200));
        txt_Superficie_Inmueble.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        txt_Superficie_Inmueble.setForeground(new java.awt.Color(51, 51, 51));
        txt_Superficie_Inmueble.setText(" ");
        txt_Superficie_Inmueble.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray));
        txt_Superficie_Inmueble.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos2.add(txt_Superficie_Inmueble);

        jLabel11.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel11.setText("Valor Estimado:");
        DatosInquilinos2.add(jLabel11);

        txt_Valor_Inmueble.setBackground(new java.awt.Color(236, 226, 200));
        txt_Valor_Inmueble.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        txt_Valor_Inmueble.setForeground(new java.awt.Color(51, 51, 51));
        txt_Valor_Inmueble.setText(" ");
        txt_Valor_Inmueble.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray));
        txt_Valor_Inmueble.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos2.add(txt_Valor_Inmueble);

        getContentPane().add(DatosInquilinos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 180, 140));

        jLabel14.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel14.setText("Listados Inmuebles:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jTableListadoInmuebles.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        jTableListadoInmuebles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableListadoInmuebles);

        javax.swing.GroupLayout ListadInmueblesLayout = new javax.swing.GroupLayout(ListadInmuebles);
        ListadInmuebles.setLayout(ListadInmueblesLayout);
        ListadInmueblesLayout.setHorizontalGroup(
            ListadInmueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadInmueblesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                .addContainerGap())
        );
        ListadInmueblesLayout.setVerticalGroup(
            ListadInmueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadInmueblesLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(ListadInmuebles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 960, 290));

        DatosInquilinos3.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        DatosInquilinos3.setOpaque(false);
        DatosInquilinos3.setPreferredSize(new java.awt.Dimension(500, 390));
        DatosInquilinos3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel15.setFont(new java.awt.Font("Roboto Cn", 1, 18)); // NOI18N
        jLabel15.setText("Tipo:");
        DatosInquilinos3.add(jLabel15);

        TxtTipo.setBackground(new java.awt.Color(236, 226, 200));
        TxtTipo.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        TxtTipo.setForeground(new java.awt.Color(51, 51, 51));
        TxtTipo.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray));
        TxtTipo.setPreferredSize(new java.awt.Dimension(165, 30));
        DatosInquilinos3.add(TxtTipo);

        getContentPane().add(DatosInquilinos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 190, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAzul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAzul1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_botonAzul1ActionPerformed

    private void txt_id_InmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_InmuebleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_InmuebleActionPerformed

    private void btnBuscarInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInmueblesActionPerformed

        
        mensajeBuscador msBuscar = new mensajeBuscador(null, true);
        //String text = msBuscar.getName();
        msBuscar.BuscarPorTipo();
        msBuscar.setVisible(true);

        if (msBuscar.getTitle() == "casa") {
            TxtTipo.getText();

        } else {
            String mensaje = "No existe el TIPO";
            MensajeEmergentesAdvertencias ms = new MensajeEmergentesAdvertencias(null, true);
            ms.TextoMensaje(mensaje);
            ms.setVisible(true);

        }

    }//GEN-LAST:event_btnBuscarInmueblesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosInquilinos;
    private javax.swing.JPanel DatosInquilinos1;
    private javax.swing.JPanel DatosInquilinos2;
    private javax.swing.JPanel DatosInquilinos3;
    private javax.swing.JPanel ListadInmuebles;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField TxtTipo;
    private inmobiliaria23.entidades.BotonAzul botonAzul1;
    private inmobiliaria23.entidades.BotonVerde btnBuscarInmuebles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListadoInmuebles;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField txt_Local_Inmueble;
    private javax.swing.JTextField txt_Otros_Inmueble;
    private javax.swing.JTextField txt_Superficie_Inmueble;
    private javax.swing.JTextField txt_Valor_Inmueble;
    private javax.swing.JTextField txt_Zona_Inmueble;
    private javax.swing.JTextField txt_id_Inmueble;
    // End of variables declaration//GEN-END:variables

}
