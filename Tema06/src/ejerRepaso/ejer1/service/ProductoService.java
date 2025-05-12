package ejerRepaso.ejer1.service;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ejerRepaso.ejer1.modelo.Producto;

public class ProductoService extends OpenConnection {

	public void insertarProducto(Producto producto) throws SQLException, ProductoInvalidoException {
		BigDecimal Precio0 = BigDecimal.ZERO;
		String sql = "INSERT INTO PRODUCTOS_GOURMET VALUES (?,?,?,?,?)";
		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			if (producto.getPrecio().compareTo(Precio0) <= 0) {
				throw new ProductoInvalidoException();
			} else {
				stmt.setInt(1, producto.getId());
				stmt.setString(2, producto.getNombre());
				stmt.setString(3, producto.getTipo());
				stmt.setBigDecimal(4, producto.getPrecio());
				stmt.setBoolean(5, producto.getDisponible());
				stmt.execute();

			}
		}
	}

	public void insertarProductos(List<Producto> listaProductos) throws SQLException {
		String sql = "INSERT INTO PRODUCTOS_GOURMET VALUES (?,?,?,?,?)";
		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			conn.setAutoCommit(false);
			try {
				for (Producto p : listaProductos) {
					stmt.setInt(1, p.getId());
					stmt.setString(2, p.getNombre());
					stmt.setString(3, p.getTipo());
					stmt.setBigDecimal(4, p.getPrecio());
					stmt.setBoolean(5, p.getDisponible());
					stmt.execute();
				}
				conn.commit();
			} catch (SQLException e) {
				conn.rollback();
			}
		}
	}

	public List<Producto> consultaTipoProductos(String filtro) throws SQLException {
		filtro = filtro.toUpperCase();
		List<Producto> listaProducto = new ArrayList<>();
		String sql = "SELECT * FROM PRODUCTOS_GOURMET WHERE TIPO ='" + filtro + "'";
		try (Connection conn = crearConeccion(); Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Producto p = new Producto(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getString("TIPO"),
						rs.getBigDecimal("PRECIO"), rs.getBoolean("DISPONIBLE"));
				listaProducto.add(p);
			}
			if (listaProducto.isEmpty()) {
				throw new ProductoNoEncontradoException("No existe");
			}
		} catch (ProductoNoEncontradoException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		return listaProducto;

	}

	public void eliminarProducto(Integer filtro) throws SQLException {
		String sql = "DELETE PRODUCTOS_GOURMET WHERE TIPO = ? ";
		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, filtro);
			stmt.execute();
			int filas = stmt.executeUpdate();
			if (filas == 0) {
				throw new ProductoNoEncontradoException("No existe");
			}
		} catch (ProductoNoEncontradoException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

	}

	public Map<Integer, Producto> consultarProductosDisponibles() throws SQLException {
		Map<Integer, Producto> Disponible = new HashMap<>();
		String sql = "SELECT * FROM PRODUCTOS_GOURMET WHERE DISPONIBLE = 1 ";
		try (Connection conn = crearConeccion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Producto p = new Producto(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getString("TIPO"),
						rs.getBigDecimal("PRECIO"), rs.getBoolean("DISPONIBLE"));
				Disponible.put(p.getId(), p);
			}
		}
		return Disponible;

	}
}
