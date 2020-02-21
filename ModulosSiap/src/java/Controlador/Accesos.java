package Controlador;

import Conexion.Conexion;
import Modelo.UsuariosValidar;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Dani
 */
public class Accesos extends Conexion {

    String sql = "";
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;

    public Accesos() {

    }

    public UsuariosValidar validar(String usuario, String password) {
        //int EsActivo = 0;
        UsuariosValidar uv = null;

        try {

            CallableStatement cs = getConnection().prepareCall("{call proc_UsuariosValidar(?,?)}");

            cs.setString(1, usuario);
            cs.setString(2, password);

            rs = cs.executeQuery();

           while(rs.next()) {
              // return true;

                uv = new UsuariosValidar();
                
                uv.setUserName(rs.getString(1));
                uv.setIdDependencia(rs.getString(2));
                uv.setEsAdmin(rs.getBoolean(3));
                uv.setEsActivo(rs.getBoolean(4));
                uv.setIdPersonal(rs.getString(5));
                uv.setPaterno(rs.getString(6));
                uv.setMaterno(rs.getString(7));
                uv.setNombres(rs.getString(8));
                uv.setDependencia(rs.getString(9));
                // EsActivo = rs.getInt(1);
            }
           
        } catch (Exception e) {
          e.getMessage();
        }
        return uv;
    }
    
//    public static void main(String[] args){
//        Accesos a = new Accesos();
//        
//        UsuariosValidar u = new UsuariosValidar();
//        u=a.validar("000000", "0");
//        
//        String d = u.getIdDependencia();
//        String p = u.getIdPersonal();
//
//        System.out.println(d);
//        System.out.println(p);
//    }

}
