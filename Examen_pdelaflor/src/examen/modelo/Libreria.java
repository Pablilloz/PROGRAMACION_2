package examen.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class Libreria {
	private String nombre;
	private Map<String, Libro> mapaLibros;

	public Libreria() {
		this.mapaLibros = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, Libro> getMapaLibros() {
		return mapaLibros;
	}

	public void setMapaLibros(Map<String, Libro> mapaLibros) {
		this.mapaLibros = mapaLibros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libreria other = (Libreria) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public BigDecimal getTasacionCompleta() {
		BigDecimal cero = BigDecimal.ZERO;
		Set<Entry<String, Libro>> pares = mapaLibros.entrySet();
		for (Entry<String, Libro> par : pares) {
			cero = par.getValue().getPrecio().add(cero);
		}
		return cero;
	}

	public BigDecimal getPrecioMedio() {
		BigDecimal cero = BigDecimal.ZERO;
		BigDecimal total;
		BigDecimal medio = BigDecimal.ZERO;
		Set<Entry<String, Libro>> pares = mapaLibros.entrySet();
		for (Entry<String, Libro> par : pares) {
			total = new BigDecimal(mapaLibros.size());
			cero = par.getValue().getPrecio().add(cero);
			medio = cero.divide(total);
		}
		return medio.setScale(2, RoundingMode.HALF_DOWN);
	}

	public List<Libro> getLibrosBaratos() {
		List<Libro> libros = new ArrayList<>();

		Set<Entry<String, Libro>> pares = mapaLibros.entrySet();
		for (Entry<String, Libro> par : pares) {
			if (par.getValue().getPrecio().compareTo(new BigDecimal("10")) < 0) {
				libros.add(par.getValue());
			}
		}

		return libros;

	}
}
