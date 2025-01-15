package OrientadaObjetos;

import Ejercicio21.Persona;

public class Alumno extends Persona {

	private String nombre;
	private Integer edad;
	private Double nota;
	private String dni;

	public Alumno(String dni) {
	this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void aprobar() {
		this.nota = 5.0;

	}

}
