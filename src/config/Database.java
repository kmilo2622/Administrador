package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	
	private String usuario = "root";
    private String pass = "12345";
    private String host = "localhost";
    private String nombre_BD = "erp";

    private Connection con = null;

    public Database() {
    }

    //Metodo que se devuelve la conexion o null si hubo un error
    public Connection getConexionMYSQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String servidor = "jdbc:mysql://" + host + "/" + nombre_BD + "?autoReconnect=true&useSSL=false";
            con = DriverManager.getConnection(servidor, usuario, pass);
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return con;
        }
    }

}
