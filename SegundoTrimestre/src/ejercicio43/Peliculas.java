package ejercicio43;

import java.util.List;

public class Peliculas {
	private Integer añoDeEstreno;
	private String titulo;
	private List<Actores> listaActores;
	private Guionistas guionista;
	private Directores director;

	public Integer getAñoDeEstreno() {
		return añoDeEstreno;
	}

	public void setAñoDeEstreno(Integer añoDeEstreno) {
		this.añoDeEstreno = añoDeEstreno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Actores> getListaActores() {
		return listaActores;
	}

	public void setListaActores(List<Actores> listaActores) {
		this.listaActores = listaActores;
	}

	public Guionistas getGuionista() {
		return guionista;
	}

	public void setGuionista(Guionistas guionista) {
		this.guionista = guionista;
	}

	public Directores getDirector() {
		return director;
	}

	public void setDirector(Directores director) {
		this.director = director;
	}

}
