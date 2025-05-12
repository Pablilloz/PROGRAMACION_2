package ejerRepaso.ejer1.modelo;

import java.math.BigDecimal;

public class Producto {
	private Integer id;
	private String nombre;
	private String tipo;
	private BigDecimal precio;
	private Boolean disponible;

	public Producto(int i, String string, String string2, BigDecimal bigDecimal, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", disponible="
				+ disponible + "]";
	}

}
