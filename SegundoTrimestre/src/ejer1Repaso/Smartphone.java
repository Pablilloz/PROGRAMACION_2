package ejer1Repaso;

import java.time.LocalDate;
import java.time.Period;

public class Smartphone {
	private String marca;
	private String modelo;
	private String imei;
	private Double precio;
	private LocalDate fechaFabricacion;
	private Boolean activo;

	public Smartphone() {
		this.activo = true;
		this.precio = 0.0;
	}

	public Smartphone(String imei) {
		this.imei = imei;
		this.activo = true;
		this.precio = 0.0;
	}

	public Smartphone(String imei, String marca, String modelo) {
		this.imei = imei;
		this.marca = marca;
		this.modelo = modelo;
		this.activo = true;
		this.precio = 0.0;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public void activar() {
		this.activo = true;
	}

	public void desactivar() {
		this.activo = false;
	}

	public Integer getEdad() {
		LocalDate fecha = LocalDate.of(2000, 4, 1);

		Period periodo = fecha.until(fechaFabricacion);
		Integer añosDiferencia = periodo.getYears();

		return añosDiferencia;
	}

	public void cambiarMarcaModelo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public void establecerFabricacion(LocalDate fecha) {
		this.fechaFabricacion = fecha;
	}

	public Double getPrecioMasIva() {

		Double precio = (this.precio * 0.21) + this.precio;

		return precio;
	}

	public Boolean isAltaGama(Double precioBase) {

		if (this.precio > precioBase) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean isDatosCompletos() {
		if (this.imei.equals(" ") || (this.precio == null) || (this.imei.isBlank())) {
			return false;
		} else {
			return true;
		}
	}

	public Boolean isGratis() {
		if (this.precio == 0.0) {
			return true;
		}
		return false;
	}

	public void rebajar() {
		if (this.precio > 10) {
			this.precio = this.precio - 10.00;
		}
	}

	@Override
	public String toString() {
		String resultado = marca + " (" + modelo + ") ";
		if (!activo) {
			resultado += " -inactivo";
		}
		return resultado;
	}
}