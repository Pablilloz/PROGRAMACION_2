package ejer4Repaso;

import java.time.LocalDate;

public abstract class Libro extends Libreria {

	private String titulo;
	private String autor;
	private LocalDate fechaEdicion;
	private Integer numPag;

	public Libro(String titulo, String autor, LocalDate fechaEdicion, Integer numPag) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.fechaEdicion = fechaEdicion;
		this.numPag = numPag;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getFechaEdicion() {
		return fechaEdicion;
	}

	public void setFechaEdicion(LocalDate fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	public Integer getNumPag() {
		return numPag;
	}

	public void setNumPag(Integer numPag) {
		this.numPag = numPag;
	}

	public abstract Integer peso();

}
