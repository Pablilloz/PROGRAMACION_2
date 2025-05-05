package ejer05.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ejer05.service.OpenConnection;
import ejer05.modelo.Persona;

public class PersonaService extends OpenConnection {

	private Persona getPersonaFromResultSet(ResultSet rs) throws SQLException {
		Persona p = new Persona();
		p.setNombre(rs.getString("NOMBRE"));
		p.setDni(rs.getString("DNI"));

		String apellidos = rs.getString("APELLIDOS");
		p.setApellidos(apellidos);
		p.setFecha(rs.getDate("FECHA_NACIMIENTO").toLocalDate()); // en una l�nea

		return p;

	}

	public Persona consultarPersona(String dni) throws SQLException {

		try (Connection conn = crearConeccion(); Statement stmt = conn.createStatement()) {

			String sql = "SELECT * FROM PERSONAS WHERE DNI = '" + dni + "'";
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				return getPersonaFromResultSet(rs);
			} else {
				return null;

			}
		}
	}

	public List<Persona> consultarPersonas(String filtro) throws SQLException {

		try (Connection conn = crearConeccion(); Statement stmt = conn.createStatement()) {

			String sql = "SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%" + filtro + "%' or APELLIDOS LIKE '%" + filtro
					+ "%'";
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);

			List<Persona> resultados = new ArrayList<>();
			while (rs.next()) {
				Persona p = getPersonaFromResultSet(rs);
				resultados.add(p);
			}
			return resultados;
		}
	}

	public void insertarPersona(ejer05.modelo.Persona p) throws SQLException {

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

	public void ActualizarPersona(Persona p) throws SQLException {

		String sql = "UPDATE PERSONAS SET (?,?,?,?) WHERE DNI = ?";
		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, p.getDni());
			stmt.setString(2, p.getNombre());
			stmt.setString(3, p.getApellidos());
			stmt.setDate(4, Date.valueOf(p.getFecha()));
			stmt.setString(5, p.getDni());

			System.out.println(sql);
			stmt.execute();
		}
	}

	public void borrarPersona(Connection conn2, String dni) throws SQLException {
		String sql = "DELETE PERSONAS WHERE DNI = ? ";

		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, dni);
			System.out.println(sql);
			stmt.execute();
		}
	}

	public void insertarPersonas(List<Persona> lista) throws SQLException {
		String sql = "INSERT INTO PERSONAS VALUES (?,?,?,?)";
		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			conn.setAutoCommit(false);
			try {
				for (Persona personas : lista) {
					stmt.setString(1, personas.getDni());
					stmt.setString(2, personas.getNombre());
					stmt.setString(3, personas.getApellidos());
					stmt.setDate(4, Date.valueOf(personas.getFecha()));
					stmt.execute();
				}
				conn.commit();
			} catch (SQLException e) {
				conn.rollback();
			}
		}
	}

	public int borrarPersonasA() throws SQLException {
		try (Connection conn = crearConeccion();) {
			conn.setAutoCommit(false);
			int cont = 0;
			try {
				List<Persona> Personas = new ArrayList<>();

				Personas = consultarPersonas("");
				for (Persona a : Personas) {
					if (a.esMayor()) {
						borrarPersona(conn, a.getDni());
						cont++;
					}
				}
				conn.commit();
			} catch (SQLException e) {
				conn.rollback();
			}
			return cont;
		}
	}
}
