package ejer03.modelo;

import java.time.LocalDate;

import ejer03.service.DatoIncompletosException;

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

	public Boolean validar() throws DatoIncompletosException {
		if (dni.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || fecha == null)
			throw new DatoIncompletosException();
		return true;
	}
}
