package ejer02.servicio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ejer02.modelo.Personas;

public class PersonasServices {
	private OpenConnection openConn;

	public PersonasServices() {
		openConn = new OpenConnection();
	}

	public List<Personas> BuscarPersonas(String nombre) throws SQLException {

		ResultSet rs = null;
		try (Connection conn = openConn.crearConeccion(); Statement stmt = conn.createStatement()) {

			String sql = "SELECT * FROM PERSONAS WHERE DNI = '" + nombre + "'" + " OR " + "APELLIDOS LIKE'%" + nombre
					+ "%'";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				List<Personas> listapersonas = new ArrayList();
				Personas persona = new Personas();
				persona.setNombre(rs.getString("NOMBRE"));
				persona.setDni(rs.getString("DNI"));
				String apellidos = rs.getString("APELLIDOS");
				persona.setApellidos(apellidos);
				persona.setFecha(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
				listapersonas.add(persona);
				return listapersonas;
			} else {
				return null;
			}

		}
	}

	public Personas ConsultarPersona(String dni) throws SQLException {

		ResultSet rs = null;
		try (Connection conn = openConn.crearConeccion(); Statement stmt = conn.createStatement()) {

			String sql = "SELECT * FROM PERSONAS WHERE DNI = '" + dni + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				Personas persona = new Personas();
				persona.setNombre(rs.getString("NOMBRE"));
				persona.setDni(rs.getString("DNI"));
				String apellidos = rs.getString("APELLIDOS");
				persona.setApellidos(apellidos);
				persona.setFecha(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
				return persona;
			} else {
				return null;
			}
		}
	}
}
