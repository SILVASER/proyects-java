package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conectar {

    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private Connection cn;
    private String url = "jdbc:sqlserver://localhost;databaseName=FLOTAVEHICULAR";
    private String user = "dani";
    private String pass = "123456789";

    public conectar() {

        try {

            Class.forName(driver);
            cn = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException | SQLException e) {
       

            JOptionPane.showInternalMessageDialog(null, "Error");
           
        }
    
    }

    public Connection getConnection() {
        return cn;
    }

    public void desconectar() {
        cn = null;
    }
 
    public static void main(String[] args) {
	
	conectar ccc= new conectar();
		if(ccc.getConnection()!=null) {
			System.out.println("conectado");
		}else {System.out.println("no conectado");}
			
		}
}
