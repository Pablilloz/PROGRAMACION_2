package servicio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Persona;

public class PersonasService {
	private OpenConnection openConn;

	public PersonasService() {
		openConn = new OpenConnection();
	}

	public Persona ConsultarPersona(String dni) {

		String sql = "SELECT * FROM PERSONAS";
		Persona persona = new Persona();

		try (Connection conn = getNewConnection(); Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String nombre = rs.getString("Nombre");
				dni = rs.getString("DNI");
				if (dni.equals(rs.getString("Nombre"))) {
					persona.setDni(dni);
					persona.setNombre(nombre);
					return persona;
				}

				persona.setDni(dni);
				persona.setNombre(nombre);
			}
		} catch (SQLException e) {

		}

		return persona;

	}
}
