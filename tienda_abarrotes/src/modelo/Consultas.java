package modelo;

import modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Consultas {
static Statement s;
static ResultSet rs;
Conexion cn=new Conexion(); 
Connection c= cn.conexion();

//inicializando variables
String total_clientes="";
    
//Consulta de los pclientes    
    public String buscarTotalClientes() throws Exception {
        try{
            
            s = c.createStatement();
            rs = s.executeQuery("select count(id_cliente) from clientes");
              if(!rs.next()){
        } else {
                  total_clientes=rs.getString(1);
                  cn.cerrarconexion();
            }
        }
        catch(SQLException e){
            System.out.println(""+e);
        }
        return total_clientes;
    }
        
    
//Consulta de los productos por nombre usando like   
    public ResultSet buscarProducto(String nombre) throws Exception {
        nombre = '%' + nombre + '%';
        PreparedStatement ps = c.prepareStatement("SELECT * FROM producto where nombreproducto like ?");
        ps.setString(1, nombre);
        rs = ps.executeQuery();
        return rs;
    }
    
    public int consultarCantidad(int idproducto) throws Exception {
       int bdcantidad=0;
        s = c.createStatement();
        rs = s.executeQuery("select stock from Producto where IdProducto="+idproducto+"");
        while(rs.next()){
        bdcantidad=rs.getInt(1);
        }
        return bdcantidad;
        }
    
    
//consulta id del cliente
    public String obteneriIDcliente() throws Exception {
    String idcliente="";
        s = c.createStatement();
        rs = s.executeQuery("select max(IdCliente) from Clientes");
        if(rs.next()){
        idcliente=rs.getString(1);
        }
        return idcliente;
    }

//consulta id del empleado   
    public String obteneriIDEmpleado(String usuario) throws Exception 
    {
    String idempleado="";
        s = c.createStatement();
        rs = s.executeQuery("select IdVendedor from Vendedor where cedula='"+usuario+"'");
        if(rs.next()){
        idempleado=rs.getString(1);
        }
        return idempleado;
    }

}
