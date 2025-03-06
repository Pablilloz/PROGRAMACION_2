package ejer4Repaso;

import java.time.LocalDate;

public class Normal extends Libro {
	private Integer ancho;
	private Integer alto;
	private Integer peso;

	public Normal(String titulo, String autor, LocalDate fechaEdicion, Integer numPag, Integer ancho, Integer alto,
			Integer peso) {
		super(titulo, autor, fechaEdicion, numPag);
		this.ancho = ancho;
		this.alto = alto;
		this.peso = peso;
	}

	public Integer getAncho() {
		return ancho;
	}

	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}

	public Integer getAlto() {
		return alto;
	}

	public void setAlto(Integer alto) {
		this.alto = alto;
	}

	public Integer getPeso() {
		return this.peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	@Override
	public Integer peso() {

		return this.peso;
	}

}
