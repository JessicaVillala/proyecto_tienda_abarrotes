package vista;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class EntornoAdmin extends javax.swing.JFrame {
    
    //creando objetos de interfaces y otros
    Ajuste ajuste=new Ajuste();
    Inventario inventario=new Inventario();
    Informe informe=new Informe();
    Venta venta=new Venta();
    Usuario usuario=new Usuario();
    Cliente cliente=new Cliente();    

    //inicializando variables
    private int estado_max=0;
    protected int ancho=1215,alto=700;
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
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelLienzo = new javax.swing.JPanel();
        PanelEntorno = new javax.swing.JPanel();
        Lienzo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        A_Panel_Home = new javax.swing.JPanel();
        PanelSuperior = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnInventario = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        btnInformes = new javax.swing.JButton();
        PanelInferior = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
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
        lblUsuario = new javax.swing.JLabel();
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

        Lienzo.setBackground(new java.awt.Color(255, 255, 255));
        Lienzo.setPreferredSize(new java.awt.Dimension(852, 486));

        jLabel3.setText("Lienzo");

        javax.swing.GroupLayout LienzoLayout = new javax.swing.GroupLayout(Lienzo);
        Lienzo.setLayout(LienzoLayout);
        LienzoLayout.setHorizontalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LienzoLayout.createSequentialGroup()
                .addContainerGap(808, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        LienzoLayout.setVerticalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LienzoLayout.createSequentialGroup()
                .addContainerGap(410, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        A_Panel_Home.setBackground(new java.awt.Color(255, 255, 255));

        PanelSuperior.setBackground(new java.awt.Color(255, 255, 255));
        PanelSuperior.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInventario.setBackground(new java.awt.Color(0, 204, 204));
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/inventario1.png"))); // NOI18N
        btnInventario.setText("INVENTARIO");
        btnInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 160));

        btnAjustes.setBackground(new java.awt.Color(255, 255, 51));
        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/configuracion.png"))); // NOI18N
        btnAjustes.setText("AJUSTES");
        btnAjustes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAjustes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustesActionPerformed(evt);
            }
        });
        jPanel2.add(btnAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 160));

        btnInformes.setBackground(new java.awt.Color(255, 51, 51));
        btnInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/informes.png"))); // NOI18N
        btnInformes.setText("INFORMES");
        btnInformes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInformes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesActionPerformed(evt);
            }
        });
        jPanel2.add(btnInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 160));

        PanelSuperior.add(jPanel2, new java.awt.GridBagConstraints());

        PanelInferior.setBackground(new java.awt.Color(255, 255, 255));
        PanelInferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsuarios.setBackground(new java.awt.Color(102, 0, 102));
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/usuarios.png"))); // NOI18N
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        PanelInferior.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 160));

        btnVentas.setBackground(new java.awt.Color(51, 51, 255));
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/carrito_ventas.png"))); // NOI18N
        btnVentas.setText("VENTAS");
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        PanelInferior.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 160));

        btnClientes.setBackground(new java.awt.Color(0, 102, 51));
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/clientes.png"))); // NOI18N
        btnClientes.setText("CLIENTES");
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        PanelInferior.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 160));

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
                .addContainerGap(55, Short.MAX_VALUE))
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
                .addContainerGap(130, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
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
            .addGroup(PanelEntornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelEntornoLayout.setVerticalGroup(
            PanelEntornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(A_Panel_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelEntornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelEntornoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(B_About, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(PanelEntornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
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
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

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

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("USUARIO");

        javax.swing.GroupLayout PanelNavegacionLayout = new javax.swing.GroupLayout(PanelNavegacion);
        PanelNavegacion.setLayout(PanelNavegacionLayout);
        PanelNavegacionLayout.setHorizontalGroup(
            PanelNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(PanelNavegacionLayout.createSequentialGroup()
                .addGroup(PanelNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNavegacionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelNavegacionLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblUsuario)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(PanelNavegacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelNavegacionLayout.setVerticalGroup(
            PanelNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNavegacionLayout.createSequentialGroup()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuario)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        //dispose();
        System.exit(0);
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

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        Login login=new Login();
                login.show();
                this.setVisible(false);
 
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustesActionPerformed
        // TODO add your handling code here:
        mostrarLienzo();
        
        ajuste.setSize(ancho,alto);
        ajuste.setLocation(0,0);
        Lienzo.removeAll();
        Lienzo.add(ajuste,BorderLayout.CENTER);
        Lienzo.revalidate();
        Lienzo.repaint();        
        
        
             
    }//GEN-LAST:event_btnAjustesActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        // TODO add your handling code here:
        mostrarLienzo();         
        //int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        //int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        //ancho= ancho -140;
        //alto = alto-68;
        //inventario.setSize(ancho,alto);
        //System.out.println("El ancho es: "+ ancho+ " y el alto es: "+alto);
        
        inventario.setSize(ancho,alto);
        inventario.setLocation(0,0);
        Lienzo.removeAll();
        Lienzo.add(inventario,BorderLayout.CENTER);
        Lienzo.revalidate();
        Lienzo.repaint();
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesActionPerformed
        // TODO add your handling code here:
        mostrarLienzo();
        informe.setSize(ancho,alto);
        informe.setLocation(0,0);
        Lienzo.removeAll();
        Lienzo.add(informe,BorderLayout.CENTER);
        Lienzo.revalidate();
        Lienzo.repaint();
    }//GEN-LAST:event_btnInformesActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        mostrarLienzo();
        venta.setSize(ancho,alto);
        venta.setLocation(0,0);
        Lienzo.removeAll();
        Lienzo.add(venta,BorderLayout.CENTER);
        Lienzo.revalidate();
        Lienzo.repaint();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        mostrarLienzo();
        usuario.setSize(ancho,alto);
        usuario.setLocation(0,0);
        Lienzo.removeAll();
        Lienzo.add(usuario,BorderLayout.CENTER);
        Lienzo.revalidate();
        Lienzo.repaint();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        mostrarLienzo();
        cliente.setSize(ancho,alto);
        cliente.setLocation(0,0);
        Lienzo.removeAll();
        Lienzo.add(cliente,BorderLayout.CENTER);
        Lienzo.revalidate();
        Lienzo.repaint();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void mostrarLienzo(){
        Lienzo.setVisible(true);
        B_About.setVisible(false);
        A_Panel_Home.setVisible(false);
    }
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
    private javax.swing.JPanel Lienzo;
    private javax.swing.JPanel PanelCabecera;
    private javax.swing.JPanel PanelEntorno;
    private javax.swing.JPanel PanelInferior;
    private javax.swing.JPanel PanelLienzo;
    private javax.swing.JPanel PanelNavegacion;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JLabel btnAbout;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnInformes;
    private javax.swing.JLabel btnInicio;
    private javax.swing.JButton btnInventario;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JButton maximisar4;
    // End of variables declaration//GEN-END:variables
}
