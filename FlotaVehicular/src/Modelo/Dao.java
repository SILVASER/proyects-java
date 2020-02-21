/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import conexion.conectar;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import view.alquiler.EncontrarAlqClient;
import view.alquiler.EncontrarAlqClient2;
import view.alquiler.EncontrarAlqVh;
import view.alquiler.EncontrarAlqVh2;
import view.alquiler.EncontrarCliente;
import view.alquiler.EncontrarVehiculo;
import view.alquiler.EncontrarVehiculo2;
import view.alquiler.RegistAlquiler;
import view.alquiler.RegistClientes;
import view.alquiler.RegistVehiculosAlq;
import view.caja.ActDetalleCaja;
import view.caja.DocumentosC;
import view.caja.NuevoMovimiento;
import view.caja.NuevoMovimientoAP;
import view.caja.RegistCaja;

import view.caja.BuscarColaborador;
import view.caja.BuscarDocumento;
import view.caja.BuscarCuenta;
import view.checkList.InspeccionMovil;
import view.empleado.RegisTrabajadores;
import view.entradasalidas.BuscarOperador;
import view.entradasalidas.BuscarPC;
import view.entradasalidas.BuscarPT;
import view.entradasalidas.BuscarVehiculo;
import view.entradasalidas.BuscarVht;
import view.entradasalidas.RegistMP;
import view.entradasalidas.RegistVht;
import view.mantenimiento.EncontrarEmpl;
import view.mantenimiento.EncontrarProv;
import view.mantenimiento.EncontrarVeh;
import view.mantenimiento.Mantenimiento;
import view.mantenimiento.buscarMatricula;
import view.mantenimiento.buscarempleado;
import view.mantenimiento.buscarprov;
import view.mantenimiento.buscarvehiculo;
import view.mantenimiento.nuevoMant;
import view.usuario.RegisUsuarios;
import view.usuario.buscarUsu;
import view.vehicular.RegisVehiculos;

/**
 *
 * @author Dani
 */
public class Dao extends conectar {

    public static conectar c = new conectar();
    public static Connection cn = c.getConnection();
    public static ResultSet rs;
    public static CallableStatement cs;
    private Statement st;
    public static DefaultTableModel tabla;

    public Dao() {
    }

