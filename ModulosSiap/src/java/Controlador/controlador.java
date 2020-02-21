package Controlador;

import Conexion.Conexion;
import Modelo.BandejaArchivos;
import Modelo.BandejaEntrada;
import Modelo.BandejaSalida;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class controlador extends Conexion {

    String sql = "";
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    int count = 0;

    /*===========Bandeja de Entrada================*/
    public ArrayList<BandejaEntrada> bandejaEntrada(String IdDependencia_Destino, String IdPersonal) {

        ArrayList<BandejaEntrada> listaDatos = new ArrayList<>();

        try {
            CallableStatement cs = getConnection().prepareCall("{call proc_ExpedientesBandejaEntrada(?,?)}");

            cs.setString(1, IdDependencia_Destino);
            cs.setString(2, IdPersonal);

            rs = cs.executeQuery();

            while (rs.next()) {
                // count++;
                BandejaEntrada be = new BandejaEntrada();

                be.setOrigenc(rs.getString(7));
                be.setPersonal(rs.getString(11));
                be.setAsunto(rs.getString(16));
                be.setComentario(rs.getString(18));
                be.setFechat(rs.getString(6));
                be.setVencimiento(rs.getString(14));

                listaDatos.add(be);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                e.getMessage();
            }
        }
        return listaDatos;
    }

    /*===========Bandeja de Salida================*/
    public ArrayList<BandejaSalida> bandejaSalida(String IdDependencia_Destino, String IdPersonal) {

        ArrayList<BandejaSalida> listaDatos = new ArrayList<>();

        try {
            CallableStatement cs = getConnection().prepareCall("{call proc_ExpedientesBandejaSalida(?,?)}");

            cs.setString(1, IdDependencia_Destino);
            cs.setString(2, IdPersonal);

            rs = cs.executeQuery();

            while (rs.next()) {
                // count++;
                BandejaSalida bs = new BandejaSalida();
                bs.setFechat(rs.getString(11));
                bs.setOrigenc(rs.getString(12));
                bs.setPersonal(rs.getString(16));
                bs.setVencimiento(rs.getString(18));
                bs.setAsunto(rs.getString(20));
                bs.setComentario(rs.getString(23));

                listaDatos.add(bs);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                e.getMessage();
            }
        }
        return listaDatos;
    }

    /*===========Bandeja de Archivos================*/
    public ArrayList<BandejaArchivos> bandejaArchivos(String IdDependencia_Destino, String IdPersonal) {

        ArrayList<BandejaArchivos> listaDatos = new ArrayList<>();

        try {
            CallableStatement cs = getConnection().prepareCall("{call proc_ExpedientesBandejaArchivo(?,?)}");

            cs.setString(1, IdDependencia_Destino);
            cs.setString(2, IdPersonal);

            rs = cs.executeQuery();

            while (rs.next()) {
                // count++;
                BandejaArchivos bs = new BandejaArchivos();

                bs.setFechat(rs.getString(6));
                bs.setOrigenc(rs.getString(7));
                bs.setVencimiento(rs.getString(12));
                bs.setAsunto(rs.getString(14));
                bs.setPersonal(rs.getString(17));
                bs.setComentario(rs.getString(18));

                listaDatos.add(bs);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                e.getMessage();
            }
        }
        return listaDatos;
    }
}