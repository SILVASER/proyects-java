/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import conexion.conectar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.usuario.RegisUsuarios;
import java.sql.Connection;
import view.alquiler.NuevoAlquiler;
import view.alquiler.nuevoCliente;
import view.caja.AperturaCaja;
import view.checkList.CheckList;
import view.empleado.nuevoTrab;
import view.mantenimiento.nuevoMant;
import static view.usuario.RegisUsuarios.tableUsuarios;
import view.vehicular.nuevoDVH;
import view.vehicular.nuevoVH;

/**
 *
 * @author Dani
 */
public class Utilidades {
    
 
      
    
    public Utilidades(){}
    
//     public void eventoAccion() { 
//		 estadoTrue();
//                 this.panel_1.setVisible(false);
//	  int fila = tabla.getSelectedRow(); String rol = "", activo = "", admin = "";
//	  
//	  txtnombreUsuario.setText(tabla.getValueAt(fila, 0).toString());
//	  txtcontraseña.setText(tabla.getValueAt(fila, 1).toString());
//	  txtid.setText(tabla.getValueAt(fila, 2).toString());
//	  txtpaterno.setText(tabla.getValueAt(fila, 3).toString());
//	  txtmaterno.setText(tabla.getValueAt(fila, 4).toString());
//	  txtnombres.setText(tabla.getValueAt(fila, 5).toString());
//	  txtemail.setText(tabla.getValueAt(fila, 6).toString());
//	  
//	  activo = tabla.getValueAt(fila, 7).toString(); if (activo.equals("1")) {
//	  checkactivo.setSelected(true); } else { checkactivo.setSelected(false); }
//	  
//	  admin = tabla.getValueAt(fila, 8).toString(); if (admin.equals("1")) {
//	  checkadmin.setSelected(true); } else { checkadmin.setSelected(false); }
//	  
//	  rol = (String) tabla.getValueAt(fila, 9);
//	  
//	  comborol.getModel().setSelectedItem(rol);
//	  
//	  txtfechacreacion.setText(tabla.getValueAt(fila, 10).toString());
//	  fechamodificacion.setText(tabla.getValueAt(fila, 11).toString());
//	  txtuser.setText(tabla.getValueAt(fila, 12).toString());
//	  txtip.setText(tabla.getValueAt(fila, 13).toString());
//     }
//
//
//	public void estadoTrue() {
//
//		txtnombreUsuario.setVisible(false);
//		txtcontraseña.setVisible(false);
//		txtid.setVisible(false);
//		txtpaterno.setVisible(false);
//		txtmaterno.setVisible(false);
//		txtnombres.setVisible(false);
//		txtemail.setVisible(false);
//		txtfechacreacion.setVisible(false);
//		fechamodificacion.setVisible(false);
//		txtuser.setVisible(false);
//		txtip.setVisible(false);
//		checkactivo.setVisible(false);
//		checkadmin.setVisible(false);
//		comborol.setVisible(false);
//	}
    
     public static boolean isNumeric(String cadena) {

	        try {
	            Integer.parseInt(cadena);
	            return true;
	        } catch (NumberFormatException nfe) {
	            return false;
	        }
	    }
     
      public static boolean isDecimal(String cadena) {

	        try {
	            Double.parseDouble(cadena);
	            return true;
	        } catch (NumberFormatException nfe) {
	            return false;
	        }
	    }

	    public static Date stringToDate(String fecha) {
	        SimpleDateFormat formatodelTexto = new SimpleDateFormat("yyy/MM/dd");
	        Date aux = null;
	        try {
	            aux = formatodelTexto.parse(fecha);
	        } catch (Exception ex) {
	        }
	        return aux;
	    }

	    public static String formatDate(Date fecha) {
	        if (fecha == null) {
	            fecha = new Date();
	        }
	        SimpleDateFormat formatodelTexto = new SimpleDateFormat("yyy-MM-dd");
	        return formatodelTexto.format(fecha);
	    }
	    
	     public static String formatDate2(Date fecha) {
	        if (fecha == null) {
	            fecha = new Date();
	        }
	        SimpleDateFormat formatodelTexto = new SimpleDateFormat("yyy");
	        return formatodelTexto.format(fecha);
	    }
             
                public static String formatDate3(Date fecha) {
	        if (fecha == null) {
	            fecha = new Date();
	        }
	        SimpleDateFormat formatodelTexto = new SimpleDateFormat("MM/dd/yyy");
	        return formatodelTexto.format(fecha);
	    }

