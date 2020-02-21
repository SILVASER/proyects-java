package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class Conexion {

    private Connection cn;

    public Conexion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=SIAPERPSULLANA", "dani", "dani123456");

        } catch (ClassNotFoundException e) {

            JOptionPane.showMessageDialog(null, "Error");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public Connection getConnection() {
        return cn;
    }

}
