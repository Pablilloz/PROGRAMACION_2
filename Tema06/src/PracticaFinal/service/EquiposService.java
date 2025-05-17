package PracticaFinal.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import PracticaFinal.modelo.Equipo;
import PracticaFinal.modelo.Jugador;

public class EquiposService extends OpenConnection {

	public List<Equipo> consultarEquipos() throws EquipoServiceException {
		List<Equipo> listaEquipos = new ArrayList<>();
		String sql = "SELECT * FROM EQUIPO";
		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Equipo e = new Equipo();
				String codigo = rs.getString("CODIGO");
				String nombre = rs.getString("NOMBRE");
				e.setCodigo(codigo);
				e.setNombre(nombre);
				listaEquipos.add(e);

			}
		} catch (SQLException e) {
			throw new EquipoServiceException("Error");
		}

		return listaEquipos;
	}

	public List<Jugador> consultarJugadoresEquipo(String codigo) throws EquipoServiceException {
		List<Jugador> listaJugadores = new ArrayList<>();
		String sql = "SELECT * FROM JUGADOR WHERE CODIGO = ?";
		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, codigo);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Jugador j = new Jugador();
				j.setNumero(rs.getInt("NUMERO"));
				j.setCodigoEquipo(codigo);
				j.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
				j.setNombre(rs.getString("NOMBRE"));

				listaJugadores.add(j);
			}
		} catch (SQLException e) {
			throw new EquipoServiceException("Error al consultar los jugadores");

		}

		return listaJugadores;
	}

	public void consultarEquipoCompleto(String codigo) throws EquipoServiceException, NotFoundException {

		String sql = "SELECT * FROM EQUIPO WHERE CODIGO = ?";
		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			List<Jugador> lista = new ArrayList<>();
			stmt.setString(1, codigo);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				Equipo equipo = new Equipo();
				equipo.setCodigo(rs.getString("CODIGO"));
				equipo.setNombre(rs.getString("NOMBRE"));
				lista = consultarJugadoresEquipo(codigo);

				equipo.setListaJugadores(lista);

			} else {
				throw new NotFoundException();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EquipoServiceException();
		}

	}

	public void insertarJugador(Connection conn, Jugador jugador) throws SQLException {
		String sql = "INSERT INTO JUGADOR VALUES (?,?,?,?)";

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, jugador.getNumero());
			stmt.setString(2, jugador.getCodigoEquipo());
			stmt.setString(3, jugador.getNombre());
			stmt.setDate(4, Date.valueOf(jugador.getFechaNacimiento()));
			stmt.execute();

		}
	}

	public void crearEquipo(Equipo equipo) throws EquipoServiceException {

		String sql = "INSERT INTO EQUIPO VALUES (?,?)";
		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			conn.setAutoCommit(false);

			stmt.setString(1, equipo.getCodigo());
			stmt.setString(2, equipo.getNombre());
			stmt.executeUpdate();

			int numero = 1;

			for (Jugador j : equipo.getListaJugadores()) {
				j.setCodigoEquipo(equipo.getCodigo());
				j.setNumero(numero++);
				insertarJugador(conn, j);
			}
			conn.commit();

		} catch (SQLException e) {
			throw new EquipoServiceException("Ha ocurrido un error al crear el equipo");
		}
	}
}
