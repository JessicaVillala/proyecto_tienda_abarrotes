package vista;

import javax.swing.ImageIcon;

public class EntornoAdmin extends javax.swing.JFrame {

        private int estado_max=0;

    public EntornoAdmin() {
        initComponents();
        establecer_centro();
        iniciar_logo();
        
    }

    private void iniciar_logo(){
        this.setIconImage(new ImageIcon(getClass().getResource("/vista/imagen/logo.png")).getImage());
    }
    private void establecer_centro(){
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        PanelLienzo = new javax.swing.JPanel();
        PanelEntorno = new javax.swing.JPanel();
        A_Panel_Home = new javax.swing.JPanel();
        PanelSuperior = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        PanelInferior = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        B_About = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PanelNavegacion = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnInicio = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnAbout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelCabecera = new javax.swing.JPanel();
        maximisar4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelLienzo.setBackground(new java.awt.Color(255, 255, 255));

        PanelEntorno.setBackground(new java.awt.Color(255, 255, 255));

        A_Panel_Home.setBackground(new java.awt.Color(255, 255, 255));

        PanelSuperior.setBackground(new java.awt.Color(255, 255, 255));
        PanelSuperior.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/inventario1.png"))); // NOI18N
        jButton4.setText("INVENTARIO");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 160));

        jButton10.setBackground(new java.awt.Color(255, 255, 51));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/configuracion.png"))); // NOI18N
        jButton10.setText("AJUSTES");
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 160));

        jButton11.setBackground(new java.awt.Color(255, 51, 51));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/informes.png"))); // NOI18N
        jButton11.setText("INFORMES");
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 160));

        PanelSuperior.add(jPanel2, new java.awt.GridBagConstraints());

        PanelInferior.setBackground(new java.awt.Color(255, 255, 255));
        PanelInferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(102, 0, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/usuarios.png"))); // NOI18N
        jButton5.setText("USUARIOS");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelInferior.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 160));

        jButton12.setBackground(new java.awt.Color(51, 51, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/carrito_ventas.png"))); // NOI18N
        jButton12.setText("VENTAS");
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelInferior.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 160));

        jButton13.setBackground(new java.awt.Color(0, 102, 51));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/clientes.png"))); // NOI18N
        jButton13.setText("CLIENTES");
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PanelInferior.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 160));

        javax.swing.GroupLayout A_Panel_HomeLayout = new javax.swing.GroupLayout(A_Panel_Home);
        A_Panel_Home.setLayout(A_Panel_HomeLayout);
        A_Panel_HomeLayout.setHorizontalGroup(
            A_Panel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_Panel_HomeLayout.createSequentialGroup()
                .addGroup(A_Panel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(A_Panel_HomeLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(PanelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(A_Panel_HomeLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(PanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        A_Panel_HomeLayout.setVerticalGroup(
            A_Panel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_Panel_HomeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(PanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(PanelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        B_About.setBackground(new java.awt.Color(255, 255, 255));
        B_About.setPreferredSize(new java.awt.Dimension(852, 486));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/icono.png"))); // NOI18N

        jLabel5.setText("TinJes Software se basan en el software desarrollado bajo una Licencia Pública General GNU versión 2.");

        jLabel7.setText(" Para más información, visite www.israjimenez.com.");

        javax.swing.GroupLayout B_AboutLayout = new javax.swing.GroupLayout(B_About);
        B_About.setLayout(B_AboutLayout);
        B_AboutLayout.setHorizontalGroup(
            B_AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_AboutLayout.createSequentialGroup()
                .addGroup(B_AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(B_AboutLayout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jLabel2))
                    .addGroup(B_AboutLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(B_AboutLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel7))
                    .addGroup(B_AboutLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel5)))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        B_AboutLayout.setVerticalGroup(
            B_AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_AboutLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelEntornoLayout = new javax.swing.GroupLayout(PanelEntorno);
        PanelEntorno.setLayout(PanelEntornoLayout);
        PanelEntornoLayout.setHorizontalGroup(
            PanelEntornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(A_Panel_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelEntornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelEntornoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(B_About, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelEntornoLayout.setVerticalGroup(
            PanelEntornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(A_Panel_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelEntornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelEntornoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(B_About, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        PanelNavegacion.setBackground(new java.awt.Color(153, 0, 51));

        btnInicio.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/home.png"))); // NOI18N
        btnInicio.setText("Home");
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/logout.png"))); // NOI18N
        btnLogout.setText("Logout");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/usuario.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnAbout.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/about.png"))); // NOI18N
        btnAbout.setText("About");
        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAboutMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIO");

        javax.swing.GroupLayout PanelNavegacionLayout = new javax.swing.GroupLayout(PanelNavegacion);
        PanelNavegacion.setLayout(PanelNavegacionLayout);
        PanelNavegacionLayout.setHorizontalGroup(
            PanelNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelNavegacionLayout.createSequentialGroup()
                .addGroup(PanelNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNavegacionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelNavegacionLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(btnAbout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelNavegacionLayout.setVerticalGroup(
            PanelNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNavegacionLayout.createSequentialGroup()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 201, Short.MAX_VALUE))
        );

        PanelCabecera.setBackground(new java.awt.Color(33, 0, 33));

        maximisar4.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        maximisar4.setForeground(new java.awt.Color(153, 0, 0));
        maximisar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/minmax.png"))); // NOI18N
        maximisar4.setBorderPainted(false);
        maximisar4.setContentAreaFilled(false);
        maximisar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximisar4ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/menos.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/salir.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCabeceraLayout = new javax.swing.GroupLayout(PanelCabecera);
        PanelCabecera.setLayout(PanelCabeceraLayout);
        PanelCabeceraLayout.setHorizontalGroup(
            PanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCabeceraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maximisar4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        PanelCabeceraLayout.setVerticalGroup(
            PanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(maximisar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelLienzoLayout = new javax.swing.GroupLayout(PanelLienzo);
        PanelLienzo.setLayout(PanelLienzoLayout);
        PanelLienzoLayout.setHorizontalGroup(
            PanelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLienzoLayout.createSequentialGroup()
                .addComponent(PanelNavegacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(PanelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelEntorno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelLienzoLayout.setVerticalGroup(
            PanelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLienzoLayout.createSequentialGroup()
                .addComponent(PanelCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelEntorno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PanelNavegacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maximisar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximisar4ActionPerformed
        // TODO add your handling code here:
        Object estado = evt.getSource();
        if(estado.equals(maximisar4)){
            if(estado_max==0){
                estado_max++;
                this.setExtendedState(MAXIMIZED_BOTH);
            }
            else if(estado_max==1){
                estado_max--;
                this.setExtendedState(MAXIMIZED_BOTH);
                this.setExtendedState(0);
            }
        }
    }//GEN-LAST:event_maximisar4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
        this.setExtendedState(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseClicked
        // TODO add your handling code here:
        B_About.setVisible(true);
        A_Panel_Home.setVisible(false);
        //boton a cerca de
        btnAbout.setBackground(new java.awt.Color(31, 174, 255));
        btnAbout.setForeground(new java.awt.Color(255, 255, 255));
        
        //boton home
        btnInicio.setBackground(new java.awt.Color(244, 244, 244));
        btnInicio.setForeground(new java.awt.Color(11, 10, 9));
        
        //boton Loogout
        btnLogout.setBackground(new java.awt.Color(244, 244, 244));
        btnLogout.setForeground(new java.awt.Color(11, 10, 9));
    }//GEN-LAST:event_btnAboutMouseClicked

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        // TODO add your handling code here:
        A_Panel_Home.setVisible(true);
        B_About.setVisible(false);
        
        //boton home
        btnInicio.setBackground(new java.awt.Color(31, 174, 255));
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        
        //boton a cerca de
        btnAbout.setBackground(new java.awt.Color(244, 244, 244));
        btnAbout.setForeground(new java.awt.Color(11, 10, 9));
              
        //boton Loogout
        btnLogout.setBackground(new java.awt.Color(244, 244, 244));
        btnLogout.setForeground(new java.awt.Color(11, 10, 9));
    }//GEN-LAST:event_btnInicioMouseClicked

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
            java.util.logging.Logger.getLogger(EntornoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntornoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntornoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntornoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EntornoAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel A_Panel_Home;
    public javax.swing.JPanel B_About;
    private javax.swing.JPanel PanelCabecera;
    private javax.swing.JPanel PanelEntorno;
    private javax.swing.JPanel PanelInferior;
    private javax.swing.JPanel PanelLienzo;
    private javax.swing.JPanel PanelNavegacion;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JLabel btnAbout;
    private javax.swing.JLabel btnInicio;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton maximisar4;
    // End of variables declaration//GEN-END:variables
}
