package vista;

import controlador.SettersAndGetters;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.MetodoIngreso;
import modelo.Conexion;


public class Registro extends javax.swing.JFrame {

    //iniciar variable
    private static ResultSet r;
    private static Statement st;
    private static PreparedStatement ps;
    private String tipo,usuario,contrasena;
    int tipo_numerico=0;


    //invocacion de clases   
    Conexion cn=new Conexion();  
    Connection c= cn.conexion();
    SettersAndGetters set=new SettersAndGetters();
    MetodoIngreso mi=new MetodoIngreso();
    
    public Registro() {
        initComponents();
        establecer_centro();
    }

    private void establecer_centro(){
        this.setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelUsuarios = new javax.swing.JPanel();
        CabeceraUsuarios = new javax.swing.JPanel();
        lblemcabezado = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();
        CuerpoUsuarios = new javax.swing.JPanel();
        comboTipoUser = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        TextUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        CabeceraUsuarios.setBackground(new java.awt.Color(0, 153, 153));

        lblemcabezado.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        lblemcabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblemcabezado.setText("REGISTRO DE USUARIOS");

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/logout1.png"))); // NOI18N
        cerrar.setContentAreaFilled(false);
        cerrar.setDefaultCapable(false);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CabeceraUsuariosLayout = new javax.swing.GroupLayout(CabeceraUsuarios);
        CabeceraUsuarios.setLayout(CabeceraUsuariosLayout);
        CabeceraUsuariosLayout.setHorizontalGroup(
            CabeceraUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabeceraUsuariosLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(lblemcabezado)
                .addGap(18, 18, 18)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        CabeceraUsuariosLayout.setVerticalGroup(
            CabeceraUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabeceraUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblemcabezado)
                .addGap(23, 23, 23))
            .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CuerpoUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        comboTipoUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        comboTipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione un item", "Administrador", "Vendedor" }));
        comboTipoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoUserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("TIPO USUARIO:");

        lblusuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblusuario.setText("Usuario:");

        password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password.setText("jPasswordField1");

        TextUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Contraseña: ");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen/usuariosR (3).png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CuerpoUsuariosLayout = new javax.swing.GroupLayout(CuerpoUsuarios);
        CuerpoUsuarios.setLayout(CuerpoUsuariosLayout);
        CuerpoUsuariosLayout.setHorizontalGroup(
            CuerpoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuerpoUsuariosLayout.createSequentialGroup()
                .addGroup(CuerpoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuerpoUsuariosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(CuerpoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblusuario)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19)
                        .addGroup(CuerpoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(TextUsuario)
                            .addComponent(comboTipoUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(CuerpoUsuariosLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        CuerpoUsuariosLayout.setVerticalGroup(
            CuerpoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuerpoUsuariosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(CuerpoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(comboTipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(CuerpoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusuario)
                    .addComponent(TextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(CuerpoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelUsuariosLayout = new javax.swing.GroupLayout(PanelUsuarios);
        PanelUsuarios.setLayout(PanelUsuariosLayout);
        PanelUsuariosLayout.setHorizontalGroup(
            PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CabeceraUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CuerpoUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelUsuariosLayout.setVerticalGroup(
            PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuariosLayout.createSequentialGroup()
                .addComponent(CabeceraUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CuerpoUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTipoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoUserActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       try
       {
           registrar();
       } 
       catch (Exception ex) 
       {
           JOptionPane.showMessageDialog(null, "Verifique los datos ingresados ..."+ex, "ALERTA", JOptionPane.WARNING_MESSAGE);
          
       }        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void registrar() throws Exception{
        
        tipo = comboTipoUser.getSelectedItem().toString();
        if(tipo.equals("Administrador")){
            tipo_numerico=1;
        }
        if(tipo.equals("Vendedor")){
            tipo_numerico=2;
        }
        
        usuario= TextUsuario.getText();
        contrasena= password.getText();

        if(contrasena.equals("")||usuario.equals("")||tipo.equals("Selecione un item"))
        {
            JOptionPane.showMessageDialog(null, "Verifique los datos ingresados ...", "ALERTA", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            try{               
                set.setTipo_usuario(tipo_numerico);   
                set.setUsuario(usuario);
                set.setPassword(contrasena);
            mi.registrarUsuario(set);
            
            JOptionPane.showMessageDialog(null, "Vendedor registrado correctamente");

        }
        catch(NumberFormatException | HeadlessException ex)
        {
            JOptionPane.showMessageDialog(null, "Error de registro"+ex, "ALERTA", JOptionPane.WARNING_MESSAGE);
        }
        }
       
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CabeceraUsuarios;
    private javax.swing.JPanel CuerpoUsuarios;
    private javax.swing.JPanel PanelUsuarios;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JButton cerrar;
    private javax.swing.JComboBox<String> comboTipoUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblemcabezado;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