    public static void mostrarUsuarios(String valor, String valor2, String valor3, String valor4) {
        String[] titulos = {"Usuario", "Contraseña", "Documento", " Nombres ", "Email", "Activo",
            "Admin", "Rol", "ID Empleado", "Fecha de Ingreso", "Fecha de Actualización", "User", "Ip"};
        String[] Registros = new String[13];
        tabla = new DefaultTableModel(null, titulos);

        try {

            cs = cn.prepareCall("{call mostrarUsuarios(?,?,?,?)}");
            cs.setString(1, valor);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            rs = cs.executeQuery();
            
            while (rs.next()) {
                Registros[0] = rs.getString("username");
                Registros[1] = rs.getString("password");
                Registros[2] = rs.getString("numdoc");
                Registros[3] = rs.getString("nombres");
                Registros[4] = rs.getString("email");
                Registros[5] = rs.getString("esactivo");
                Registros[6] = rs.getString("esadmin");
                Registros[7] = rs.getString("descripcion");
                Registros[8] = rs.getString("IDEMPLEADO");
                Registros[9] = rs.getString("fechac");
                Registros[10] = rs.getString("fecham");
                
                System.out.println(rs.getString("fechac"));
                System.out.println(rs.getString("fecham"));
                
                Registros[11] = rs.getString("nomusum");
                Registros[12] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            
            RegisUsuarios.tableUsuarios.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarEmpleados(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6) {

        String[] titulos = {"Tipo de Documento", "Numero", "Nombre", "Direccion", "Pais", "Departamento", "Provincia",
            "Distrito", "Sexo", "Telefono", "Email", "Fecha de Nacimiento", "Edad",
            "Permiso de Conducir", "Dependencia", "Organizacion", "Cargo", "Tipo de Empleado", "Tipo de Licencia", "N° Licencia", "Activo", "Jefe",
            "Fecha de Actualización", "User", "Ip", "Fecha de Ingreso", "Fecha de Salida"};
        String[] Registros = new String[27];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call mostrarEmpleados(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("descripcionlarga");
                Registros[1] = rs.getString("numdoc");
                Registros[2] = rs.getString("nombres");
                Registros[3] = rs.getString("direccion");
                Registros[4] = rs.getString("pais");
                Registros[5] = rs.getString("departamento");
                Registros[6] = rs.getString("provincia");
                Registros[7] = rs.getString("distrito");
                Registros[8] = rs.getString("sexo");
                Registros[9] = rs.getString("telefono");
                Registros[10] = rs.getString("email");
                Registros[11] = rs.getString("fecnacimiento");
                Registros[12] = rs.getString("edad");
                Registros[13] = rs.getString("perconducir");
                Registros[14] = rs.getString("descripcion");
                Registros[15] = rs.getString("organizacion");
                Registros[16] = rs.getString("descripcion2");
                Registros[17] = rs.getString("tipoemp");
                Registros[18] = rs.getString("TIPOLICENCIA");
                Registros[19] = rs.getString("NLICENCIA");
                Registros[20] = rs.getString("activo");
                Registros[21] = rs.getString("jefe");
                Registros[22] = rs.getString("fecham");
                Registros[23] = rs.getString("nomusum");
                Registros[24] = rs.getString("ip");
                Registros[25] = rs.getString("fechaingreso");
                Registros[26] = rs.getString("fechasalida");

                tabla.addRow(Registros);
            }
            RegisTrabajadores.tableEmpleados.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarEmpleados3(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6) {

        String[] titulos = {"Codigo", "Tipo de Documento", "Numero", "Nombre", "Direccion", "Pais", "Departamento",
            "Provincia", "Distrito", "Sexo", "Telefono", "Email", "Fecha de Nacimiento",
            "Edad", "Permiso de Conducir", "Dependencia", "Organizacion", "Tipo de Empleado", "Tipo Licencia", "N° Licencia", "Activo",
            "Jefe", "Fecha de Actualización", "User", "Ip", "Fecha de Ingreso", "Fecha de Salida"};
        String[] Registros = new String[27];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call mostrarEmpleados3(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDEMPLEADO");
                Registros[1] = rs.getString("descripcionlarga");
                Registros[2] = rs.getString("numdoc");
                Registros[3] = rs.getString("nombres");
                Registros[4] = rs.getString("direccion");
                Registros[5] = rs.getString("pais");
                Registros[6] = rs.getString("departamento");
                Registros[7] = rs.getString("provincia");
                Registros[8] = rs.getString("distrito");
                Registros[9] = rs.getString("sexo");
                Registros[10] = rs.getString("telefono");
                Registros[11] = rs.getString("email");
                Registros[12] = rs.getString("fecnacimiento");
                Registros[13] = rs.getString("edad");
                Registros[14] = rs.getString("perconducir");
                Registros[15] = rs.getString("descripcion");
                Registros[16] = rs.getString("organizacion");
                Registros[17] = rs.getString("tipoemp");
                Registros[18] = rs.getString("tipolicencia");
                Registros[19] = rs.getString("nlicencia");
                Registros[20] = rs.getString("activo");
                Registros[21] = rs.getString("jefe");
                Registros[22] = rs.getString("fecham");
                Registros[23] = rs.getString("nomusum");
                Registros[24] = rs.getString("ip");
                Registros[25] = rs.getString("fechaingreso");
                Registros[26] = rs.getString("fechasalida");

                tabla.addRow(Registros);
            }
            buscarempleado.tablebuscare.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarEmpleadosbu(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6) {

        String[] titulos = {"Codigo", "Tipo de Documento", "Numero", "Nombre", "Direccion", "Pais", "Departamento",
            "Provincia", "Distrito", "Sexo", "Telefono", "Email", "Fecha de Nacimiento",
            "Edad", "Permiso de Conducir", "Dependencia", "Organizacion", "Tipo de Empleado", "Tipo Licencia", "N° Licencia", "Activo",
            "Jefe", "Fecha de Actualización", "User", "Ip", "Fecha de Ingreso", "Fecha de Salida"};
        String[] Registros = new String[27];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call mostrarEmpleados3(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDEMPLEADO");
                Registros[1] = rs.getString("descripcionlarga");
                Registros[2] = rs.getString("numdoc");
                Registros[3] = rs.getString("nombres");
                Registros[4] = rs.getString("direccion");
                Registros[5] = rs.getString("pais");
                Registros[6] = rs.getString("departamento");
                Registros[7] = rs.getString("provincia");
                Registros[8] = rs.getString("distrito");
                Registros[9] = rs.getString("sexo");
                Registros[10] = rs.getString("telefono");
                Registros[11] = rs.getString("email");
                Registros[12] = rs.getString("fecnacimiento");
                Registros[13] = rs.getString("edad");
                Registros[14] = rs.getString("perconducir");
                Registros[15] = rs.getString("descripcion");
                Registros[16] = rs.getString("organizacion");
                Registros[17] = rs.getString("tipoemp");
                Registros[18] = rs.getString("tipolicencia");
                Registros[19] = rs.getString("nlicencia");
                Registros[20] = rs.getString("activo");
                Registros[21] = rs.getString("jefe");
                Registros[22] = rs.getString("fecham");
                Registros[23] = rs.getString("nomusum");
                Registros[24] = rs.getString("ip");
                Registros[25] = rs.getString("fechaingreso");
                Registros[26] = rs.getString("fechasalida");

                tabla.addRow(Registros);
            }
            buscarUsu.TableBuscar.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarEmpleados1(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6) {
        String[] titulos = {"Codigo", "Tipo de Documento", "Numero", "Nombre", "Direccion", "Pais", "Departamento",
            "Provincia", "Distrito", "Sexo", "Telefono", "Email", "Fecha de Nacimiento",
            "Edad", "Permiso de Conducir", "Dependencia", "Organizacion", "Tipo de Empleado", "Tipo de Licencia", "N° de Licencia", "Activo",
            "Jefe", "Fecha de Actualización", "User", "Ip", "Fecha de Ingreso", "Fecha de Salida"};
        String[] Registros = new String[27];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call mostrarEmpleados3(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDEMPLEADO");
                Registros[1] = rs.getString("descripcionlarga");
                Registros[2] = rs.getString("numdoc");
                Registros[3] = rs.getString("nombres");
                Registros[4] = rs.getString("direccion");
                Registros[5] = rs.getString("pais");
                Registros[6] = rs.getString("departamento");
                Registros[7] = rs.getString("provincia");
                Registros[8] = rs.getString("distrito");
                Registros[9] = rs.getString("sexo");
                Registros[10] = rs.getString("telefono");
                Registros[11] = rs.getString("email");
                Registros[12] = rs.getString("fecnacimiento");
                Registros[13] = rs.getString("edad");
                Registros[14] = rs.getString("perconducir");
                Registros[15] = rs.getString("descripcion");
                Registros[16] = rs.getString("organizacion");
                Registros[17] = rs.getString("tipoemp");
                Registros[18] = rs.getString("tipolicencia");
                Registros[19] = rs.getString("nlicencia");
                Registros[20] = rs.getString("activo");
                Registros[21] = rs.getString("jefe");
                Registros[22] = rs.getString("fecham");
                Registros[23] = rs.getString("nomusum");
                Registros[24] = rs.getString("ip");
                Registros[25] = rs.getString("fechaingreso");
                Registros[26] = rs.getString("fechasalida");

                tabla.addRow(Registros);
            }
            BuscarColaborador.TableBuscarEmpleado.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarEmpleados5(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6) {
        String[] titulos = {"Codigo", "Tipo de Documento", "Numero", "Nombre", "Direccion", "Pais", "Departamento", "Provincia",
            "Distrito", "Sexo", "Telefono", "Email", "Fecha de Nacimiento", "Edad",
            "Permiso de Conducir", "Dependencia", "Organizacion", "Tipo de Empleado", "Tipo de Licencia", "N° Licencia", "Activo", "Jefe",
            "Fecha de Actualización", "User", "Ip", "Fecha de Ingreso", "Fecha de Salida"};
        String[] Registros = new String[27];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call mostrarEmpleados3(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDEMPLEADO");
                Registros[1] = rs.getString("descripcionlarga");
                Registros[2] = rs.getString("numdoc");
                Registros[3] = rs.getString("nombres");
                Registros[4] = rs.getString("direccion");
                Registros[5] = rs.getString("pais");
                Registros[6] = rs.getString("departamento");
                Registros[7] = rs.getString("provincia");
                Registros[8] = rs.getString("distrito");
                Registros[9] = rs.getString("sexo");
                Registros[10] = rs.getString("telefono");
                Registros[11] = rs.getString("email");
                Registros[12] = rs.getString("fecnacimiento");
                Registros[13] = rs.getString("edad");
                Registros[14] = rs.getString("perconducir");
                Registros[15] = rs.getString("descripcion");
                Registros[16] = rs.getString("organizacion");
                Registros[17] = rs.getString("tipoemp");
                Registros[18] = rs.getString("tipolicencia");
                Registros[19] = rs.getString("nlicencia");
                Registros[20] = rs.getString("activo");
                Registros[21] = rs.getString("jefe");
                Registros[22] = rs.getString("fecham");
                Registros[23] = rs.getString("nomusum");
                Registros[24] = rs.getString("ip");
                Registros[25] = rs.getString("fechaingreso");
                Registros[26] = rs.getString("fechasalida");

                tabla.addRow(Registros);
            }
            EncontrarEmpl.tablebuscare.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarEmpleados6(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6) {
        String[] titulos = {"Codigo", "Tipo de Documento", "Numero", "Nombre", "Direccion", "Pais", "Departamento", "Provincia",
            "Distrito", "Sexo", "Telefono", "Email", "Fecha de Nacimiento", "Edad",
            "Permiso de Conducir", "Dependencia", "Organizacion", "Tipo de Empleado", "Tipo de Licencia", "N° Licencia", "Activo", "Jefe",
            "Fecha de Actualización", "User", "Ip", "Fecha de Ingreso", "Fecha de Salida"};
        String[] Registros = new String[27];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call mostrarEmpleados3(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDEMPLEADO");
                Registros[1] = rs.getString("descripcionlarga");
                Registros[2] = rs.getString("numdoc");
                Registros[3] = rs.getString("nombres");
                Registros[4] = rs.getString("direccion");
                Registros[5] = rs.getString("pais");
                Registros[6] = rs.getString("departamento");
                Registros[7] = rs.getString("provincia");
                Registros[8] = rs.getString("distrito");
                Registros[9] = rs.getString("sexo");
                Registros[10] = rs.getString("telefono");
                Registros[11] = rs.getString("email");
                Registros[12] = rs.getString("fecnacimiento");
                Registros[13] = rs.getString("edad");
                Registros[14] = rs.getString("perconducir");
                Registros[15] = rs.getString("descripcion");
                Registros[16] = rs.getString("organizacion");
                Registros[17] = rs.getString("tipoemp");
                Registros[18] = rs.getString("tipolicencia");
                Registros[19] = rs.getString("nlicencia");
                Registros[20] = rs.getString("activo");
                Registros[21] = rs.getString("jefe");
                Registros[22] = rs.getString("fecham");
                Registros[23] = rs.getString("nomusum");
                Registros[24] = rs.getString("ip");
                Registros[25] = rs.getString("fechaingreso");
                Registros[26] = rs.getString("fechasalida");

                tabla.addRow(Registros);
            }
//			EncontrarEmp.tablebuscare.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarEmpleados60(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6) {
        String[] titulos = {"Codigo", "Tipo de Documento", "Numero", "Nombre", "Direccion", "Pais", "Departamento", "Provincia",
            "Distrito", "Sexo", "Telefono", "Email", "Fecha de Nacimiento", "Edad",
            "Permiso de Conducir", "Dependencia", "Organizacion", "Tipo de Empleado", "Tipo de Licencia", "N° Licencia", "Activo", "Jefe",
            "Fecha de Actualización", "User", "Ip", "Fecha de Ingreso", "Fecha de Salida"};
        String[] Registros = new String[27];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call mostrarEmpleados3(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDEMPLEADO");
                Registros[1] = rs.getString("descripcionlarga");
                Registros[2] = rs.getString("numdoc");
                Registros[3] = rs.getString("nombres");
                Registros[4] = rs.getString("direccion");
                Registros[5] = rs.getString("pais");
                Registros[6] = rs.getString("departamento");
                Registros[7] = rs.getString("provincia");
                Registros[8] = rs.getString("distrito");
                Registros[9] = rs.getString("sexo");
                Registros[10] = rs.getString("telefono");
                Registros[11] = rs.getString("email");
                Registros[12] = rs.getString("fecnacimiento");
                Registros[13] = rs.getString("edad");
                Registros[14] = rs.getString("perconducir");
                Registros[15] = rs.getString("descripcion");
                Registros[16] = rs.getString("organizacion");
                Registros[17] = rs.getString("tipoemp");
                Registros[18] = rs.getString("tipolicencia");
                Registros[19] = rs.getString("nlicencia");
                Registros[20] = rs.getString("activo");
                Registros[21] = rs.getString("jefe");
                Registros[22] = rs.getString("fecham");
                Registros[23] = rs.getString("nomusum");
                Registros[24] = rs.getString("ip");
                Registros[25] = rs.getString("fechaingreso");
                Registros[26] = rs.getString("fechasalida");

                tabla.addRow(Registros);
            }
//			EncontrarEmp2.tablebuscare.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarCaja(String valor1, String valor2, String valor3) {
        String[] titulos = {
            "Item",
            "Codigo Apertura",
            "Nombre",
            "DETALLE",
            "Documento",
            "Serie",
            "Número",
            "FECHAINGRESO",
            "TIPO",
            "IDCOLABORADOR",
            "COLABORADOR",
            "TIPOCAMBIO",
            "MONEDA",
            "FORMAPAGO",
            "MONTO",
            "FECHAACT",
            "USU",
            "IP"
        };
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARCAJA(?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);

            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDDETALLECAJA");
                Registros[1] = rs.getString("IDAPERTURA");
                Registros[2] = rs.getString("NOMBRE");
                Registros[3] = rs.getString("DETALLE");
                Registros[4] = rs.getString("DESCRIPCIONCORTA");
                Registros[5] = rs.getString("SERIE");
                Registros[6] = rs.getString("NUMERO");
                Registros[7] = rs.getString("FECHAINGRESO");
                Registros[8] = rs.getString("TIPO");
                Registros[9] = rs.getString("IDCOLABORADOR");
                Registros[10] = rs.getString("COLABORADOR");
                Registros[11] = rs.getString("TIPOCAMBIO");
                Registros[12] = rs.getString("MONEDA");
                Registros[13] = rs.getString("FORMAPAGO");
                Registros[14] = rs.getString("MONTO");
                Registros[15] = rs.getString("FECHAACT");
                Registros[16] = rs.getString("USU");
                Registros[17] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            RegistCaja.tableDetallecaja.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarRCaja(String valor1, String valor2, String valor3, String valor4, String valor5, String valor6) {
        String[] titulos = {
            "Item",
            "Codigo Apertura",
            "Nombre",
            "DETALLE",
            "Documento",
            "Serie",
            "Número",
            "FECHAINGRESO",
            "TIPO",
            "IDCOLABORADOR",
            "COLABORADOR",
            "TIPOCAMBIO",
            "MONEDA",
            "FORMAPAGO",
            "MONTO",
            "FECHAACT",
            "USU",
            "IP"
        };
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARCAJABUSCADA(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);

            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDDETALLECAJA");
                Registros[1] = rs.getString("IDAPERTURA");
                Registros[2] = rs.getString("NOMBRE");
                Registros[3] = rs.getString("DETALLE");
                Registros[4] = rs.getString("DESCRIPCIONCORTA");
                Registros[5] = rs.getString("SERIE");
                Registros[6] = rs.getString("NUMERO");
                Registros[7] = rs.getString("FECHAINGRESO");
                Registros[8] = rs.getString("TIPO");
                Registros[9] = rs.getString("IDCOLABORADOR");
                Registros[10] = rs.getString("COLABORADOR");
                Registros[11] = rs.getString("TIPOCAMBIO");
                Registros[12] = rs.getString("MONEDA");
                Registros[13] = rs.getString("FORMAPAGO");
                Registros[14] = rs.getString("MONTO");
                Registros[15] = rs.getString("FECHAACT");
                Registros[16] = rs.getString("USU");
                Registros[17] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            RegistCaja.tableDetallecaja.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarAPCaja(String valor1, String valor2, String valor3, String valor4) {
        String[] titulos = {
            "Codigo",
            "Nombre",
            "Compañia",
            "Usuario",
            "Observación",
            "Fecha",
            "Saldo Inicial",
            "Saldo",
            "Saldo Final",
            "Estado",
            "Egresos",
            "Ingresos",
            "Fecha de Actualización",
            "User",
            "Ip"};
        String[] Registros = new String[15];
        tabla = new DefaultTableModel(null, titulos);

        try {

            cs = cn.prepareCall("{call MOSTRARAPERTURA(?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDAPERTURA");
                Registros[1] = rs.getString("NOMBRE");
                Registros[2] = rs.getString("COMPAÑIA");
                Registros[3] = rs.getString("USERNAME");
                Registros[4] = rs.getString("OBSERVACION");
                Registros[5] = rs.getString("FECHAINICIO");
                Registros[6] = rs.getString("SALDOINICIAL");
                Registros[7] = rs.getString("SALDO");
                Registros[8] = rs.getString("SALDOFINAL");
                Registros[9] = rs.getString("ESTADO");
                Registros[10] = rs.getString("EGRESOS");
                Registros[11] = rs.getString("INGRESOS");
                Registros[12] = rs.getString("FECHAM");
                Registros[13] = rs.getString("NOMUSUM");
                Registros[14] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            RegistCaja.tablecaja.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarAPCaja2(String valor1, String valor2, String valor3, String valor4) {
        String[] titulos = {
            "Codigo",
            "Nombre",
            "Compañia",
            "Usuario",
            "Observación",
            "Fecha",
            "Saldo Inicial",
            "Saldo",
            "Saldo Final",
            "Estado",
            "Egresos",
            "Ingresos",
            "Fecha de Actualización",
            "User",
            "Ip"};
        String[] Registros = new String[15];
        tabla = new DefaultTableModel(null, titulos);

        try {

            cs = cn.prepareCall("{call MOSTRARAPERTURA(?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDAPERTURA");
                Registros[1] = rs.getString("NOMBRE");
                Registros[2] = rs.getString("COMPAÑIA");
                Registros[3] = rs.getString("USERNAME");
                Registros[4] = rs.getString("OBSERVACION");
                Registros[5] = rs.getString("FECHAINICIO");
                Registros[6] = rs.getString("SALDOINICIAL");
                Registros[7] = rs.getString("SALDO");
                Registros[8] = rs.getString("SALDOFINAL");
                Registros[9] = rs.getString("ESTADO");
                Registros[10] = rs.getString("EGRESOS");
                Registros[11] = rs.getString("INGRESOS");
                Registros[12] = rs.getString("FECHAM");
                Registros[13] = rs.getString("NOMUSUM");
                Registros[14] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            BuscarCuenta.TableBuscarCuenta.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarEmpleados_2(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6) {
        String[] titulos = {"Tipo de Documento", "Numero", "Nombre", "Direccion", "Pais", "Departamento", "Provincia",
            "Distrito", "Sexo", "Telefono", "Email", "Fecha de Nacimiento", "Edad",
            "Permiso de Conducir", "Dependencia", "Organizacion", "Tipo de Empleado", "Tipo de Licencia", "N° de Licencia", "Activo", "Jefe",
            "Fecha de Actualizacón", "User", "Ip", "Fecha de Ingreso", "Fecha de Salida"};
        String[] Registros = new String[26];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call mostrarEmpleados(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("descripcionlarga");
                Registros[1] = rs.getString("numdoc");
                Registros[2] = rs.getString("nombres");
                Registros[3] = rs.getString("direccion");
                Registros[4] = rs.getString("pais");
                Registros[5] = rs.getString("departamento");
                Registros[6] = rs.getString("provincia");
                Registros[7] = rs.getString("distrito");
                Registros[8] = rs.getString("sexo");
                Registros[9] = rs.getString("telefono");
                Registros[10] = rs.getString("email");
                Registros[11] = rs.getString("fecnacimiento");
                Registros[12] = rs.getString("edad");
                Registros[13] = rs.getString("perconducir");
                Registros[14] = rs.getString("descripcion");
                Registros[15] = rs.getString("organizacion");
                Registros[16] = rs.getString("tipoemp");
                Registros[17] = rs.getString("TIPOLICENCIA");
                Registros[18] = rs.getString("NLICENCIA");
                Registros[19] = rs.getString("activo");
                Registros[20] = rs.getString("jefe");
                Registros[21] = rs.getString("fecham");
                Registros[22] = rs.getString("nomusum");
                Registros[23] = rs.getString("ip");
                Registros[24] = rs.getString("fechaingreso");
                Registros[25] = rs.getString("fechasalida");

                tabla.addRow(Registros);
            }
//			BuscarEmpleado.tableEmpleados.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarEmpleados_A2(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6) {
        String[] titulos = {"Tipo de Documento", "Numero", "Nombre", "Direccion", "Pais", "Departamento", "Provincia",
            "Distrito", "Sexo", "Telefono", "Email", "Fecha de Nacimiento", "Edad",
            "Permiso de Conducir", "Dependencia", "Organizacion", "Tipo de Empleado", "Tipo de Licencia", "N° de Licencia", "Activo", "Jefe",
            "Fecha de Actualizacón", "User", "Ip", "Fecha de Ingreso", "Fecha de Salida"};
        String[] Registros = new String[26];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call mostrarEmpleados(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("descripcionlarga");
                Registros[1] = rs.getString("numdoc");
                Registros[2] = rs.getString("nombres");
                Registros[3] = rs.getString("direccion");
                Registros[4] = rs.getString("pais");
                Registros[5] = rs.getString("departamento");
                Registros[6] = rs.getString("provincia");
                Registros[7] = rs.getString("distrito");
                Registros[8] = rs.getString("sexo");
                Registros[9] = rs.getString("telefono");
                Registros[10] = rs.getString("email");
                Registros[11] = rs.getString("fecnacimiento");
                Registros[12] = rs.getString("edad");
                Registros[13] = rs.getString("perconducir");
                Registros[14] = rs.getString("descripcion");
                Registros[15] = rs.getString("organizacion");
                Registros[16] = rs.getString("tipoemp");
                Registros[17] = rs.getString("TIPOLICENCIA");
                Registros[18] = rs.getString("NLICENCIA");
                Registros[19] = rs.getString("activo");
                Registros[20] = rs.getString("jefe");
                Registros[21] = rs.getString("fecham");
                Registros[22] = rs.getString("nomusum");
                Registros[23] = rs.getString("ip");
                Registros[24] = rs.getString("fechaingreso");
                Registros[25] = rs.getString("fechasalida");

                tabla.addRow(Registros);
            }
//			BuscarEmpleadoA2.tableEmpleados.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarEmpleados_A1(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6) {
        String[] titulos = {"Tipo de Documento", "Numero", "Nombre", "Direccion", "Pais", "Departamento", "Provincia",
            "Distrito", "Sexo", "Telefono", "Email", "Fecha de Nacimiento", "Edad",
            "Permiso de Conducir", "Dependencia", "Organizacion", "Tipo de Empleado", "Tipo de Licencia", "N° de Licencia", "Activo", "Jefe",
            "Fecha de Actualizacón", "User", "Ip", "Fecha de Ingreso", "Fecha de Salida"};
        String[] Registros = new String[26];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call mostrarEmpleados(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("descripcionlarga");
                Registros[1] = rs.getString("numdoc");
                Registros[2] = rs.getString("nombres");
                Registros[3] = rs.getString("direccion");
                Registros[4] = rs.getString("pais");
                Registros[5] = rs.getString("departamento");
                Registros[6] = rs.getString("provincia");
                Registros[7] = rs.getString("distrito");
                Registros[8] = rs.getString("sexo");
                Registros[9] = rs.getString("telefono");
                Registros[10] = rs.getString("email");
                Registros[11] = rs.getString("fecnacimiento");
                Registros[12] = rs.getString("edad");
                Registros[13] = rs.getString("perconducir");
                Registros[14] = rs.getString("descripcion");
                Registros[15] = rs.getString("organizacion");
                Registros[16] = rs.getString("tipoemp");
                Registros[17] = rs.getString("TIPOLICENCIA");
                Registros[18] = rs.getString("NLICENCIA");
                Registros[19] = rs.getString("activo");
                Registros[20] = rs.getString("jefe");
                Registros[21] = rs.getString("fecham");
                Registros[22] = rs.getString("nomusum");
                Registros[23] = rs.getString("ip");
                Registros[24] = rs.getString("fechaingreso");
                Registros[25] = rs.getString("fechasalida");

                tabla.addRow(Registros);
            }
//			BuscarEmpleadoA1.tableEmpleados.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarEmpleados_AES(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6) {
        String[] titulos = {"Tipo de Documento", "Numero", "Nombre", "Direccion", "Pais", "Departamento", "Provincia",
            "Distrito", "Sexo", "Telefono", "Email", "Fecha de Nacimiento", "Edad",
            "Permiso de Conducir", "Dependencia", "Organizacion", "Tipo de Empleado", "Tipo de Licencia", "N° de Licencia", "Activo", "Jefe",
            "Fecha de Actualizacón", "User", "Ip", "Fecha de Ingreso", "Fecha de Salida"};
        String[] Registros = new String[26];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call mostrarEmpleados(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("descripcionlarga");
                Registros[1] = rs.getString("numdoc");
                Registros[2] = rs.getString("nombres");
                Registros[3] = rs.getString("direccion");
                Registros[4] = rs.getString("pais");
                Registros[5] = rs.getString("departamento");
                Registros[6] = rs.getString("provincia");
                Registros[7] = rs.getString("distrito");
                Registros[8] = rs.getString("sexo");
                Registros[9] = rs.getString("telefono");
                Registros[10] = rs.getString("email");
                Registros[11] = rs.getString("fecnacimiento");
                Registros[12] = rs.getString("edad");
                Registros[13] = rs.getString("perconducir");
                Registros[14] = rs.getString("descripcion");
                Registros[15] = rs.getString("organizacion");
                Registros[16] = rs.getString("tipoemp");
                Registros[17] = rs.getString("TIPOLICENCIA");
                Registros[18] = rs.getString("NLICENCIA");
                Registros[19] = rs.getString("activo");
                Registros[20] = rs.getString("jefe");
                Registros[21] = rs.getString("fecham");
                Registros[22] = rs.getString("nomusum");
                Registros[23] = rs.getString("ip");
                Registros[24] = rs.getString("fechaingreso");
                Registros[25] = rs.getString("fechasalida");

                tabla.addRow(Registros);
            }
            BuscarOperador.tableEmpleados.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculos(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6, String valor7) {
        String[] titulos = {" Codigo", "Matricula", "Maquina", "Placa", "Tipo de vehiculo", "Marca", "Modelo",
            "Numserie", "Seriemotor", "N° Factura", "N° Neumaticos", "Responsable", "Fecha de Registro",
            "Operativo", "Función", "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARVEHICULOS(?,?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            cs.setString(7, valor7);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idvehiculo");
                Registros[1] = rs.getString("matricula");
                Registros[2] = rs.getString("maquina");
                Registros[3] = rs.getString("placa");
                Registros[4] = rs.getString("TIPOVEHICULO");
                Registros[5] = rs.getString("marca");
                Registros[6] = rs.getString("modelo");
                Registros[7] = rs.getString("numserie");
                Registros[8] = rs.getString("seriemotor");
                Registros[9] = rs.getString("numfactura");
                Registros[10] = rs.getString("numneumaticos");
                Registros[11] = rs.getString("responsable");
                Registros[12] = rs.getString("fecregistro");
                Registros[13] = rs.getString("operativo");
                Registros[14] = rs.getString("funcion");
                Registros[15] = rs.getString("fecham");
                Registros[16] = rs.getString("nomusum");
                Registros[17] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            RegisVehiculos.tablevehiculos.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculos3(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6, String valor7) {
        String[] titulos = {" Codigo", "Matricula", "Maquina", "Placa", "Tipo de Vehiculo", "Marca", "Modelo",
            "Numserie", "Seriemotor", "N° Factura", "N° Neumaticos", "Responsable", "Fecha de Registro",
            "Operativo", "Función", "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARVEHICULOS(?,?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            cs.setString(7, valor7);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idvehiculo");
                Registros[1] = rs.getString("matricula");
                Registros[2] = rs.getString("maquina");
                Registros[3] = rs.getString("Placa");
                Registros[4] = rs.getString("TIPOVEHICULO");
                Registros[5] = rs.getString("marca");
                Registros[6] = rs.getString("modelo");
                Registros[7] = rs.getString("numserie");
                Registros[8] = rs.getString("seriemotor");
                Registros[9] = rs.getString("numfactura");
                Registros[10] = rs.getString("numneumaticos");
                Registros[11] = rs.getString("responsable");
                Registros[12] = rs.getString("fecregistro");
                Registros[13] = rs.getString("operativo");
                Registros[14] = rs.getString("placa");
                Registros[15] = rs.getString("fecham");
                Registros[16] = rs.getString("nomusum");
                Registros[17] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            buscarvehiculo.tablebuscarv.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculos_M(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6, String valor7) {
        String[] titulos = {" Codigo", "Matricula", "Maquina", "Placa", "Tipo de Vehiculo", "Marca", "Modelo",
            "Numserie", "Seriemotor", "N° Factura", "N° Neumaticos", "Responsable", "Fecha de Registro",
            "Operativo", "Función", "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARVEHICULOS(?,?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            cs.setString(7, valor7);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idvehiculo");
                Registros[1] = rs.getString("matricula");
                Registros[2] = rs.getString("maquina");
                Registros[3] = rs.getString("placa");
                Registros[4] = rs.getString("TIPOVEHICULO");
                Registros[5] = rs.getString("marca");
                Registros[6] = rs.getString("modelo");
                Registros[7] = rs.getString("numserie");
                Registros[8] = rs.getString("seriemotor");
                Registros[9] = rs.getString("numfactura");
                Registros[10] = rs.getString("numneumaticos");
                Registros[11] = rs.getString("responsable");
                Registros[12] = rs.getString("fecregistro");
                Registros[13] = rs.getString("operativo");
                Registros[14] = rs.getString("funcion");
                Registros[15] = rs.getString("fecham");
                Registros[16] = rs.getString("nomusum");
                Registros[17] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            buscarMatricula.tablebuscarv.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculos8(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6, String valor7) {
        String[] titulos = {" Codigo", "Matricula", "Placa", "Maquina", "Tipo de Vehiculo", "Marca", "Modelo",
            "Numserie", "Seriemotor", "N° Factura", "N° Neumaticos", "Responsable", "Fecha de Registro",
            "Operativo", "Función", "Fecha de Actualización", "Usuario", "ip"};
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARVEHICULOS(?,?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            cs.setString(7, valor7);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idvehiculo");
                Registros[1] = rs.getString("matricula");
                Registros[2] = rs.getString("placa");
                Registros[3] = rs.getString("maquina");
                Registros[4] = rs.getString("TIPOVEHICULO");
                Registros[5] = rs.getString("marca");
                Registros[6] = rs.getString("modelo");
                Registros[7] = rs.getString("numserie");
                Registros[8] = rs.getString("seriemotor");
                Registros[9] = rs.getString("numfactura");
                Registros[10] = rs.getString("numneumaticos");
                Registros[11] = rs.getString("responsable");
                Registros[12] = rs.getString("fecregistro");
                Registros[13] = rs.getString("operativo");
                Registros[14] = rs.getString("funcion");
                Registros[15] = rs.getString("fecham");
                Registros[16] = rs.getString("nomusum");
                Registros[17] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            EncontrarVehiculo2.tablebuscarv.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculos80(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6, String valor7) {
        String[] titulos = {" Codigo", "Matricula", "Placa", "Maquina", "Tipo de Vehiculo", "Marca", "Modelo",
            "Numserie", "Seriemotor", "N° Factura", "N° Neumaticos", "Responsable", "Fecha de Registro",
            "Operativo", "Función", "Fecha de Actualización", "Usuario", "ip"};
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARVEHICULOS(?,?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            cs.setString(7, valor7);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idvehiculo");
                Registros[1] = rs.getString("matricula");
                Registros[2] = rs.getString("placa");
                Registros[3] = rs.getString("maquina");
                Registros[4] = rs.getString("TIPOVEHICULO");
                Registros[5] = rs.getString("marca");
                Registros[6] = rs.getString("modelo");
                Registros[7] = rs.getString("numserie");
                Registros[8] = rs.getString("seriemotor");
                Registros[9] = rs.getString("numfactura");
                Registros[10] = rs.getString("numneumaticos");
                Registros[11] = rs.getString("responsable");
                Registros[12] = rs.getString("fecregistro");
                Registros[13] = rs.getString("operativo");
                Registros[14] = rs.getString("funcion");
                Registros[15] = rs.getString("fecham");
                Registros[16] = rs.getString("nomusum");
                Registros[17] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            EncontrarVehiculo.tablebuscarv.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculos4(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6, String valor7) {
        String[] titulos = {" Codigo", "Matricula", "Maquina", "Placa", "Tipo de Vehiculo", "Marca", "Modelo",
            "Numserie", "Seriemotor", "N° Factura", "N° Neumaticos", "Responsable", "Fecha de Registro",
            "Operativo", "Función", "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARVEHICULOS(?,?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            cs.setString(7, valor7);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idvehiculo");
                Registros[1] = rs.getString("matricula");
                Registros[2] = rs.getString("maquina");
                Registros[3] = rs.getString("placa");
                Registros[4] = rs.getString("TIPOVEHICULO");
                Registros[5] = rs.getString("marca");
                Registros[6] = rs.getString("modelo");
                Registros[7] = rs.getString("numserie");
                Registros[8] = rs.getString("seriemotor");
                Registros[9] = rs.getString("numfactura");
                Registros[10] = rs.getString("numneumaticos");
                Registros[11] = rs.getString("responsable");
                Registros[12] = rs.getString("fecregistro");
                Registros[13] = rs.getString("operativo");
                Registros[14] = rs.getString("funcion");
                Registros[15] = rs.getString("fecham");
                Registros[16] = rs.getString("nomusum");
                Registros[17] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            BuscarCuenta.TableBuscarCuenta.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculos5(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6, String valor7) {
        String[] titulos = {" Codigo", "Matricula", "Maquina", "Placa", "Tipo de Vehiculo", "Marca", "Modelo",
            "Numserie", "Seriemotor", "N° Factura", "N° Neumaticos", "Responsable", "Fecha de Registro",
            "Operativo", "Función", "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[16];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARVEHICULOS(?,?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            cs.setString(7, valor7);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idvehiculo");
                Registros[1] = rs.getString("matricula");
                Registros[2] = rs.getString("maquina");
                Registros[3] = rs.getString("placa");
                Registros[4] = rs.getString("TIPOVEHICULO");
                Registros[5] = rs.getString("marca");
                Registros[6] = rs.getString("modelo");
                Registros[7] = rs.getString("numserie");
                Registros[8] = rs.getString("seriemotor");
                Registros[9] = rs.getString("numfactura");
                Registros[10] = rs.getString("numneumaticos");
                Registros[11] = rs.getString("responsable");
                Registros[12] = rs.getString("fecregistro");
                Registros[13] = rs.getString("operativo");
                Registros[14] = rs.getString("funcion");
                Registros[15] = rs.getString("fecham");
                Registros[16] = rs.getString("nomusum");
                Registros[17] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            EncontrarVeh.tablebuscarv.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarDetalleCaja(String valor1, String valor2) {
        String[] titulos = {"Codigo", "Fecha", "Número", "Documento", "Movimiento", "Concepto", "Monto"
        };
        String[] Registros = new String[7];
        tabla = new DefaultTableModel(null, titulos);

        try {

            cs = cn.prepareCall("{call DIARIOCAJA(?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDAPERTURA");
                Registros[1] = rs.getString("FECHAINICIO");
                Registros[2] = rs.getString("NUMERO");
                Registros[3] = rs.getString("DESCRIPCIONCORTA");
                Registros[4] = rs.getString("TIPO");
                Registros[5] = rs.getString("DETALLE");
                Registros[6] = rs.getString("MONTO");
//				Registros[7] = rs.getString("TOTAL");

                tabla.addRow(Registros);
            }
            NuevoMovimiento.tabledc.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarDetalleCajaAP(String valor1, String valor2) {
        String[] titulos = {"Codigo", "Fecha", "Número", "Documento", "Movimiento", "Concepto", "Monto"
        };
        String[] Registros = new String[7];
        tabla = new DefaultTableModel(null, titulos);

        try {

            cs = cn.prepareCall("{call DIARIOCAJA(?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDAPERTURA");
                Registros[1] = rs.getString("FECHAINICIO");
                Registros[2] = rs.getString("NUMERO");
                Registros[3] = rs.getString("DESCRIPCIONCORTA");
                Registros[4] = rs.getString("TIPO");
                Registros[5] = rs.getString("DETALLE");
                Registros[6] = rs.getString("MONTO");
//				Registros[7] = rs.getString("TOTAL");

                tabla.addRow(Registros);
            }
            NuevoMovimientoAP.tabledc.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarDetalleCaja2(String valor1, String valor2) {
        String[] titulos = {"Clave", "Fecha", "Número", "Documento", "Movimiento", "Concepto", "Valor",
            "Saldo"};
        String[] Registros = new String[8];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call DIARIOCAJA(?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDAPERTURA");
                Registros[1] = rs.getString("FECHA");
                Registros[2] = rs.getString("NUMERO");
                Registros[3] = rs.getString("DOCUMENTO");
                Registros[4] = rs.getString("TIPO");
                Registros[5] = rs.getString("CONCEPTO");
                Registros[6] = rs.getString("VALOR");
                Registros[7] = rs.getString("SALDO");

                tabla.addRow(Registros);
            }
//			    ActDetalleCaja.tabledetallecaja2.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculos_2(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6, String valor7) {
        String[] titulos = {" Codigo", "Matricula", "Maquina", "Placa", "Tipo de Vehiculo", "Marca", "Modelo",
            "Numserie", "Seriemotor", "N° Factura", "N° Neumaticos", "Responsable", "Fecha de Registro",
            "Operativo", "Función", "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARVEHICULOS(?,?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            cs.setString(7, valor7);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idvehiculo");
                Registros[1] = rs.getString("matricula");
                Registros[2] = rs.getString("maquina");
                Registros[3] = rs.getString("placa");
                Registros[4] = rs.getString("TIPOVEHICULO");
                Registros[5] = rs.getString("marca");
                Registros[6] = rs.getString("modelo");
                Registros[7] = rs.getString("numserie");
                Registros[8] = rs.getString("seriemotor");
                Registros[9] = rs.getString("numfactura");
                Registros[10] = rs.getString("numneumaticos");
                Registros[11] = rs.getString("responsable");
                Registros[12] = rs.getString("fecregistro");
                Registros[13] = rs.getString("operativo");
                Registros[14] = rs.getString("funcion");
                Registros[15] = rs.getString("fecham");
                Registros[16] = rs.getString("nomusum");
                Registros[17] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            BuscarVehiculo.tablevehiculo_2.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculos_90(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6, String valor7) {
        String[] titulos = {" Codigo", "Matricula", "Maquina", "Placa", "Tipo de Vehiculo", "Marca", "Modelo",
            "Numserie", "Seriemotor", "N° Factura", "N° Neumaticos", "Responsable", "Fecha de Registro",
            "Operativo", "Función", "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARVEHICULOS(?,?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            cs.setString(7, valor7);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idvehiculo");
                Registros[1] = rs.getString("matricula");
                Registros[2] = rs.getString("maquina");
                Registros[3] = rs.getString("placa");
                Registros[4] = rs.getString("TIPOVEHICULO");
                Registros[5] = rs.getString("marca");
                Registros[6] = rs.getString("modelo");
                Registros[7] = rs.getString("numserie");
                Registros[8] = rs.getString("seriemotor");
                Registros[9] = rs.getString("numfactura");
                Registros[10] = rs.getString("numneumaticos");
                Registros[11] = rs.getString("responsable");
                Registros[12] = rs.getString("fecregistro");
                Registros[13] = rs.getString("operativo");
                Registros[14] = rs.getString("funcion");
                Registros[15] = rs.getString("fecham");
                Registros[16] = rs.getString("nomusum");
                Registros[17] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            BuscarVht.tablev.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculos_AES2(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6, String valor7) {
        String[] titulos = {" Codigo", "Matricula", "Maquina", "Placa", "Tipo de Vehiculo", "Marca", "Modelo",
            "Numserie", "Seriemotor", "N° Factura", "N° Neumaticos", "Responsable", "Fecha de Registro",
            "Operativo", "Función", "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARVEHICULOS(?,?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            cs.setString(7, valor7);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idvehiculo");
                Registros[1] = rs.getString("matricula");
                Registros[2] = rs.getString("maquina");
                Registros[3] = rs.getString("placa");
                Registros[4] = rs.getString("TIPOVEHICULO");
                Registros[5] = rs.getString("marca");
                Registros[6] = rs.getString("modelo");
                Registros[7] = rs.getString("numserie");
                Registros[8] = rs.getString("seriemotor");
                Registros[9] = rs.getString("numfactura");
                Registros[10] = rs.getString("numneumaticos");
                Registros[11] = rs.getString("responsable");
                Registros[12] = rs.getString("fecregistro");
                Registros[13] = rs.getString("operativo");
                Registros[14] = rs.getString("funcion");
                Registros[15] = rs.getString("fecham");
                Registros[16] = rs.getString("nomusum");
                Registros[17] = rs.getString("ip");

                tabla.addRow(Registros);
            }
//			BuscarPC2.tablevehiculo_2.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculos_20(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6, String valor7) {
        String[] titulos = {" Codigo", "Matricula", "Maquina", "Placa", "Tipo de Vehiculo", "Marca", "Modelo",
            "Numserie", "Seriemotor", "N° Factura", "N° Neumaticos", "Responsable", "Fecha de Registro",
            "Operativo", "Función", "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARVEHICULOS(?,?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            cs.setString(7, valor7);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idvehiculo");
                Registros[1] = rs.getString("matricula");
                Registros[2] = rs.getString("maquina");
                Registros[3] = rs.getString("placa");
                Registros[4] = rs.getString("TIPOVEHICULO");
                Registros[5] = rs.getString("marca");
                Registros[6] = rs.getString("modelo");
                Registros[7] = rs.getString("numserie");
                Registros[8] = rs.getString("seriemotor");
                Registros[9] = rs.getString("numfactura");
                Registros[10] = rs.getString("numneumaticos");
                Registros[11] = rs.getString("responsable");
                Registros[12] = rs.getString("fecregistro");
                Registros[13] = rs.getString("operativo");
                Registros[14] = rs.getString("funcion");
                Registros[15] = rs.getString("fecham");
                Registros[16] = rs.getString("nomusum");
                Registros[17] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            BuscarPT.tablevehiculo_2.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculos_30(String valor1, String valor2, String valor3, String valor4, String valor5,
            String valor6, String valor7) {
        String[] titulos = {" Codigo", "Matricula", "Maquina", "Placa", "Tipo de Vehiculo", "Marca", "Modelo",
            "Numserie", "Seriemotor", "N° Factura", "N° Neumaticos", "Responsable", "Fecha de Registro",
            "Operativo", "Función", "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARVEHICULOS(?,?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            cs.setString(7, valor7);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idvehiculo");
                Registros[1] = rs.getString("matricula");
                Registros[2] = rs.getString("maquina");
                Registros[3] = rs.getString("placa");
                Registros[4] = rs.getString("TIPOVEHICULO");
                Registros[5] = rs.getString("marca");
                Registros[6] = rs.getString("modelo");
                Registros[7] = rs.getString("numserie");
                Registros[8] = rs.getString("seriemotor");
                Registros[9] = rs.getString("numfactura");
                Registros[10] = rs.getString("numneumaticos");
                Registros[11] = rs.getString("responsable");
                Registros[12] = rs.getString("fecregistro");
                Registros[13] = rs.getString("operativo");
                Registros[14] = rs.getString("funcion");
                Registros[15] = rs.getString("fecham");
                Registros[16] = rs.getString("nomusum");
                Registros[17] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            BuscarPC.tablevehiculo_2.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarProveedor(String valor1, String valor2) {
        String[] titulos = {" Codigo", "Compañia", "Razon Social", "Telefono", "Email", "Observación",
            "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[9];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARPROV(?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);

            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idproveedor");
                Registros[1] = rs.getString("compañia");
                Registros[2] = rs.getString("razsocial");
                Registros[3] = rs.getString("telefono");
                Registros[4] = rs.getString("email");
                Registros[5] = rs.getString("observacion");
                Registros[6] = rs.getString("fecham");
                Registros[7] = rs.getString("nomusum");
                Registros[8] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            buscarprov.tablebuscarp.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarProveedor4(String valor1, String valor2) {
        String[] titulos = {" Codigo", "Compañia", "Razon social", "Telefono", "Email", "Observación",
            "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[9];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARPROV(?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);

            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idproveedor");
                Registros[1] = rs.getString("compañia");
                Registros[2] = rs.getString("razsocial");
                Registros[3] = rs.getString("telefono");
                Registros[4] = rs.getString("email");
                Registros[5] = rs.getString("observacion");
                Registros[6] = rs.getString("fecham");
                Registros[7] = rs.getString("nomusum");
                Registros[8] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            BuscarDocumento.TableBuscarDocumentos.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarProveedor5(String valor1, String valor2) {
        String[] titulos = {" Codigo", "Compañia", "Razon Social", "Telefono", "Email", "Observación",
            "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[9];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARPROV(?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);

            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("idproveedor");
                Registros[1] = rs.getString("compañia");
                Registros[2] = rs.getString("razsocial");
                Registros[3] = rs.getString("telefono");
                Registros[4] = rs.getString("email");
                Registros[5] = rs.getString("observacion");
                Registros[6] = rs.getString("fecham");
                Registros[7] = rs.getString("nomusum");
                Registros[8] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            EncontrarProv.tablebuscarp.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarDetalleVH(String valor1, String valor2) {
        String[] titulos = {"Item", "Codigo", "Color", "Clase", "Capm3", "Tipo de Combustible", "Eje", "Carga Util",
            "Peso Neto", "Largo", "Ancho", "Alto", "Carroceria", "Tarjeta de Propietario", "N° Serie de Chasis",
            "N° de Habilitación", "Año", "Potencia", "Galones", "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[22];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARDETALLEVH(?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDDETVEHICULO");
                Registros[1] = rs.getString("idvehiculo");
                Registros[2] = rs.getString("color");
                Registros[3] = rs.getString("clase");
                Registros[4] = rs.getString("capm3");
                Registros[5] = rs.getString("tipocombustible");
                Registros[6] = rs.getString("eje");
                Registros[7] = rs.getString("cargautil");
                Registros[8] = rs.getString("pesoneto");
                Registros[9] = rs.getString("largo");
                Registros[10] = rs.getString("ancho");
                Registros[11] = rs.getString("alto");
                Registros[12] = rs.getString("carroceria");
                Registros[13] = rs.getString("tarjetapro");
                Registros[14] = rs.getString("numseriechasis");
                Registros[15] = rs.getString("numhabilitacion");
                Registros[16] = rs.getString("anov");
                Registros[17] = rs.getString("potencia");
                Registros[18] = rs.getString("galones");
                Registros[19] = rs.getString("fecham");
                Registros[20] = rs.getString("nomusum");
                Registros[21] = rs.getString("ip");

                tabla.addRow(Registros);
            }
            RegisVehiculos.tabledetalle.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarEntradaSalidasVHT(String valor1, String valor2, String valor3, String valor4, String valor5) {
        String[] titulos = {"Item", "Codigo Vehículo", "Fecha Salida", "Hora Salida", "Fecha Entrada", "Hora Entrada", "Conductor", "Placa Tracto", "Placa Carreta", "Observaciones", "Destino", "Producto Ida", "Producto Retorno", "Gastos", "Precio Viaje", "Kilometraje", "Actualización", "Usuario", "Ip"};
        String[] Registros = new String[19];
        tabla = new DefaultTableModel(null, titulos);

        try {

            cs = cn.prepareCall("{call MOSTRARVHT(?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            rs = cs.executeQuery();

            while (rs.next()) {
                Registros[0] = rs.getString("idES");
                Registros[1] = rs.getString("idvehiculo");
                Registros[2] = rs.getString("fechaSalida");
                Registros[3] = rs.getString("horaSalida");
                Registros[4] = rs.getString("fechaEntrada");
                Registros[5] = rs.getString("horaEntrada");
                Registros[6] = rs.getString("CONDUCTOR");
                Registros[7] = rs.getString("placatracto");
                Registros[8] = rs.getString("placacarreta");
                Registros[9] = rs.getString("observaciones");
                Registros[10] = rs.getString("destino");
                Registros[11] = rs.getString("productoIda");
                Registros[12] = rs.getString("productoRetorno");
                Registros[13] = rs.getString("GASTOS");
                Registros[14] = rs.getString("precioViaje");
                Registros[15] = rs.getString("kilometraje");
                Registros[16] = rs.getString("FECHAM");
                Registros[17] = rs.getString("NOMUSUM");
                Registros[18] = rs.getString("IP");

                tabla.addRow(Registros);
            }

            RegistVht.table.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(entradasalidaVHT.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarEntradaSalidasMP(String valor1, String valor2, String valor3, String valor4) {
        String[] titulos = {"Item", "Codigo Vehículo", "Fecha Salida", "Hora Salida", "Fecha Entrada", "Hora Entrada", "Operador", "N° Parte", "Fecha Parte", "Placa",
            "Cliente", "Obra", "Turno", "Tipo Combustible", "Consumo", "Medición", "Comienzo", "Termino", "Horas Trabajadas", "Viajes", "Observación", "Supervisor", "Ultima Actualización", "Usuario", "Ip"};
        String[] Registros = new String[25];
        tabla = new DefaultTableModel(null, titulos);

        try {

            cs = cn.prepareCall("{call MOSTRARMP(?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);

            rs = cs.executeQuery();

            while (rs.next()) {
                Registros[0] = rs.getString("idES");
                Registros[1] = rs.getString("idvehiculo");
                Registros[2] = rs.getString("fechaSalida");
                Registros[3] = rs.getString("horaSalida");
                Registros[4] = rs.getString("fechaEntrada");
                Registros[5] = rs.getString("horaEntrada");
                Registros[6] = rs.getString("operador");
                Registros[7] = rs.getString("nparte");
                Registros[8] = rs.getString("fechaparte");
                Registros[9] = rs.getString("placa");
                Registros[10] = rs.getString("cliente");
                Registros[11] = rs.getString("obra");
                Registros[12] = rs.getString("turno");
                Registros[13] = rs.getString("tipocombustible");
                Registros[14] = rs.getString("consumo");
                Registros[15] = rs.getString("medicion");
                Registros[16] = rs.getString("comienzo");
                Registros[17] = rs.getString("termino");
                Registros[18] = rs.getString("horastrabajadas");
                Registros[19] = rs.getString("viajes");
                Registros[20] = rs.getString("observacion");
                Registros[21] = rs.getString("supervisor");
                Registros[22] = rs.getString("FECHAM");
                Registros[23] = rs.getString("NOMUSUM");
                Registros[24] = rs.getString("ip");

                tabla.addRow(Registros);
            }

            RegistMP.table.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarManteniento(String valor1, String valor2, String valor3, String valor4, String valor5) {
        String[] titulos = {"Codigo", "Nombre", "Importe", "Fecha de Trabajo", "Tipo de Mantenimiento", "IdSocio", "Razón Social",
            "Ultima Revisión KM", "Días Vencidos", "Siguiente revisión", "Ultima Revisión", "Vencimiento KM", "Siguiente Revisión KM", "IdMaquina", "Maquina",
            "IdEmpleado", "Empleado", "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[20];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARMANTENIMIENTO(?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);

            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDMANTENIMIENTO");
                Registros[1] = rs.getString("NOMBRE");
                Registros[2] = rs.getString("IMPORTE");
                Registros[3] = rs.getString("FECHAMant");
                Registros[4] = rs.getString("descripcion");
                Registros[5] = rs.getString("IDPROVEEDOR");
                Registros[6] = rs.getString("RAZSOCIAL");
                Registros[7] = rs.getString("ULTIMAREV");
                Registros[8] = rs.getString("DIASVEN");
                Registros[9] = rs.getString("SIGUIENTEREV");
                Registros[10] = rs.getString("ULTIMAREVKM");
                Registros[11] = rs.getString("VENCIMIENTOKM");
                Registros[12] = rs.getString("SIGTREVKM");
                Registros[13] = rs.getString("IDVEHICULO");
                Registros[14] = rs.getString("maquina");
                Registros[15] = rs.getString("IDEMPLEADO");
                Registros[16] = rs.getString("NOMBRES");
                Registros[17] = rs.getString("FECHAM");
                Registros[18] = rs.getString("NOMUSUM");
                Registros[19] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            Mantenimiento.tablemantenimiento.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarRespuesto(String valor1, String valor2) {
        String[] titulos = {"Clave", "Codigo", "Descripción,", "Marca", "Iva", "Cantidad", "Precio", "SubTotal", "Importe de Iva",
            "Total", "Fecha de Actualización", "Usuario", "IP"};
        String[] Registros = new String[13];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARREPUESTO(?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);

            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDREPUESTOS");
                Registros[1] = rs.getString("IDMANTENIMIENTO");
                Registros[2] = rs.getString("DESCRIPCION");
                Registros[3] = rs.getString("MARCA");
                Registros[4] = rs.getString("IVA");
                Registros[5] = rs.getString("CANTIDAD");
                Registros[6] = rs.getString("PRECIO");
                Registros[7] = rs.getString("SUBTOTAL");
                Registros[8] = rs.getString("IMPORTEIVA");
                Registros[9] = rs.getString("TOTAL");
                Registros[10] = rs.getString("FECHAM");
                Registros[11] = rs.getString("NOMUSUM");
                Registros[12] = rs.getString("IP");
                tabla.addRow(Registros);
            }
            Mantenimiento.tablerepuestos.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void RespXID(String valor1) {
        String[] titulos = {"Codigo", "Descripción", "Marca", "Iva", "Cantidad", "Precio", "SubTotal", "Importe Iva",
            "Total"};
        String[] Registros = new String[9];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call FILTROMANT(?)}");
            cs.setString(1, valor1);

            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDMANTENIMIENTO");
                Registros[1] = rs.getString("DESCRIPCION");
                Registros[2] = rs.getString("MARCA");
                Registros[3] = rs.getString("IVA");
                Registros[5] = rs.getString("CANTIDAD");
                Registros[6] = rs.getString("PRECIO");
                Registros[8] = rs.getString("SUBTOTAL");
                Registros[4] = rs.getString("IMPORTEIVA");
                Registros[7] = rs.getString("TOTAL");

                tabla.addRow(Registros);
            }
            nuevoMant.tablenuevoResp.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Repuesto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarServicios(String valor1, String valor2, String valor3) {
        String[] titulos = {"Clave", "Codigo", "Fecha", "Servicio", "Descripción", "Precio", "Observación", "Fecha de Actualización",
            "Usuario", "Ip"};
        String[] Registros = new String[10];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARSERVICIO(?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);

            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDSERV");
                Registros[1] = rs.getString("IDMANTENIMIENTO");
                Registros[2] = rs.getString("FECHA");
                Registros[3] = rs.getString("SERVICIO");
                Registros[4] = rs.getString("DESCRIPCION");
                Registros[5] = rs.getString("PRECIO");
                Registros[6] = rs.getString("OBSERVACION");
                Registros[7] = rs.getString("FECHAM");
                Registros[8] = rs.getString("NOMUSUM");
                Registros[9] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            Mantenimiento.tableservicios.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarServXID(String valor1) {
        String[] titulos = {"Codigo", "Fecha", "Servicio", "Descripción", "Precio", "Observacion"
        };
        String[] Registros = new String[10];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call FILTROSERV(?)}");
            cs.setString(1, valor1);

            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDMANTENIMIENTO");
                Registros[1] = rs.getString("FECHA");
                Registros[2] = rs.getString("SERVICIO");
                Registros[3] = rs.getString("DESCRIPCION");
                Registros[4] = rs.getString("PRECIO");
                Registros[5] = rs.getString("OBSERVACION");

                tabla.addRow(Registros);
            }
            nuevoMant.tableservmant.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean validar(String usuario, String password) {
        try {

            cs = getConnection().prepareCall("{call proc_UsuariosValidar(?,?)}");

            cs.setString(1, usuario);
            cs.setString(2, password);

            rs = cs.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public void listarRol(JComboBox box) {

        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Statement st = null;
        Connection c = null;
        ResultSet rs = null;
        try {
            c = conec.getConnection();
            st = c.createStatement();

            rs = st.executeQuery("SELECT * FROM Rol");
            value = new DefaultComboBoxModel();
            box.setModel(value);

            while (rs.next()) {
                value.addElement(new Rol(rs.getString(1), rs.getString(2)));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void listarDocumentos(JComboBox box) {

        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Statement st = null;
        Connection c = null;
        ResultSet rs = null;
        try {
            c = conec.getConnection();
            st = c.createStatement();

            rs = st.executeQuery("SELECT * FROM DOCUMENTOS");
            value = new DefaultComboBoxModel();
            box.setModel(value);

            while (rs.next()) {
                value.addElement(new Rol(rs.getString(1), rs.getString(2)));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void listarConcepto(JComboBox box) {

        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Statement st = null;
        Connection c = null;
        ResultSet rs = null;
        try {
            c = conec.getConnection();
            st = c.createStatement();

            rs = st.executeQuery("SELECT * FROM CONCEPTO");
            value = new DefaultComboBoxModel();
            box.setModel(value);

            while (rs.next()) {
                value.addElement(new Rol(rs.getString(1), rs.getString(2)));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void listarTC(JComboBox box) {

        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Statement st = null;
        Connection c = null;
        ResultSet rs = null;
        try {
            c = conec.getConnection();
            st = c.createStatement();

            rs = st.executeQuery("SELECT * FROM TIPOCOMBUSTIBLE");
            value = new DefaultComboBoxModel();
            box.setModel(value);

            while (rs.next()) {
                value.addElement(new Rol(rs.getString(1), rs.getString(2)));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void listarIdrol(JComboBox box, String id) {

        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("SELECT * FROM ROL WHERE IDROL = ?");
            ps.setString(1, id);
            rs = ps.executeQuery();
            value = new DefaultComboBoxModel();
            box.setModel(value);
            while (rs.next()) {
                value.addElement(rs.getString(1));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }
        }

    }

    public String GuardarUsuario(Usuarios user) {
        conectar conec = new conectar();
        Connection con = null;
        try {
//  INSERT INTO USUARIOS (USERNAME,PASSWORD,NUMDOC,IDEMPLEADO,NOMBRES,EMAIL,ESACTIVO,ESADMIN,IDROL,FECHAC,FECHAM,NOMUSUM,IP) 
            con = conec.getConnection();
            cs = con.prepareCall("{call CREARUSUARIO(?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, user.getUsername());
            cs.setString(2, user.getPassword());
            cs.setString(3, user.getNumdoc());
            cs.setString(4, user.getIde());
            cs.setString(5, user.getNombres());
            cs.setString(6, user.getEmail());
            cs.setString(7, user.getEsactivo());
            cs.setString(8, user.getEsadmin());
            cs.setString(9, user.getRol());
            cs.setString(10, user.getFechac());
            cs.setString(11, user.getFecham());
            cs.setString(12, user.getNomusum());
            cs.setString(13, user.getIp());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public String GuardarApCaja(ApCaja cj) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CREARCAJA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, cj.getIDAPERTURA());
            cs.setString(2, cj.getNOMBRE());
            cs.setString(3, cj.getCOMPAÑIA());
            cs.setString(4, cj.getUSUARIO());
            cs.setString(5, cj.getOBSERVACION());
            cs.setString(6, cj.getFECHAINICIO());
            cs.setDouble(7, cj.getSALDOINICIAL());
            cs.setDouble(8, cj.getSALDO());
            cs.setDouble(9, cj.getSALDOFINAL());
            cs.setString(10, cj.getESTADO());
            cs.setDouble(11, cj.getEGRESOS());
            cs.setDouble(12, cj.getINGRESOS());
            cs.setString(13, cj.getFECHAM());
            cs.setString(14, cj.getNOMUSUM());
            cs.setString(15, cj.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public String GuardarDetalleCaja(DetCaja cj) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CREARDETALLECAJA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, cj.getIDAPERTURA());
            cs.setString(2, cj.getNOMBRE());
            cs.setString(3, cj.getDETALLE());
            cs.setInt(4, cj.getIDDOCUMENTO());
            cs.setString(5, cj.getSERIE());
            cs.setString(6, cj.getNUMERO());
            cs.setString(7, cj.getFECHAINGRESO());
            cs.setString(8, cj.getTIPO());
            cs.setString(9, cj.getIDCOLABORADOR());
            cs.setString(10, cj.getCOLABORADOR());
            cs.setDouble(11, cj.getTIPOCAMBIO());
            cs.setString(12, cj.getMONEDA());
            cs.setString(13, cj.getFORMAPAGO());
            cs.setDouble(14, cj.getMONTO());
            cs.setString(15, cj.getFECHAACT());
            cs.setString(16, cj.getUSU());
            cs.setString(17, cj.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public String ModificarAp(ApCaja cj) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ACTAPCAJA(?,?,?,?,?)}");

            cs.setString(1, cj.getIDAPERTURA());
            cs.setString(2, cj.getOBSERVACION());
            cs.setString(3, cj.getFECHAM());
            cs.setString(4, cj.getNOMUSUM());
            cs.setString(5, cj.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro actualizado correctamente";

    }

    public String ModificarDetalleCaja(DetCaja cj) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ACTDETALLECAJA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, cj.getIDDETALLE());
            cs.setString(2, cj.getIDAPERTURA());
            cs.setString(3, cj.getNOMBRE());
            cs.setString(4, cj.getDETALLE());
            cs.setInt(5, cj.getIDDOCUMENTO());
            cs.setString(6, cj.getSERIE());
            cs.setString(7, cj.getNUMERO());
            cs.setString(8, cj.getFECHAINGRESO());
            cs.setString(9, cj.getTIPO());
            cs.setString(10, cj.getIDCOLABORADOR());
            cs.setString(11, cj.getCOLABORADOR());
            cs.setDouble(12, cj.getTIPOCAMBIO());
            cs.setString(13, cj.getMONEDA());
            cs.setString(14, cj.getFORMAPAGO());
            cs.setDouble(15, cj.getMONTO());
            cs.setString(16, cj.getFECHAACT());
            cs.setString(17, cj.getUSU());
            cs.setString(18, cj.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro actualizado correctamente";

    }

    public String ModificarApCaja(ApCaja apc) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call MODIFICARAPCAJA(?,?,?,?,?)}");

            cs.setString(1, apc.getIDAPERTURA());
            cs.setDouble(2, apc.getSALDO());
            cs.setDouble(3, apc.getSALDOFINAL());
            cs.setDouble(4, apc.getEGRESOS());
            cs.setDouble(5, apc.getINGRESOS());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return " ";

    }

    public String ModificarUsuario(Usuarios user) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ActualizarUsuario(?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, user.getUsername());
            cs.setString(2, user.getPassword());
            cs.setString(3, user.getNumdoc());
            cs.setString(4, user.getIde());
            cs.setString(5, user.getNombres());
            cs.setString(6, user.getEmail());
            cs.setString(7, user.getEsactivo());
            cs.setString(8, user.getEsadmin());
            cs.setString(9, user.getRol());
            cs.setString(10, user.getFechac());
            cs.setString(11, user.getFecham());
            cs.setString(12, user.getNomusum());
            cs.setString(13, user.getIp());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro modificado correctamente";

    }

    public String ModificarVehiculo(Vehiculo vh) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ActualizarVehiculo(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, vh.getIdvehiculo());
            cs.setString(2, vh.getMatricula());
            cs.setString(3, vh.getMaquina());
            cs.setString(4, vh.getPlaca());
            cs.setInt(5, vh.getIdTipo());
            cs.setString(6, vh.getMarca());
            cs.setString(7, vh.getModelo());
            cs.setString(8, vh.getNumserie());
            cs.setString(9, vh.getSeriemotor());
            cs.setString(10, vh.getNumfactura());
            cs.setInt(11, vh.getNumneumaticos());
            cs.setString(12, vh.getResponsable());
            cs.setString(13, vh.getFecregistro());
            cs.setString(14, vh.getOperativo());
            cs.setString(15, vh.getFuncion());
            cs.setString(16, vh.getFecham());
            cs.setString(17, vh.getNumusum());
            cs.setString(18, vh.getIp());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro modificado correctamente";

    }

    public String GuardarVehiculo(Vehiculo vh) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CrearVehiculo(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, vh.getIdvehiculo());
            cs.setString(2, vh.getMatricula());
            cs.setString(3, vh.getMaquina());
            cs.setString(4, vh.getPlaca());
            cs.setInt(5, vh.getIdTipo());
            cs.setString(6, vh.getMarca());
            cs.setString(7, vh.getModelo());
            cs.setString(8, vh.getNumserie());
            cs.setString(9, vh.getSeriemotor());
            cs.setString(10, vh.getNumfactura());
            cs.setInt(11, vh.getNumneumaticos());
            cs.setString(12, vh.getResponsable());
            cs.setString(13, vh.getFecregistro());
            cs.setString(14, vh.getOperativo());
            cs.setString(15, vh.getFuncion());
            cs.setString(16, vh.getFecham());
            cs.setString(17, vh.getNumusum());
            cs.setString(18, vh.getIp());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro Creado correctamente";

    }

    public String GuardarESVHT(entradasalidaVHT es) {

        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CrearVHT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, es.getIdvehiculo());
            cs.setString(2, es.getFechaSalida());
            cs.setString(3, es.getHoraSalida());
            cs.setString(4, es.getFechaEntrada());
            cs.setString(5, es.getHoraEntrada());
            cs.setString(6, es.getConductor());
            cs.setString(7, es.getPlacatracto());
            cs.setString(8, es.getPlacacarreta());
            cs.setString(9, es.getObservaciones());
            cs.setString(10, es.getDestino());
            cs.setString(11, es.getProductoIda());
            cs.setString(12, es.getProductoRetorno());
            cs.setDouble(13, es.getGastos());
            cs.setDouble(14, es.getPrecioViaje());
            cs.setDouble(15, es.getKilometraje());
            cs.setString(16, es.getFECHAM());
            cs.setString(17, es.getNOMUSUM());
            cs.setString(18, es.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public String GuardarESMP(entradasalidaMP es) {

        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CrearMP(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, es.getIdvehiculo());
            cs.setString(2, es.getFechaSalida());
            cs.setString(3, es.getHoraSalida());
            cs.setString(4, es.getFechaEntrada());
            cs.setString(5, es.getHoraEntrada());
            cs.setString(6, es.getOperador());
            cs.setString(7, es.getNparte());
            cs.setString(8, es.getFechaparte());
            cs.setString(9, es.getPlaca());
            cs.setString(10, es.getCliente());
            cs.setString(11, es.getObra());
            cs.setString(12, es.getTurno());
            cs.setString(13, es.getTipocombustible());
            cs.setString(14, es.getConsumo());
            cs.setString(15, es.getMedicion());
            cs.setString(16, es.getComienzo());
            cs.setString(17, es.getTermino());
            cs.setString(18, es.getHorastrabajadas());
            cs.setString(19, es.getViajes());
            cs.setString(20, es.getObservacion());
            cs.setString(21, es.getSupervisor());
            cs.setString(22, es.getFECHAM());
            cs.setString(23, es.getNOMUSUM());
            cs.setString(24, es.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public String verificarRol(String descripcion) {

        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        String valor = "";
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("SELECT * FROM ROL WHERE descripcion = ?");
            ps.setString(1, descripcion);
            rs = ps.executeQuery();

            while (rs.next()) {
                valor = rs.getString("idrol");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }

        }
        return valor;

    }

    public String retornarFecha(String fecha) {

        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        String valor = "";
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("select * from APERTURACAJA WHERE FECHAINICIO = ?");
            ps.setString(1, fecha);
            rs = ps.executeQuery();

            while (rs.next()) {
                valor = rs.getString("FECHAINICIO");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }

        }
        return valor;

    }

    public String retornarIDAPERTURA(String fecha) {

        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        String valor = "";
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("select * from APERTURACAJA WHERE FECHAINICIO = ?");
            ps.setString(1, fecha);
            rs = ps.executeQuery();

            while (rs.next()) {
                valor = rs.getString("IDAPERTURA");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }

        }
        return valor;

    }

    public String retornarnombre(String fecha) {

        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        String valor = "";
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("SELECT * FROM APERTURACAJA WHERE FECHAINICIO = ?");
            ps.setString(1, fecha);
            rs = ps.executeQuery();

            while (rs.next()) {
                valor = rs.getString("NOMBRE");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }

        }
        return valor;

    }

    public void listarTipoDoc(JComboBox box) {

        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Statement st = null;
        Connection c = null;
        ResultSet rs = null;
        try {
            c = conec.getConnection();
            st = c.createStatement();

            rs = st.executeQuery("SELECT * FROM TIPODOC");
            value = new DefaultComboBoxModel();
            box.setModel(value);

            while (rs.next()) {
                value.addElement(new Rol(rs.getString(1), rs.getString(3)));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void listarCargo(JComboBox box) {

        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Statement st = null;
        Connection c = null;
        ResultSet rs = null;
        try {
            c = conec.getConnection();
            st = c.createStatement();

            rs = st.executeQuery("SELECT * FROM CARGO");
            value = new DefaultComboBoxModel();
            box.setModel(value);

            while (rs.next()) {
                value.addElement(new Cargo(rs.getInt(1), rs.getString(2)));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void listarDependencia(JComboBox box) {

        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Statement st = null;
        Connection c = null;
        ResultSet rs = null;
        try {
            c = conec.getConnection();
            st = c.createStatement();

            rs = st.executeQuery("SELECT * FROM Dependencia");
            value = new DefaultComboBoxModel();
            box.setModel(value);

            while (rs.next()) {
                value.addElement(new Rol(rs.getString(1), rs.getString(2)));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void listarPais(JComboBox box) {
        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Statement st = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            con = conec.getConnection();
            st = con.createStatement();

            rs = st.executeQuery("SELECT * FROM Pais");
            value = new DefaultComboBoxModel();
            box.setModel(value);

            while (rs.next()) {
                value.addElement(new Pais(rs.getInt(1), rs.getString(2)));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                rs.close();
                c.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void listarDepartamento(JComboBox box, int id) {

        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("SELECT * FROM Departamento where IdPais = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            value = new DefaultComboBoxModel();
            box.setModel(value);
            while (rs.next()) {
                value.addElement(new Departamento(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }
        }

    }

    public void listarProvincia(JComboBox box, int id) {

        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("SELECT * FROM Provincia where IdDepartamento = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            value = new DefaultComboBoxModel();
            box.setModel(value);
            while (rs.next()) {
                value.addElement(new Provincia(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }
        }

    }

    public void listarDistrito(JComboBox box, int id) {

        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("SELECT * FROM Distrito where IdProvincia = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            value = new DefaultComboBoxModel();
            box.setModel(value);
            while (rs.next()) {
                value.addElement(new Distrito(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }
        }

    }

    public String ModificarEmpleado(Empleado emp) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ActualizarEmpleado(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            // cs = con.prepareCall("{call ActualizarEmpleado(?,?,?)}");
            cs.setInt(1, emp.getIdtipodoc());
            cs.setString(2, emp.getNumdoc());
            cs.setString(3, emp.getNombres());
            cs.setString(4, emp.getDirección());
            cs.setString(5, emp.getPais());
            cs.setString(6, emp.getDepartamento());
            cs.setString(7, emp.getProvincia());
            cs.setString(8, emp.getDistrito());
            cs.setString(9, emp.getSexo());
            cs.setString(10, emp.getTelefono());
            cs.setString(11, emp.getEmail());
            cs.setString(12, emp.getFecnacimiento());
            cs.setInt(13, emp.getEdad());
            cs.setString(14, emp.getPerconducir());
            cs.setInt(15, emp.getIddependencia());
            cs.setString(16, emp.getOrganización());
            cs.setInt(17, emp.getIdcargo());
            cs.setString(18, emp.getTipoemp());
            cs.setString(19, emp.getTipolicencia());
            cs.setString(20, emp.getNlicencia());
            cs.setString(21, emp.getActivo());
            cs.setString(22, emp.getJefe());
            cs.setString(23, emp.getFechaIngreso());
            cs.setString(24, emp.getFechaSalida());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro modificado correctamente";

    }

    public int verificarTipoDoc(String tipoDoc) {

        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        int valor = 0;
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("SELECT * FROM TIPODOC WHERE DESCRIPCIONLARGA = ?");
            ps.setString(1, tipoDoc);
            rs = ps.executeQuery();

            while (rs.next()) {
                valor = rs.getInt("IDTIPODOC");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }

        }
        return valor;

    }

    public int verificarDependencia(String dependencia) {

        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        int valor = 0;
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("SELECT * FROM Dependencia WHERE DESCRIPCION = ?");
            ps.setString(1, dependencia);
            rs = ps.executeQuery();

            while (rs.next()) {
                valor = rs.getInt("iddependencia");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }
        }
        return valor;

    }

    public int verificarDocumento(String descripcion) {

        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        int valor = 0;
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("SELECT * FROM DOCUMENTOS WHERE DESCRIPCIONCORTA = ?");
            ps.setString(1, descripcion);
            rs = ps.executeQuery();

            while (rs.next()) {
                valor = rs.getInt("IDDOCUMENTO");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }
        }
        return valor;

    }

    public int verificarTipoMantenimiento(String mantenimiento) {
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        int valor = 0;
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("SELECT * FROM TIPOMANTENIMIENTO WHERE DESCRIPCION = ?");
            ps.setString(1, mantenimiento);
            rs = ps.executeQuery();
            while (rs.next()) {
                valor = rs.getInt("IDTIPOM");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }
        }
        return valor;
    }

    public int verificarCARGO(String cargo) {

        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        int valor = 0;
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("SELECT * FROM CARGO WHERE DESCRIPCION = ?");
            ps.setString(1, cargo);
            rs = ps.executeQuery();

            while (rs.next()) {
                valor = rs.getInt("IDCARGO");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }
        }
        return valor;

    }

    public String GuardarEmpleado(Empleado e) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CREAREMPLEADO(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            // cs = con.prepareCall("{call CREAREMPLEADO(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, e.getIdempleado());
            cs.setString(2, e.getNumdoc());
            cs.setString(3, e.getNombres());
            cs.setInt(4, e.getIdtipodoc());
            cs.setString(5, e.getDirección());
            cs.setString(6, e.getPais());
            cs.setString(7, e.getDepartamento());
            cs.setString(8, e.getProvincia());
            cs.setString(9, e.getDistrito());
            cs.setString(10, e.getSexo());
            cs.setString(11, e.getTelefono());
            cs.setString(12, e.getEmail());
            cs.setString(13, e.getFecnacimiento());
            cs.setInt(14, e.getEdad());
            cs.setString(15, e.getPerconducir());
            cs.setInt(16, e.getIddependencia());
            cs.setString(17, e.getOrganización());            
            cs.setString(18, e.getTipoemp());
            cs.setString(19, e.getTipolicencia());
            cs.setString(20, e.getNlicencia());
            cs.setString(21, e.getActivo());
            cs.setString(22, e.getJefe());
            cs.setString(23, e.getFecham());
            cs.setString(24, e.getNomusum());
            cs.setString(25, e.getIp());
            cs.setString(26, e.getFechaIngreso());
            cs.setString(27, e.getFechaSalida());
            cs.setInt(28, e.getIdcargo());
            
            cs.executeQuery();

        } catch (Exception exc) {
            exc.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException exc) {
                exc.getMessage();
            }
        }

        return "Registro guardado correctamente";

    }

    public int verificarTipoVH(String descripcion) {

        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        int valor = 0;
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("SELECT * FROM TIPOVEHICULO WHERE tipovehiculo = ?");
            ps.setString(1, descripcion);
            rs = ps.executeQuery();

            while (rs.next()) {
                valor = rs.getInt("idtipo");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }

        }
        return valor;

    }

    public void listarTipoVH(JComboBox box) {
        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Statement st = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            con = conec.getConnection();
            st = con.createStatement();

            rs = st.executeQuery("SELECT * FROM TIPOVEHICULO");
            value = new DefaultComboBoxModel();
            box.setModel(value);

            while (rs.next()) {
                value.addElement(new Pais(rs.getInt(1), rs.getString(2)));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                rs.close();
                c.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void listarTipoVH_2(JComboBox box) {
        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Statement st = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            con = conec.getConnection();
            st = con.createStatement();

            rs = st.executeQuery("SELECT * FROM TIPOVEHICULO");
            value = new DefaultComboBoxModel();
            box.setModel(value);
            value.addElement("");
            while (rs.next()) {

                value.addElement(new Pais(rs.getInt(1), rs.getString(2)));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                rs.close();
                c.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public String ModificarMantenimiento(Mantenimiento_ mt) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ActualizarMant(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, mt.getIDMANTENIMIENTO());
            cs.setString(2, mt.getNOMBRE());
            cs.setDouble(3, mt.getIMPORTE());
            cs.setString(4, mt.getFECHAMANT());
            cs.setInt(5, mt.getIdtipom());
            cs.setString(6, mt.getIdproveedor());
            cs.setString(7, mt.getULTIMAREV());
            cs.setInt(8, mt.getDIASVEN());
            cs.setString(9, mt.getSIGUIENTEREV());
            cs.setDouble(10, mt.getULTIMAREVKM());
            cs.setDouble(11, mt.getVENCIMIENTOKM());
            cs.setDouble(12, mt.getSIGTREVKM());
            cs.setString(13, mt.getIdvehiculo());
            cs.setString(14, mt.getIdempleado());
            cs.setString(15, mt.getFECHAM());
            cs.setString(16, mt.getNOMUSUM());
            cs.setString(17, mt.getIP());
            cs.setString(18, mt.getMaquina());
            cs.setString(19, mt.getRazonsocial());
            cs.setString(20, mt.getNomempleado());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro modificado correctamente";

    }

    public String ModificarDetalleVehiculo(DetalleVH dvh) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ActualizarDetalleVH(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, dvh.getIDDETVEHICULO());
            cs.setString(2, dvh.getIDVEHICULO());
            cs.setString(3, dvh.getCOLOR());
            cs.setString(4, dvh.getCLASE());
            cs.setString(5, dvh.getCAPM3());
            cs.setString(6, dvh.getTIPOCOMBUSTIBLE());
            cs.setString(7, dvh.getEJE());
            cs.setDouble(8, dvh.getCARGAUTIL());
            cs.setDouble(9, dvh.getPESONETO());
            cs.setDouble(10, dvh.getLARGO());
            cs.setDouble(11, dvh.getANCHO());
            cs.setDouble(12, dvh.getALTO());
            cs.setString(13, dvh.getCARROCERIA());
            cs.setString(14, dvh.getTARJETAPRO());
            cs.setString(15, dvh.getNUMSERIECHASIS());
            cs.setString(16, dvh.getNUMHABILITACION());
            cs.setString(17, dvh.getANOV());
            cs.setString(18, dvh.getPOTENCIA());
            cs.setString(19, dvh.getGALONES());
            cs.setString(20, dvh.getFECHAM());
            cs.setString(21, dvh.getNOMUSUM());
            cs.setString(22, dvh.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro modificado correctamente";

    }

    public String GuardarDetalleVehiculo(DetalleVH dvh) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CREARDetalleVehiculo(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, dvh.getIDDETVEHICULO());
            cs.setString(2, dvh.getIDVEHICULO());
            cs.setString(3, dvh.getCOLOR());
            cs.setString(4, dvh.getCLASE());
            cs.setString(5, dvh.getCAPM3());
            cs.setString(6, dvh.getTIPOCOMBUSTIBLE());
            cs.setString(7, dvh.getEJE());
            cs.setDouble(8, dvh.getCARGAUTIL());
            cs.setDouble(9, dvh.getPESONETO());
            cs.setDouble(10, dvh.getLARGO());
            cs.setDouble(11, dvh.getANCHO());
            cs.setDouble(12, dvh.getALTO());
            cs.setString(13, dvh.getCARROCERIA());
            cs.setString(14, dvh.getTARJETAPRO());
            cs.setString(15, dvh.getNUMSERIECHASIS());
            cs.setString(16, dvh.getNUMHABILITACION());
            cs.setString(17, dvh.getANOV());
            cs.setString(18, dvh.getPOTENCIA());
            cs.setString(19, dvh.getGALONES());
            cs.setString(20, dvh.getFECHAM());
            cs.setString(21, dvh.getNOMUSUM());
            cs.setString(22, dvh.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public String ModificarESMP(entradasalidaMP es) {

        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ACTMP(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setInt(1, es.getIdES());
            cs.setString(2, es.getIdvehiculo());
            cs.setString(3, es.getFechaSalida());
            cs.setString(4, es.getHoraSalida());
            cs.setString(5, es.getFechaEntrada());
            cs.setString(6, es.getHoraEntrada());
            cs.setString(7, es.getOperador());
            cs.setString(8, es.getNparte());
            cs.setString(9, es.getFechaparte());
            cs.setString(10, es.getPlaca());
            cs.setString(11, es.getCliente());
            cs.setString(12, es.getObra());
            cs.setString(13, es.getTurno());
            cs.setString(14, es.getTipocombustible());
            cs.setString(15, es.getConsumo());
            cs.setString(16, es.getMedicion());
            cs.setString(17, es.getComienzo());
            cs.setString(18, es.getTermino());
            cs.setString(19, es.getHorastrabajadas());
            cs.setString(20, es.getViajes());
            cs.setString(21, es.getObservacion());
            cs.setString(22, es.getSupervisor());
            cs.setString(23, es.getFECHAM());
            cs.setString(24, es.getNOMUSUM());
            cs.setString(25, es.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro actualizado correctamente";

    }

    public String ModificarESVHT(entradasalidaVHT es) {

        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ACTVHT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setInt(1, es.getIdES());
            cs.setString(2, es.getIdvehiculo());
            cs.setString(3, es.getFechaSalida());
            cs.setString(4, es.getHoraSalida());
            cs.setString(5, es.getFechaEntrada());
            cs.setString(6, es.getHoraEntrada());
            cs.setString(7, es.getConductor());
            cs.setString(8, es.getPlacatracto());
            cs.setString(9, es.getPlacacarreta());
            cs.setString(10, es.getObservaciones());
            cs.setString(11, es.getDestino());
            cs.setString(12, es.getProductoIda());
            cs.setString(13, es.getProductoRetorno());
            cs.setDouble(14, es.getGastos());
            cs.setDouble(15, es.getPrecioViaje());
            cs.setDouble(16, es.getKilometraje());
            cs.setString(17, es.getFECHAM());
            cs.setString(18, es.getNOMUSUM());
            cs.setString(19, es.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro actualizado correctamente";

    }

    public String ModificarRepuesto(Repuesto r) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ActualizarResp(?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setInt(1, r.getIdr());
            cs.setString(2, r.getIdmantenimiento());
            cs.setString(3, r.getDescripcion());
            cs.setString(4, r.getMarca());
            cs.setDouble(5, r.getIva());
            cs.setInt(6, r.getCantidad());
            cs.setDouble(7, r.getPrecio());
            cs.setDouble(8, r.getSubtotal());
            cs.setDouble(9, r.getImporteiva());
            cs.setDouble(10, r.getTotal());
            cs.setString(11, r.getFecham());
            cs.setString(12, r.getNumusum());
            cs.setString(13, r.getIp());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro modificado correctamente";

    }

    public String ModificarServicio(Servicio s) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ActualizarSERV(?,?,?,?,?,?,?,?,?,?)}");

            cs.setInt(1, s.getIDSERVICIOS());
            cs.setString(2, s.getIDMANTENIMIENTO());
            cs.setString(3, s.getFECHA());
            cs.setString(4, s.getSERVICIO());
            cs.setString(5, s.getDESCRIPCION());
            cs.setDouble(6, s.getPRECIO());
            cs.setString(7, s.getOBSERVACION());
            cs.setString(8, s.getFECHAM());
            cs.setString(9, s.getNOMUSUM());
            cs.setString(10, s.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro modificado correctamente";

    }

    public void listarTipoMant(JComboBox box) {
        DefaultComboBoxModel value;
        conectar conec = new conectar();
        PreparedStatement ps = null;
        Statement st = null;
        Connection c = null;
        ResultSet rs = null;
        try {
            c = conec.getConnection();
            st = c.createStatement();
            rs = st.executeQuery("SELECT * FROM TIPOMANTENIMIENTO");
            value = new DefaultComboBoxModel();
            box.setModel(value);
            value.addElement(" ");
            while (rs.next()) {
                value.addElement(new Rol(rs.getString(1), rs.getString(2)));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public String GuardarMantenimiento(Mantenimiento_ mt) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CrearMant(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, mt.getIDMANTENIMIENTO());
            cs.setString(2, mt.getNOMBRE());
            cs.setDouble(3, mt.getIMPORTE());
            cs.setString(4, mt.getFECHAMANT());
            cs.setInt(5, mt.getIdtipom());
            cs.setString(6, mt.getIdproveedor());
            cs.setString(7, mt.getULTIMAREV());
            cs.setInt(8, mt.getDIASVEN());
            cs.setString(9, mt.getSIGUIENTEREV());
            cs.setDouble(10, mt.getULTIMAREVKM());
            cs.setDouble(11, mt.getVENCIMIENTOKM());
            cs.setDouble(12, mt.getSIGTREVKM());
            cs.setString(13, mt.getIdvehiculo());
            cs.setString(14, mt.getIdempleado());
            cs.setString(15, mt.getFECHAM());
            cs.setString(16, mt.getNOMUSUM());
            cs.setString(17, mt.getIP());
            cs.setString(18, mt.getMaquina());
            cs.setString(19, mt.getRazonsocial());
            cs.setString(20, mt.getNomempleado());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public String GuardarRepuesto(Repuesto r) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CrearResp(?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, r.getIdmantenimiento());
            cs.setString(2, r.getDescripcion());
            cs.setString(3, r.getMarca());
            cs.setDouble(4, r.getIva());
            cs.setDouble(5, r.getImporteiva());
            cs.setInt(6, r.getCantidad());
            cs.setDouble(7, r.getPrecio());
            cs.setDouble(8, r.getTotal());
            cs.setString(9, r.getFecham());
            cs.setString(10, r.getNumusum());
            cs.setString(11, r.getIp());
            cs.setDouble(12, r.getSubtotal());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public String GuardarServicio(Servicio s) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CrearServ(?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, s.getIDMANTENIMIENTO());
            cs.setString(2, s.getFECHA());
            cs.setString(3, s.getSERVICIO());
            cs.setString(4, s.getDESCRIPCION());
            cs.setDouble(5, s.getPRECIO());
            cs.setString(6, s.getOBSERVACION());
            cs.setString(7, s.getFECHAM());
            cs.setString(8, s.getNOMUSUM());
            cs.setString(9, s.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    /*============ alquiler =====================================================================*/
    public static void mostrarVehiculosAlquiler(String valor1, String valor2, String valor3, String valor4, String valor5, String valor6) {

        String[] titulos = {"Codigo", "Fecha de Compra", "Matricula", "Placa", "Marca", "Modelo", "Potencia", "Serie de Motor", "Tipo de Vehiculo",
            "Stock", "Costo Alquiler", "Descripción", "Estado",
            "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[16];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call  MOSTRARVEHICULOSALQUILER(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDVEHICULO");
                Registros[1] = rs.getString("FECHACOMPRA");
                Registros[2] = rs.getString("MATRICULA");
                Registros[3] = rs.getString("Placa");
                Registros[4] = rs.getString("MARCA");
                Registros[5] = rs.getString("MODELO");
                Registros[6] = rs.getString("POTENCIA");
                Registros[7] = rs.getString("SERIEMOTOR");
                Registros[8] = rs.getString("TIPOVEHICULO");
                Registros[9] = rs.getString("STOCK");
                Registros[10] = rs.getString("COSTEALQUILER");
                Registros[11] = rs.getString("DESCRIPCION");
                Registros[12] = rs.getString("ESTADO");
                Registros[13] = rs.getString("FECHAM");
                Registros[14] = rs.getString("NOMUSUM");
                Registros[15] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            RegistVehiculosAlq.tablevehiculos.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculosAlquiler2(String valor1, String valor2, String valor3, String valor4, String valor5) {
        String[] titulos = {"Codigo", "Fecha de Compra", "Matricula", "Placa", "Marca", "Modelo", "Potencia", "Serie de Motor", "Tipo de Vehiculo",
            "Stock", "Costo Alquiler", "Descripción", "Estado",
            "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[18];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call  MOSTRARVEHICULOSALQUILER2(?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDVEHALQUILER");
                Registros[1] = rs.getString("FECHACOMPRA");
                Registros[2] = rs.getString("MATRICULA");
                Registros[3] = rs.getString("PLACA");
                Registros[4] = rs.getString("MARCA");
                Registros[5] = rs.getString("MODELO");
                Registros[6] = rs.getString("POTENCIA");
                Registros[7] = rs.getString("SERIEMOTOR");
                Registros[8] = rs.getString("TIPOVEHICULO");
                Registros[9] = rs.getString("STOCK");
                Registros[10] = rs.getString("COSTEALQUILER");
                Registros[11] = rs.getString("DESCRIPCION");
                Registros[12] = rs.getString("ESTADO");
                Registros[13] = rs.getString("FECHAM");
                Registros[14] = rs.getString("NOMUSUM");
                Registros[15] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            EncontrarAlqVh.tablebuscarv.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculosAlquiler3(String valor1, String valor2, String valor3, String valor4, String valor5, String valor6) {
        String[] titulos = {"Codigo", "Fecha de Compra", "Matricula", "Placa", "Marca", "Modelo", "Potencia", "Serie de Motor", "Tipo de Vehiculo",
            "Stock", "Costo Alquiler", "Descripción", "Estado",
            "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[16];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call  MOSTRARVEHICULOSALQUILER(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDVEHICULO");
                Registros[1] = rs.getString("FECHACOMPRA");
                Registros[2] = rs.getString("MATRICULA");
                Registros[3] = rs.getString("PLACA");
                Registros[4] = rs.getString("MARCA");
                Registros[5] = rs.getString("MODELO");
                Registros[6] = rs.getString("POTENCIA");
                Registros[7] = rs.getString("SERIEMOTOR");
                Registros[8] = rs.getString("TIPOVEHICULO");
                Registros[9] = rs.getString("STOCK");
                Registros[10] = rs.getString("COSTEALQUILER");
                Registros[11] = rs.getString("DESCRIPCION");
                Registros[12] = rs.getString("ESTADO");
                Registros[13] = rs.getString("FECHAM");
                Registros[14] = rs.getString("NOMUSUM");
                Registros[15] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            EncontrarAlqVh2.tablebuscarv.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculosDisponibles(String valor1, String valor2, String valor3, String valor4, String valor5, String valor6) {
        String[] titulos = {"Codigo", "Fecha de Compra", "Matricula", "Placa", "Marca", "Modelo", "Potencia", "Serie de Motor", "Tipo de Vehiculo",
            "Stock", "Costo Alquiler", "Descripción", "Estado",
            "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[16];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call  MOSTRARVEHICULOSDISPONIBLES(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDVEHICULO");
                Registros[1] = rs.getString("FECHACOMPRA");
                Registros[2] = rs.getString("MATRICULA");
                Registros[3] = rs.getString("PLACA");
                Registros[4] = rs.getString("MARCA");
                Registros[5] = rs.getString("MODELO");
                Registros[6] = rs.getString("POTENCIA");
                Registros[7] = rs.getString("SERIEMOTOR");
                Registros[8] = rs.getString("TIPOVEHICULO");
                Registros[9] = rs.getString("STOCK");
                Registros[10] = rs.getString("COSTEALQUILER");
                Registros[11] = rs.getString("DESCRIPCION");
                Registros[12] = rs.getString("ESTADO");
                Registros[13] = rs.getString("FECHAM");
                Registros[14] = rs.getString("NOMUSUM");
                Registros[15] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            RegistVehiculosAlq.tabledisponibles.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarVehiculosNoDisponibles(String valor1, String valor2, String valor3, String valor4, String valor5, String valor6) {
        String[] titulos = {"Codigo", "Fecha de Compra", "Matricula", "Placa", "Marca", "Modelo", "Potencia", "Serie de Motor", "Tipo de Vehiculo",
            "Stock", "Costo Alquiler", "Descripción", "Estado",
            "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[16];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call  MOSTRARVEHICULOSNODISPONIBLES(?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDVEHICULO");
                Registros[1] = rs.getString("FECHACOMPRA");
                Registros[2] = rs.getString("MATRICULA");
                Registros[3] = rs.getString("PLACA");
                Registros[4] = rs.getString("MARCA");
                Registros[5] = rs.getString("MODELO");
                Registros[6] = rs.getString("POTENCIA");
                Registros[7] = rs.getString("SERIEMOTOR");
                Registros[8] = rs.getString("TIPOVEHICULO");
                Registros[9] = rs.getString("STOCK");
                Registros[10] = rs.getString("COSTEALQUILER");
                Registros[11] = rs.getString("DESCRIPCION");
                Registros[12] = rs.getString("ESTADO");
                Registros[13] = rs.getString("FECHAM");
                Registros[14] = rs.getString("NOMUSUM");
                Registros[15] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            RegistVehiculosAlq.tablenodisponibles.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String ModificarVehiculoAlquiler(VehiculosAquiler va) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ActualizarVehiculoAlquiler(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, va.getIDVEHICULO());
            cs.setString(2, va.getFECHACOMPRA());
            cs.setString(3, va.getMATRICULA());
            cs.setString(4, va.getPLACA());
            cs.setString(5, va.getMARCA());
            cs.setString(6, va.getMODELO());
            cs.setString(7, va.getPOTENCIA());
            cs.setString(8, va.getSERIEMOTOR());
            cs.setString(9, va.getTIPOVEHICULO());
            cs.setInt(10, va.getSTOCK());
            cs.setDouble(11, va.getCOSTEALQUILER());
            cs.setString(12, va.getDESCRIPCION());
            cs.setString(13, va.getESTADO());
            cs.setString(14, va.getFECHAM());
            cs.setString(15, va.getNOMUSUM());
            cs.setString(16, va.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro modificado correctamente";

    }

    public String CrearVehiculoAlquiler(VehiculosAquiler va) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CrearVehiculoAlquiler(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, va.getIDVEHICULO());
            cs.setString(2, va.getFECHACOMPRA());
            cs.setString(3, va.getMATRICULA());
            cs.setString(4, va.getPLACA());
            cs.setString(5, va.getMARCA());
            cs.setString(6, va.getMODELO());
            cs.setString(7, va.getPOTENCIA());
            cs.setString(8, va.getSERIEMOTOR());
            cs.setString(9, va.getTIPOVEHICULO());
            cs.setInt(10, va.getSTOCK());
            cs.setDouble(11, va.getCOSTEALQUILER());
            cs.setString(12, va.getDESCRIPCION());
            cs.setString(13, va.getESTADO());
            cs.setString(14, va.getFECHAM());
            cs.setString(15, va.getNOMUSUM());
            cs.setString(16, va.getIP());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public int verificarTipoVHA(String descripcion) {

        conectar conec = new conectar();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        int valor = 0;
        try {
            con = conec.getConnection();
            ps = con.prepareStatement("SELECT * FROM TIPOVEHICULO WHERE tipovehiculo = ?");
            ps.setString(1, descripcion);
            rs = ps.executeQuery();

            while (rs.next()) {
                valor = rs.getInt("idtipo");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (Exception ex) {
            }

        }
        return valor;

    }

    /* clientes */
    public static void mostrarClientes2(String valor1, String valor2, String valor3, String valor4, String valor5) {
        String[] titulos = {"Codigo", "Tipo Doc", "N° Doc", "Nombre", "Telefono", "Contacto", "Codigo Postal", "Dirección",
            "Pais", "Departamento", "Provincia", "Distrito", "Obra", "N° Obra", "Observaciones", "Email", "Activo",
            "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[20];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARCLIENTES(?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDCLIENTE");
                Registros[1] = rs.getString("TIPODOC");
                Registros[2] = rs.getString("NDOC");
                Registros[3] = rs.getString("NOMBRE");
                Registros[4] = rs.getString("TELEFONO");
                Registros[5] = rs.getString("CONTACTO");
                Registros[6] = rs.getString("CODIGOPOSTAL");
                Registros[7] = rs.getString("DIRECCION");
                Registros[8] = rs.getString("PAIS");
                Registros[9] = rs.getString("DEPARTAMENTO");
                Registros[10] = rs.getString("PROVINCIA");
                Registros[11] = rs.getString("DISTRITO");
                Registros[12] = rs.getString("OBRA");
                Registros[13] = rs.getString("NUMOBRA");
                Registros[14] = rs.getString("OBSERVACIONES");
                Registros[15] = rs.getString("EMAIL");
                Registros[16] = rs.getString("ACTIVO");
                Registros[17] = rs.getString("FECHAM");
                Registros[18] = rs.getString("NOMUSUM");
                Registros[19] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            EncontrarAlqClient.tablebuscarClient.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarClientes3(String valor1, String valor2, String valor3, String valor4, String valor5) {
        String[] titulos = {"Codigo", "Tipo Doc", "N° Doc", "Nombre", "Telefono", "Contacto", "Codigo Postal", "Dirección",
            "Pais", "Departamento", "Provincia", "Distrito", "Obra", "N° Obra", "Observaciones", "Email", "Activo",
            "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[20];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARCLIENTES(?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDCLIENTE");
                Registros[1] = rs.getString("TIPODOC");
                Registros[2] = rs.getString("NDOC");
                Registros[3] = rs.getString("NOMBRE");
                Registros[4] = rs.getString("TELEFONO");
                Registros[5] = rs.getString("CONTACTO");
                Registros[6] = rs.getString("CODIGOPOSTAL");
                Registros[7] = rs.getString("DIRECCION");
                Registros[8] = rs.getString("PAIS");
                Registros[9] = rs.getString("DEPARTAMENTO");
                Registros[10] = rs.getString("PROVINCIA");
                Registros[11] = rs.getString("DISTRITO");
                Registros[12] = rs.getString("OBRA");
                Registros[13] = rs.getString("NUMOBRA");
                Registros[14] = rs.getString("OBSERVACIONES");
                Registros[15] = rs.getString("EMAIL");
                Registros[16] = rs.getString("ACTIVO");
                Registros[17] = rs.getString("FECHAM");
                Registros[18] = rs.getString("NOMUSUM");
                Registros[19] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            EncontrarAlqClient2.tablebuscarClient.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarClientes(String valor1, String valor2, String valor3, String valor4, String valor5) {
        String[] titulos = {"Codigo", "Tipo Doc", "N° Doc", "Nombre", "Telefono", "Contacto", "Codigo Postal", "Dirección",
            "Pais", "Departamento", "Provincia", "Distrito", "Obra", "N° Obra", "Observaciones", "Email", "Activo",
            "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[20];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARCLIENTES(?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDCLIENTE");
                Registros[1] = rs.getString("TIPODOC");
                Registros[2] = rs.getString("NDOC");
                Registros[3] = rs.getString("NOMBRE");
                Registros[4] = rs.getString("TELEFONO");
                Registros[5] = rs.getString("CONTACTO");
                Registros[6] = rs.getString("CODIGOPOSTAL");
                Registros[7] = rs.getString("DIRECCION");
                Registros[8] = rs.getString("PAIS");
                Registros[9] = rs.getString("DEPARTAMENTO");
                Registros[10] = rs.getString("PROVINCIA");
                Registros[11] = rs.getString("DISTRITO");
                Registros[12] = rs.getString("OBRA");
                Registros[13] = rs.getString("NUMOBRA");
                Registros[14] = rs.getString("OBSERVACIONES");
                Registros[15] = rs.getString("EMAIL");
                Registros[16] = rs.getString("ACTIVO");
                Registros[17] = rs.getString("FECHAM");
                Registros[18] = rs.getString("NOMUSUM");
                Registros[19] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            RegistClientes.tableClientes.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarClientes20(String valor1, String valor2, String valor3, String valor4, String valor5) {
        String[] titulos = {"Codigo", "Tipo Doc", "N° Doc", "Nombre", "Telefono", "Contacto", "Codigo Postal", "Dirección",
            "Pais", "Departamento", "Provincia", "Distrito", "Obra", "N° Obra", "Observaciones", "Email", "Activo",
            "Fecha de Actualización", "Usuario", "Ip"};
        String[] Registros = new String[20];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARCLIENTES(?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDCLIENTE");
                Registros[1] = rs.getString("TIPODOC");
                Registros[2] = rs.getString("NDOC");
                Registros[3] = rs.getString("NOMBRE");
                Registros[4] = rs.getString("TELEFONO");
                Registros[5] = rs.getString("CONTACTO");
                Registros[6] = rs.getString("CODIGOPOSTAL");
                Registros[7] = rs.getString("DIRECCION");
                Registros[8] = rs.getString("PAIS");
                Registros[9] = rs.getString("DEPARTAMENTO");
                Registros[10] = rs.getString("PROVINCIA");
                Registros[11] = rs.getString("DISTRITO");
                Registros[12] = rs.getString("OBRA");
                Registros[13] = rs.getString("NUMOBRA");
                Registros[14] = rs.getString("OBSERVACIONES");
                Registros[15] = rs.getString("EMAIL");
                Registros[16] = rs.getString("ACTIVO");
                Registros[17] = rs.getString("FECHAM");
                Registros[18] = rs.getString("NOMUSUM");
                Registros[19] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            EncontrarCliente.tableC.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String GuardarCliente(Cliente c) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CREARCLIENTE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            // cs = con.prepareCall("{call CREAREMPLEADO(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, c.getCodigo());
            cs.setString(2, c.getTipodoc());
            cs.setString(3, c.getNdoc());
            cs.setString(4, c.getNombre());
            cs.setString(5, c.getTelefono());
            cs.setString(6, c.getContacto());
            cs.setString(7, c.getCodigopostal());
            cs.setString(8, c.getDireccion());
            cs.setString(9, c.getPais());
            cs.setString(10, c.getDepartamento());
            cs.setString(11, c.getProvincia());
            cs.setString(12, c.getDistrito());
            cs.setString(13, c.getObra());
            cs.setInt(14, c.getNunobra());
            cs.setString(15, c.getObservaciones());
            cs.setString(16, c.getFecham());
            cs.setString(17, c.getNomusum());
            cs.setString(18, c.getIp());
            cs.setString(19, c.getEmail());
            cs.setString(20, c.getActivo());

            cs.executeQuery();

        } catch (Exception exc) {
            exc.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException exc) {
                exc.getMessage();
            }
        }

        return "Registro guardado correctamente";

    }

    public String modificarCliente(Cliente c) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ACTUALIZARCLIENTE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, c.getCodigo());
            cs.setString(2, c.getTipodoc());
            cs.setString(3, c.getNdoc());
            cs.setString(4, c.getNombre());
            cs.setString(5, c.getTelefono());
            cs.setString(6, c.getContacto());
            cs.setString(7, c.getCodigopostal());
            cs.setString(8, c.getDireccion());
            cs.setString(9, c.getPais());
            cs.setString(10, c.getDepartamento());
            cs.setString(11, c.getProvincia());
            cs.setString(12, c.getDistrito());
            cs.setString(13, c.getObra());
            cs.setInt(14, c.getNunobra());
            cs.setString(15, c.getObservaciones());
            cs.setString(16, c.getFecham());
            cs.setString(17, c.getNomusum());
            cs.setString(18, c.getIp());
            cs.setString(19, c.getEmail());
            cs.setString(20, c.getActivo());

            cs.executeQuery();

        } catch (Exception exc) {
            exc.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException exc) {
                exc.getMessage();
            }
        }

        return "Registro actualizado correctamente";

    }

    public static void mostrarAlquiler(String valor1, String valor2, String valor3, String valor4, String valor5, String valor6, String valor7, String valor8) {
        String[] titulos = {
            "Clave","Codigo","Cliente","N°Doc","Teléfono","Obra",
            "N° Obra",
            "Id Vehiculo",
            "Tipo de Vehiculo",
            "Matricula",
            "Placa",
            "Marca",
            "Potencia",
            "Costo",
            "Fecha de Alquiler",
            "Hora",
            "Fecha de Devolución",
            "Unidades",
            "Precios",
            "Total",
            "Dias Alquiler",
            "Total por Dias",
            "Observaciones",
            "Fech de Actualización",
            "Usuario",
            "Ip"};
        String[] Registros = new String[26];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARALQUILER(?,?,?,?,?,?,?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);
            cs.setString(3, valor3);
            cs.setString(4, valor4);
            cs.setString(5, valor5);
            cs.setString(6, valor6);
            cs.setString(7, valor7);
            cs.setString(8, valor8);
          
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDALQUILER");
                Registros[1] = rs.getString("IDCLIENTE");
                Registros[2] = rs.getString("NOMCLIENTE");
                Registros[3] = rs.getString("NDOC");
                Registros[4] = rs.getString("TELCLIENTE");
                Registros[5] = rs.getString("OBRACLIENTE");
                Registros[6] = rs.getString("NUMOBRA");
                Registros[7] = rs.getString("IDVEHALQUILER");
                Registros[8] = rs.getString("TIPOVEHICULO");
                Registros[9] = rs.getString("MATRICULA");
                Registros[10] = rs.getString("PLACA");
                Registros[11] = rs.getString("MARCA");
                Registros[12] = rs.getString("POTENCIA");
                Registros[13] = rs.getString("COSTOVEH");
                Registros[14] = rs.getString("FECHAALQUILER");
                Registros[15] = rs.getString("HORA");
                Registros[16] = rs.getString("FECHADEVOLUCION");
                Registros[17] = rs.getString("UNIDADES");
                Registros[18] = rs.getString("PRECIO");
                Registros[19] = rs.getString("TOTAL");
                Registros[20] = rs.getString("DIAS");
                Registros[21] = rs.getString("TOTALDIAS");
                Registros[22] = rs.getString("OBSERVACIONES");
                Registros[23] = rs.getString("FECHAM");
                Registros[24] = rs.getString("NOMUSUM");
                Registros[25] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            RegistAlquiler.tableAlquiler.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Alquiler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String modificarAlquiler(Alquiler c) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ActualizarAlquiler(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, c.getIDALQUILER());
            cs.setString(2, c.getIDCLIENTE());
            cs.setString(3, c.getNOMCLIENTE());
            cs.setString(4, c.getNDOC());
            cs.setString(5, c.getTELCLIENTE());
            cs.setString(6, c.getOBRACLIENTE());
            cs.setInt(7, c.getNUMOBRA());
            cs.setInt(8, c.getIDVEHALQUILER());
            cs.setString(9, c.getTIPOVEHICULO());
            cs.setString(10, c.getMATRICULA());
            cs.setString(11, c.getPLACA());
            cs.setString(12, c.getMARCA());
            cs.setString(13, c.getPOTENCIA());
            cs.setDouble(14, c.getCOSTOVEH());
            cs.setString(15, c.getFECHAALQUILER());
            cs.setString(16, c.getHORA());
            cs.setString(17, c.getFECHADEVOLUCION());
            cs.setInt(18, c.getUNIDADES());
            cs.setDouble(19, c.getPRECIO());
            cs.setDouble(20, c.getTOTAL());
            cs.setInt(21, c.getDIAS());
            cs.setDouble(22, c.getTOTALDIAS());
            cs.setString(23, c.getOBSERVACIONES());
            cs.setString(24, c.getFECHAM());
            cs.setString(25, c.getNOMUSUM());
            cs.setString(26, c.getIP());

            cs.executeQuery();

        } catch (Exception exc) {
            exc.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException exc) {
                exc.getMessage();
            }
        }

        return "Registro actualizado correctamente";

    }

    public String GuardarAlquiler(Alquiler c) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CREARALQUILER(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, c.getIDALQUILER());
            cs.setString(2, c.getIDCLIENTE());
            cs.setString(3, c.getNOMCLIENTE());
            cs.setString(4, c.getNDOC());
            cs.setString(5, c.getTELCLIENTE());
            cs.setString(6, c.getOBRACLIENTE());
            cs.setInt(7, c.getNUMOBRA());
            cs.setInt(8, c.getIDVEHALQUILER());
            cs.setString(9, c.getTIPOVEHICULO());
            cs.setString(10, c.getMATRICULA());
            cs.setString(11, c.getPLACA());
            cs.setString(12, c.getMARCA());
            cs.setString(13, c.getPOTENCIA());
            cs.setDouble(14, c.getCOSTOVEH());
            cs.setString(15, c.getFECHAALQUILER());
            cs.setString(16, c.getHORA());
            cs.setString(17, c.getFECHADEVOLUCION());
            cs.setInt(18, c.getUNIDADES());
            cs.setDouble(19, c.getPRECIO());
            cs.setDouble(20, c.getTOTAL());
            cs.setInt(21, c.getDIAS());
            cs.setDouble(22, c.getTOTALDIAS());
            cs.setString(23, c.getOBSERVACIONES());
            cs.setString(24, c.getFECHAM());
            cs.setString(25, c.getNOMUSUM());
            cs.setString(26, c.getIP());

            cs.executeQuery();

        } catch (Exception exc) {
            exc.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException exc) {
                exc.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public static void mostrarRespXID(String valor1) {
        String[] titulos = {"Codigo", "Descripción", "Marca", "Iva", "Cantidad", "Precio", "SubTotal", "Importe Iva",
            "Total"};
        String[] Registros = new String[9];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call FILTROMANT(?)}");
            cs.setString(1, valor1);

            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDMANTENIMIENTO");
                Registros[1] = rs.getString("DESCRIPCION");
                Registros[2] = rs.getString("MARCA");
                Registros[3] = rs.getString("IVA");
                Registros[4] = rs.getString("CANTIDAD");
                Registros[5] = rs.getString("PRECIO");
                Registros[6] = rs.getString("SUBTOTAL");
                Registros[7] = rs.getString("IMPORTEIVA");
                Registros[8] = rs.getString("TOTAL");

                tabla.addRow(Registros);
            }
            nuevoMant.tablenuevoResp.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Repuesto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int getPerfil(String usuario) {
        try {
            String sql = "SELECT USUARIOS.IDROL FROM ROL INNER JOIN USUARIOS ON USUARIOS.IDROL=ROL.IDROL WHERE USERNAME = '"
                    + usuario + "'";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("IDROL");
            } else {
                return -1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public String getIdEmpleado(String numdoc) {
        try {
            String sql = "SELECT idempleado,nombres FROM EMPLEADO WHERE numdoc= '"
                    + numdoc + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getString("idempleado");
            } else {
                return "no existe";
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            return "no existe";
        }
    }

    public String GuardarInspeccion(Inspeccion ins) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CREARINSPECCION(?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, ins.getCODIGO());
            cs.setString(2, ins.getACTIVIDAD());
            cs.setString(3, ins.getFECHA());
            cs.setString(4, ins.getHORA());
            cs.setString(5, ins.getUNIDAD());
            cs.setString(6, ins.getMARCA());
            cs.setString(7, ins.getTURNO());
            cs.setString(8, ins.getCONDUCTOR());
            cs.setString(9, ins.getTECNICO());
            cs.setString(10, ins.getFECHAACT());
            cs.setString(11, ins.getUSUARIO());
            cs.setString(12, ins.getIP());
            cs.setString(13, ins.getOBSERVACION());

            cs.executeQuery();

        } catch (Exception exc) {
            exc.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException exc) {
                exc.getMessage();
            }
        }

        return "Registro guardado correctamente";

    }

    public String GuardarOrden(ORDEN or) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{CALL CREARORDENES(?)}");

            cs.setString(1, or.getCODIGO());

            cs.executeQuery();

        } catch (Exception exc) {
            exc.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException exc) {
                exc.getMessage();
            }
        }

        return "Registro guardado correctamente";

    }

    public String ActualizarOrden(ORDEN or) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{CALL ACTORDEN(?,?,?,?)}");

            cs.setString(1, or.getCODIGO());
            cs.setString(2, or.getCATEGORIA());
            cs.setString(3, or.getDESCRIPCION());
            cs.setString(4, or.getESTADO());
            cs.executeQuery();

        } catch (Exception exc) {
            exc.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                conec.desconectar();
            } catch (SQLException exc) {
                exc.getMessage();
            }
        }
        return "";

    }

    public String EliminarOrden(ORDEN or) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ELIMINAR(?,?,?)}");

            cs.setString(1, or.getCODIGO());
            cs.setString(2, or.getCATEGORIA());
            cs.setString(3, or.getDESCRIPCION());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "";

    }

    public boolean existeFecha(String fecha) {
        conectar conec = new conectar();
        Connection con = null;

        con = conec.getConnection();
        try {
            String sql = "select (1) from inspeccion  where FECHA = '"
                    + fecha + "'";

            st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static void mostrarChecklist(String valor1, String valor2) {
        String[] titulos = {"Codigo",
            "Actividad",
            "Fecha",
            "Hora",
            "Unidad",
            "Marca",
            "Turno",
            "Conductor",
            "Tecnico",
            "Observación",
            "Fecha Actualización",
            "Usuario",
            "Ip"};
        String[] Registros = new String[13];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARCHECKLIST(?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);

            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("CODIGO");
                Registros[1] = rs.getString("ACTIVIDAD");
                Registros[2] = rs.getString("FECHA");
                Registros[3] = rs.getString("HORA");
                Registros[4] = rs.getString("UNIDAD");
                Registros[5] = rs.getString("MARCA");
                Registros[6] = rs.getString("TURNO");
                Registros[7] = rs.getString("CONDUCTOR");
                Registros[8] = rs.getString("TECNICO");
                Registros[9] = rs.getString("OBSERVACION");
                Registros[10] = rs.getString("FECHAACT");
                Registros[11] = rs.getString("USUARIO");
                Registros[12] = rs.getString("IP");

                tabla.addRow(Registros);
            }
            InspeccionMovil.tableinspeccion.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void MOSTRARORDEN(String valor1, String valor2) {
        String[] titulos = {
            "Id",
            "Codigo",
            "Categoria",
            "Descripción",
            "Estado"

        };
        String[] Registros = new String[5];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARORDEN(?,?)}");
            cs.setString(1, valor1);
            cs.setString(2, valor2);

            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDORDEN");
                Registros[1] = rs.getString("CODIGO");
                Registros[2] = rs.getString("CATEGORIA");
                Registros[3] = rs.getString("DESCRIPCION");
                Registros[4] = rs.getString("ESTADO");

                tabla.addRow(Registros);
            }
            InspeccionMovil.tableorden.setModel(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String GuardarSoat(cSoat soat) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CREARSOAT(?,?,?)}");

            cs.setString(1, soat.getINICIO());
            cs.setString(2, soat.getFINAL());
            cs.setString(3, soat.getIDVEHICULO());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public String GuardarAndina(cAndina ca) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CREARANDINA(?,?,?)}");

            cs.setString(1, ca.getNUMERO());
            cs.setString(2, ca.getVIGENCIA());
            cs.setString(3, ca.getIDVEHICULO());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public String GuardarOperatividad(cOperatividad co) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CREAROPERATIVIDAD(?,?,?)}");

            cs.setString(1, co.getNUMERO());
            cs.setString(2, co.getVIGENCIA());
            cs.setString(3, co.getIDVEHICULO());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public String GuardarMercancia(cMercancia cM) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CREARMERCANCIA(?,?,?)}");

            cs.setString(1, cM.getNUMERO());
            cs.setString(2, cM.getVIGENCIA());
            cs.setString(3, cM.getIDVEHICULO());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    /*actualizar registros*/
    public String ActualizarSoat(cSoat soat) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ACTSOAT(?,?,?)}");

            cs.setString(1, soat.getINICIO());
            cs.setString(2, soat.getFINAL());
            cs.setString(3, soat.getIDVEHICULO());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro actualizado correctamente";

    }

    public String ActualizarAndina(cAndina ca) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ACTANDINA(?,?,?)}");

            cs.setString(1, ca.getNUMERO());
            cs.setString(2, ca.getVIGENCIA());
            cs.setString(3, ca.getIDVEHICULO());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro actualizado correctamente";

    }

    public String ActualizarOperatividad(cOperatividad co) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ACTOPERATIVIDAD(?,?,?)}");

            cs.setString(1, co.getNUMERO());
            cs.setString(2, co.getVIGENCIA());
            cs.setString(3, co.getIDVEHICULO());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro actualizado correctamente";

    }

    public String ActualizarMercancia(cMercancia cM) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ACTMERCANCIA(?,?,?)}");

            cs.setString(1, cM.getNUMERO());
            cs.setString(2, cM.getVIGENCIA());
            cs.setString(3, cM.getIDVEHICULO());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro actualizado correctamente";

    }

    public boolean existeSoat(String id) {
        conectar conec = new conectar();
        Connection con = null;

        con = conec.getConnection();
        try {
            String sql = "select (1) from SOAT  where IDVEHICULO = '"
                    + id + "'";

            st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean existenumdoc(String NUMDOC) {
        conectar conec = new conectar();
        Connection con = null;

        con = conec.getConnection();
        try {
            String sql = "select (1) from EMPLEADO  where NUMDOC = '"
                    + NUMDOC + "'";

            st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean existeOperatividad(String id) {
        conectar conec = new conectar();
        Connection con = null;

        con = conec.getConnection();
        try {
            String sql = "select (1) from OPERATIVIDAD  where IDVEHICULO = '"
                    + id + "'";

            st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean existeMercancia(String id) {
        conectar conec = new conectar();
        Connection con = null;

        con = conec.getConnection();
        try {
            String sql = "select (1) from MERCANCIA  where IDVEHICULO = '"
                    + id + "'";

            st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean existeAndina(String id) {
        conectar conec = new conectar();
        Connection con = null;

        con = conec.getConnection();
        try {
            String sql = "select (1) from ANDINA  where IDVEHICULO = '"
                    + id + "'";

            st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static void mostrarSoat(String valor1) {
        String[] titulos = {" Item", "Codigo Vehiculo", "Fecha Inicio", "Fecha Final"};
        String[] Registros = new String[4];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARSOAT(?)}");
            cs.setString(1, valor1);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDSOAT");
                Registros[1] = rs.getString("IDVEHICULO");
                Registros[2] = rs.getString("INICIO");
                Registros[3] = rs.getString("FINAL");

                tabla.addRow(Registros);
            }
            RegisVehiculos.tablesoat.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarOperatividad(String valor1) {
        String[] titulos = {" Item", "Codigo Vehiculo", "Número", "Vigencia"};
        String[] Registros = new String[4];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRAROPERATIVIDAD(?)}");
            cs.setString(1, valor1);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDOPERATIVIDAD");
                Registros[1] = rs.getString("IDVEHICULO");
                Registros[2] = rs.getString("NUMERO");
                Registros[3] = rs.getString("VIGENCIA");

                tabla.addRow(Registros);
            }
            RegisVehiculos.tableop.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarMercancia(String valor1) {
        String[] titulos = {" Item", "Codigo Vehiculo", "Número", "Vigencia"};
        String[] Registros = new String[4];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARMERCANCIA(?)}");
            cs.setString(1, valor1);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDMERCANCIA");
                Registros[1] = rs.getString("IDVEHICULO");
                Registros[2] = rs.getString("NUMERO");
                Registros[3] = rs.getString("VIGENCIA");

                tabla.addRow(Registros);
            }
            RegisVehiculos.tablemarcancia.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarAndina(String valor1) {
        String[] titulos = {" Item", "Codigo Vehiculo", "Número", "Vigencia"};
        String[] Registros = new String[4];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARANDINA(?)}");
            cs.setString(1, valor1);
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDANDINA");
                Registros[1] = rs.getString("IDVEHICULO");
                Registros[2] = rs.getString("NUMERO");
                Registros[3] = rs.getString("VIGENCIA");

                tabla.addRow(Registros);
            }
            RegisVehiculos.tableandina.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean existeVHALQU(String id) {
        conectar conec = new conectar();
        Connection con = null;

        con = conec.getConnection();
        try {
            String sql = "select (1) from VEHICULOSALQUILER  where IDVEHICULO = '"
                    + id + "'";

            st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static void mostrarConcepto() {
        String[] titulos = {" ID", "Concepto", "Descripción"};
        String[] Registros = new String[3];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARCONCEPTO()}");
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDCONCEPTO");
                Registros[1] = rs.getString("CONCEPTO");
                Registros[2] = rs.getString("DESCRIPCION");

                tabla.addRow(Registros);
            }
//			ConceptoC.tablaconcepto.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarDocumentos() {
        String[] titulos = {" ID", "Descripción Corta", "Descripción Larga"};
        String[] Registros = new String[3];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARDOCUMENTO()}");
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDDOCUMENTO");
                Registros[1] = rs.getString("DESCRIPCIONCORTA");
                Registros[2] = rs.getString("DESCRIPCIONLARGA");

                tabla.addRow(Registros);
            }
            DocumentosC.tabladocumento.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mostrarDocumentos1() {
        String[] titulos = {" ID", "Descripción Corta", "Descripción Larga"};
        String[] Registros = new String[3];
        tabla = new DefaultTableModel(null, titulos);
        try {

            cs = cn.prepareCall("{call MOSTRARDOCUMENTO()}");
            rs = cs.executeQuery();
            while (rs.next()) {
                Registros[0] = rs.getString("IDDOCUMENTO");
                Registros[1] = rs.getString("DESCRIPCIONCORTA");
                Registros[2] = rs.getString("DESCRIPCIONLARGA");

                tabla.addRow(Registros);
            }
            BuscarDocumento.TableBuscarDocumentos.setModel(tabla);

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String GuardarConcepto(Concepto co) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CREARCONCEPTO(?,?)}");

            cs.setString(1, co.getConcepto());
            cs.setString(2, co.getDescripcion());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public String GuardarDocumento(Documentos doc) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call CREARDOCUMENTO(?,?)}");

            cs.setString(1, doc.getDescripcioncorta());
            cs.setString(2, doc.getDescripcionlarga());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro creado correctamente";

    }

    public String ActualizarConcepto(Concepto co) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ACTCONCEPTO(?,?,?)}");

            cs.setInt(1, co.getIdconcepto());
            cs.setString(2, co.getConcepto());
            cs.setString(3, co.getDescripcion());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro actualizado correctamente";

    }

    public String ActualizarDocumento(Documentos doc) {
        conectar conec = new conectar();
        Connection con = null;
        try {
            con = conec.getConnection();
            cs = con.prepareCall("{call ACTDOCUMENTO(?,?,?)}");

            cs.setInt(1, doc.getIddocumentos());
            cs.setString(2, doc.getDescripcioncorta());
            cs.setString(3, doc.getDescripcionlarga());

            cs.executeQuery();

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
                desconectar();
            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return "Registro actualizado correctamente";

    }

}
