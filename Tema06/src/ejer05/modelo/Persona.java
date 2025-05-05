package ejer05.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ejer05.service.DatoIncompletosException;

public class Persona {

	private String nombre;
	private String apellidos;
	private String dni;
	private LocalDate fecha;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		DateTimeFormatter fomato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fomato.format(fecha) + "]";
	}

	public Boolean validar() throws DatoIncompletosException {
		if (dni.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || fecha == null)
			throw new DatoIncompletosException();
		return true;
	}

	public Boolean esMayor() {
		Integer año = fecha.getYear();
		Integer añoActual = 2025;
		Integer edad = año - añoActual;
		if (edad < 18) {
			return false;
		} else {
			return true;
		}

	}

}