	    //Convertir un objeto a entero
//	    public static int objectToInt(Object Obj) {
//	        int NumInt = Integer.parseInt(objectToString(Obj));
//	        return NumInt;
//	    }
	//
	    //Convertir un objeto a double
	    public static double objectToDouble(Object Obj) {
	        String Str = Obj.toString();
	        double NumDouble = Double.valueOf(Str).doubleValue();
	        return NumDouble;
	    }
	//
//	    //Convertir un objeto a booleano
//	    public static boolean objectToBoolean(Object Obj) {
//	        String CadBooleana = objectToString(Obj);
//	        Boolean booleano = new Boolean(CadBooleana);
//	        return booleano;
//	    }
	//
//	    //Convertir un objeto a String
//	    public static String objectToString(Object Obj) {
//	        String Str = "";
//	        if (Obj != null) {
//	            Str = Obj.toString();
//	        }
//	        return Str;
//	    }
	//
//	    public static Date objectToDate(Object obj) {
//	        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
//	        Date aux = null;
//	        try {
//	            aux = formatoDelTexto.parse(objectToString(obj));
//	        } catch (Exception ex) {
//	        }
//	        return aux;
//	    }
//             
  public static void up(){
    int index=0;
    index = RegisUsuarios.tableUsuarios.getSelectedRow();
           //System.out.println("up= " + index);

                if(index > 0){
                    RegisUsuarios.tableUsuarios.setRowSelectionInterval(index - 1, index - 1);
                    RegisUsuarios.btndouwn.setEnabled(true);
                    cantidadRegist(index);

                }else{
                    RegisUsuarios.btnup.setEnabled(false);
                    RegisUsuarios.btndouwn.setEnabled(true);
                }
//                 cantidadRegist();
        }
  
   public static void down(){
        int index;
        
        index = RegisUsuarios.tableUsuarios.getSelectedRow();
        System.out.println("tabla=" + tableUsuarios.getRowCount());
        System.out.println("indice=" + index);

                if(tableUsuarios.getRowCount()>(index+1)){
                         RegisUsuarios.tableUsuarios.setRowSelectionInterval(index + 1, index + 1);
                         System.out.println((index + 1) + "*********" + index + 1);
                         cantidadRegist(index + 2);
                        RegisUsuarios.btnup.setEnabled(true);
                    }else{
                    RegisUsuarios.btndouwn.setEnabled(false);
                    RegisUsuarios.btnup.setEnabled(true);

                }
        }
   
