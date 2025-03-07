package ejer7Repaso;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Curso {

	private String nombre;
	private LocalDate fechaIni;
	private LocalDate fechaFin;
	private BigDecimal precio;
	private Integer numPlaTota;
	private Integer numPlaOcu;

	public Curso(String Nombre, BigDecimal precio, Integer Plazas) {
		this.nombre = Nombre;
		this.precio = precio;
		this.numPlaTota = Plazas;
		this.numPlaOcu = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(LocalDate fechaIni) {
		this.fechaIni = fechaIni;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getNumPlaTota() {
		return numPlaTota;
	}

	public void setNumPlaTota(Integer numPlaTota) {
		this.numPlaTota = numPlaTota;
	}

	public Integer getNumPlaOcu() {
		return numPlaOcu;
	}

	public void setNumPlaOcu(Integer numPlaOcu) {
		this.numPlaOcu = numPlaOcu;
	}

	public Integer getDuracionCurso() {

		Period periodo = this.fechaIni.until(fechaFin);
		Integer mesesdif = periodo.getMonths() + periodo.getYears() * 12;

		return mesesdif;
	}

	public Boolean isPlazasLibres() {
		return this.numPlaOcu < this.numPlaTota;

	}

	public BigDecimal getPrecioMes() {

		BigDecimal media = new BigDecimal(getDuracionCurso());
		return this.precio.divide(media);

	}

}
