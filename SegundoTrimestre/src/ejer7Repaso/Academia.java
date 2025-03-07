package ejer7Repaso;

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

}