  public static void cantidadRegist(int j){
      	    int fila = tableUsuarios.getSelectedRow();
            int x = 0;
            for (int i = 0; i < tableUsuarios.getRowCount(); i++){
                     x++;
                }
            RegisUsuarios.  cantidad.setText("["+ j+"/"+String.valueOf(x)+"]");
  }
   
   
             
       
     public static void generarID() {
      conectar conec = new conectar();
    Connection con = null;

        con = conec.getConnection();
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "select max(idempleado) from empleado";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                nuevoTrab.txtidc.setText("CE0000001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                char r5 = c.charAt(6);
                char r6 = c.charAt(7);
                char r7 = c.charAt(8);
                String r = "";
                r = "" + r1 + r2 + r3 + r4 + r5 + r6 + r7;

                j = Integer.parseInt(r);
                GenerarCodigos gen = new GenerarCodigos();
                gen.generar(j);
                nuevoTrab.txtidc.setText("CE" + gen.serie());
            }
        } catch (SQLException ex) {
            Logger.getLogger(nuevoTrab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
      public static void generarIDCliente() {
      conectar conec = new conectar();
    Connection con = null;

        con = conec.getConnection();
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "select max(idcliente) from Clientes";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                nuevoCliente.txtid.setText("CC0000001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                char r5 = c.charAt(6);
                char r6 = c.charAt(7);
                char r7 = c.charAt(8);
                String r = "";
                r = "" + r1 + r2 + r3 + r4 + r5 + r6 + r7;

                j = Integer.parseInt(r);
                GenerarCodigos gen = new GenerarCodigos();
                gen.generar(j);
                nuevoCliente.txtid.setText("CC" + gen.serie());
            }
        } catch (SQLException ex) {
            Logger.getLogger(nuevoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
     public static void generarIdVH() {
      conectar conec = new conectar();
    Connection con = null;

        con = conec.getConnection();
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "select max(idvehiculo) from vehiculo";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                nuevoVH.txtcodigo.setText("CV0000001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                char r5 = c.charAt(6);
                char r6 = c.charAt(7);
                char r7 = c.charAt(8);
                String r = "";
                r = "" + r1 + r2 + r3 + r4 + r5 + r6 + r7;
//System.out.println("r=>"+r);
                j = Integer.parseInt(r);
//                System.out.println("j=>"+j);
                
                GenerarCodigos gen = new GenerarCodigos();
                gen.generar(j);
               
//                System.out.println("primero=>"+gen.serie());
                nuevoVH.txtcodigo.setText("CV" + gen.serie());
//                 System.out.println("=====================================");
//                 System.out.println("CV" + gen.serie());
            }
        } catch (SQLException ex) {
            Logger.getLogger(nuevoTrab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
       public static void generarCodCaja() {
      conectar conec = new conectar();
    Connection con = null;

        con = conec.getConnection();
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "select max(idapertura) from APERTURACAJA";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                AperturaCaja.txtcodigo.setText("AP0000001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                char r5 = c.charAt(6);
                char r6 = c.charAt(7);
                char r7 = c.charAt(8);
                String r = "";
                r = "" + r1 + r2 + r3 + r4 + r5 + r6 + r7;

                j = Integer.parseInt(r);
                GenerarCodigos gen = new GenerarCodigos();
                gen.generar(j);
                AperturaCaja.txtcodigo.setText("AP" + gen.serie());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AperturaCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
       
        public static void generarCodALQUILER() {
      conectar conec = new conectar();
    Connection con = null;

        con = conec.getConnection();
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "select max(IDALQUILER) from ALQUILER";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                 NuevoAlquiler.txtcodigo.setText("CA0000001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                char r5 = c.charAt(6);
                char r6 = c.charAt(7);
                char r7 = c.charAt(8);
                String r = "";
                r = "" + r1 + r2 + r3 + r4 + r5 + r6 + r7;

                j = Integer.parseInt(r);
                GenerarCodigos gen = new GenerarCodigos();
                gen.generar(j);
                NuevoAlquiler.txtcodigo.setText("CA" + gen.serie());
            }
        } catch (SQLException ex) {
            Logger.getLogger(NuevoAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
       
       
       public static void generarIdDVH() {
      conectar conec = new conectar();
    Connection con = null;

        con = conec.getConnection();
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "select max(iddetvehiculo) from detallevehiculo";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                nuevoDVH.txtID.setText("DV0000001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                char r5 = c.charAt(6);
                char r6 = c.charAt(7);
                char r7 = c.charAt(8);
                String r = "";
                r = "" + r1 + r2 + r3 + r4 + r5 + r6 + r7;

                j = Integer.parseInt(r);
                GenerarCodigos gen = new GenerarCodigos();
                gen.generar(j);
                nuevoDVH.txtID.setText("DV" + gen.serie());
            }
        } catch (SQLException ex) {
            Logger.getLogger(nuevoTrab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
        public static void generarIdMant() {
      conectar conec = new conectar();
    Connection con = null;

        con = conec.getConnection();
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "select max(idmantenimiento) from mantenimiento";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                nuevoMant.txtcodigo.setText("CM0000001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                char r5 = c.charAt(6);
                char r6 = c.charAt(7);
                char r7 = c.charAt(8);
                String r = "";
                r = "" + r1 + r2 + r3 + r4 + r5 + r6 + r7;

                j = Integer.parseInt(r);
                GenerarCodigos gen = new GenerarCodigos();
                gen.generar(j);
                 nuevoMant.txtcodigo.setText("CM" + gen.serie());
            }
        } catch (SQLException ex) {
            Logger.getLogger(nuevoMant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
          public static void generarIDINS() {
      conectar conec = new conectar();
    Connection con = null;

        con = conec.getConnection();
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "select max(CODIGO) from INSPECCION";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
               CheckList.txtcodigo.setText("CI0000001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                char r5 = c.charAt(6);
                char r6 = c.charAt(7);
                char r7 = c.charAt(8);
                String r = "";
                r = "" + r1 + r2 + r3 + r4 + r5 + r6 + r7;

                j = Integer.parseInt(r);
                GenerarCodigos gen = new GenerarCodigos();
                gen.generar(j);
                 CheckList.txtcodigo.setText("CI" + gen.serie());
            }
        } catch (SQLException ex) {
            Logger.getLogger( CheckList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
          
}
