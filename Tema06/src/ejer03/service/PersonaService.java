package ejer03.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import ejer02.servicio.OpenConnection;
import ejer03.modelo.Persona;

public class PersonaService extends OpenConnection {

	private OpenConnection openConn;

	public PersonaService() {
		openConn = new OpenConnection();
	}

	public void insertarPersona(Persona p) throws SQLException {

		String sql = "INSERT INTO PERSONAS VALUES (?,?,?,?)";
		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, p.getDni());
			stmt.setString(2, p.getNombre());
			stmt.setString(3, p.getApellidos());
			stmt.setDate(4, Date.valueOf(p.getFecha()));

			System.out.println(sql);
			stmt.execute();
		}
	}

}
