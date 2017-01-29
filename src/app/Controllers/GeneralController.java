package app.Controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import config.Database;

public class GeneralController {
	
	public void iniciarSesion(String usuario, String contrasena, javax.swing.JDialog dialogo) {
		
	        try {
	            Database conexion = new Database();
	            Connection con = conexion.getConexionMYSQL();
	            String query = "SELECT * FROM usuarios WHERE usuario = '" + usuario + "' AND contrasena = '" + contrasena + "'";
	            //String query = "SELECT * FROM usuarios";

	            //String query = "SELECT * FROM usuarios WHERE contrasena = '" + contrasena + "' ";
	            Statement st = con.createStatement();
	            ResultSet rs = st.executeQuery(query);
	            rs.beforeFirst();
	            rs.next();

	            //int codigo = rs.getInt("codigo");
	            if (rs.first()) {
	                System.out.println(rs.getObject("estado"));
	                //Iniciamos la nueva clase
	            } else {
	                System.out.println("Inicio de sesión incorrecto");
	                dialogo.setVisible(true);
	            }

	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	}
}
