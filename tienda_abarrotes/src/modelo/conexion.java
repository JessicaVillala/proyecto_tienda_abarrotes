package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
Connection conexion=null;
static Statement st;
static ResultSet rs;

        public Connection conexion(){

               try { 
                   Class.forName("com.mysql.jdbc.Driver");    
                   String BaseDeDatos = "jdbc:mysql://localhost/tienda";
                   conexion=DriverManager.getConnection(BaseDeDatos,"root","");

                   if (conexion != null) {
                       System.out.println("Conectando a Base de Datos...");
                   }
               } catch (ClassNotFoundException | SQLException e) {
                   JOptionPane.showMessageDialog(null,"ERROR EN CONECTAR LA BASE DE DATOS"+e);
               }
               return conexion;    
        }

        public void cerrarconexion() throws SQLException {
            System.out.println("Cerrando conexion");
                    conexion.close();       
            }


        public ResultSet consultar(String sql) { 
                try { 
                    st = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                    rs = st.executeQuery(sql); 

                } catch (SQLException e) { 
                    return null; 
                } 
                return rs; 
            }
/*
    public void resportesPDF(String ruta, String archi) {
        try {
            String rutaInforme = ruta;
            JasperPrint informe = JasperFillManager.fillReport(rutaInforme, null, Conexion);
            JasperExportManager.exportReportToPdfFile(informe, archi);

            JasperViewer ventanavisor = new JasperViewer(informe, false);
            ventanavisor.setTitle("Facturas");
            ventanavisor.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL EXPORTAR DOCUMENTO");
        }
    }
    
    */
   /*
public Connection Conexion()
    {
      try {
             
           //Cargamos el Driver MySQL
           Class.forName("com.mysql.jdbc.Driver");
           conect = DriverManager.getConnection("jdbc:mysql://localhost/tienda","root","root");
           //JOptionPane.showMessageDialog(null, "conectado");
           //Cargamos el Driver Access
           //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           //Conectar en red base 
           //String strConect = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=//servidor/bd_cw/cw.mdb";
           //Conectar Localmente
           //String strConect = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=D:/cwnetbeans/cw.mdb";
          //conect = DriverManager.getConnection(strConect,"",""); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return conect;
     
}}
*/

}
