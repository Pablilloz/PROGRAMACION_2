package ejer7Repaso;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Academia {
	private String ciudad;
	private Integer telefono;
	private List<Curso> lista;

	public Academia() {
		lista = new ArrayList<>();
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public List<Curso> getLista() {
		return lista;
	}

	public void setLista(List<Curso> lista) {
		this.lista = lista;
	}

	public List<Curso> getCursosDisponibles() {
		List<Curso> disponible = new ArrayList<>();
		for (Curso curso : lista) {
			if (curso.isPlazasLibres() && curso.getFechaFin().isAfter(LocalDate.now())) {
				disponible.add(curso);
			}
		}
		return disponible;

	}

	public BigDecimal precioMedio() {
		BigDecimal medio = BigDecimal.ZERO;
		for (Curso curso : lista) {
			medio = medio.add(curso.getPrecio());

		}
		medio.divide(BigDecimal.valueOf(lista.size(), 2));
		return medio;
	}

	public void borrarCursosPasados() {
		for (Curso cursos : lista) {
			if (cursos.getFechaFin().isBefore(LocalDate.now())) {
				lista.remove(cursos);
			}
		}
	}

	public Curso getCursoMasBarato() {
		Curso barato = null;
		for (Curso curso : lista) {
			if (curso.getFechaIni().isAfter(LocalDate.now())) {
				if (barato == null || curso.getPrecioMes().compareTo(barato.getPrecioMes()) < 0) {
					barato = curso;
				}
			}
		}
		return barato;
	}

	public Integer getTotalPlazasLibres() {
		Integer total = 0;
		for (Curso curso : lista) {
			total += (curso.getNumPlaTota() - curso.getNumPlaOcu());
		}
		return total;
	}

}
