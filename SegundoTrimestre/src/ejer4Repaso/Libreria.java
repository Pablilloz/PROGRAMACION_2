package ejer4Repaso;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

	private List<Libro> listaLibros;
	private String Direccion;
	private Integer telefono;

	public Libreria() {
		listaLibros = new ArrayList<>();
	}

	public Libro obtenerLibroMasAntiguo() {
		Libro librocomp = listaLibros.get(0);
		if (listaLibros.isEmpty()) {
			return null;
		} else {
			for (Libro dato : listaLibros) {
				if ((dato.getFechaEdicion().isBefore(librocomp.getFechaEdicion()))) {
					librocomp = dato;
				}
			}
		}

		return librocomp;
	}

	public Integer obtenerPesototalDelLibro() {
		Integer cont = 0;
		for (Libro dato : listaLibros) {
			cont += dato.peso();
		}
		return cont;
	}

	public Integer obtenerNumPaginasMedio() {
		Integer media = 0;
		if (listaLibros.isEmpty()) {
			return 0;
		}

		for (Libro dato : listaLibros) {
			media += dato.getNumPag();
		}
		media = media / listaLibros.size();
		return media;
	}

	public List<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

}
