package ejerRepaso.ejer1.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OpenConnection {

	public Connection crearConeccion() throws SQLException {
		String usuario = "programacion";
		String password = "programacion";

		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@//localhost/XE";

		try {
			Class.forName(driverClass);

		} catch (ClassNotFoundException e) {
			System.out.println("No se encuentra el driver jdbc. Revisa su configuracion");
			throw new RuntimeException(e);
		}
		Connection conn = DriverManager.getConnection(url, usuario, password);
		
		
		return conn;
	}

}
