package vista;

import controlador.funciones_extras;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Conexion;
import modelo.Consultas;

public class ejecutora {
    
static Statement s;
static ResultSet rs;
private static PreparedStatement ps;
private static CallableStatement cs;
Conexion cn=new Conexion(); 
//Connection c= cn.Conexion();

    public static void main(String[] args) throws SQLException, Exception {

       // funciones_extras p=new funciones_extras();
       // p.barra_progreso();
      
        
        //Conexion c=new Conexion();
        //c.conexion();
        Consultas c = new Consultas();      
        System.out.println(""+c.buscarTotalClientes1());
    }  
}