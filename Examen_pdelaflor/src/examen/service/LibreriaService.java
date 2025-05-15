package examen.service;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import examen.modelo.Libro;

public class LibreriaService extends OpenConnection {
	public void insertarLibroNuevo(Libro libro) throws LibroException {

		String sql = "INSERT INTO LIBROS VALUES(?,?,?,?)";
		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, libro.getISBN());
			stmt.setString(2, libro.getTitulo());
			stmt.setString(3, libro.getAutor());
			stmt.setBigDecimal(4, libro.getPrecio());
			stmt.execute();
		} catch (SQLException e) {
			throw new LibroException(e.getMessage(), e);
		}
	}

	public boolean actualizarPrecioLibroNuevo(Libro libro) throws LibroException {
		String sql = "UPDATE LIBROS SET PRECIO = ? WHERE ISBN = ?";

		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setBigDecimal(1, libro.getPrecio());
			stmt.setString(2, libro.getISBN());

			Boolean actualizado = stmt.execute();
			return actualizado;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new LibroException(e.getMessage(), e);
		}
	}

}
