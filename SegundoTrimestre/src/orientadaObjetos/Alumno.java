package orientadaObjetos;

import java.util.Objects;

import ejercicio22.Curso;

public class Alumno extends Persona {

	private Double nota;
	private String dni;
	private Curso curso;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumno() {

	}

	public Alumno(String dni) {
		super();
		this.dni = dni.toUpperCase();
	}

	public boolean validarDNI() {
		if ((dni == null) || (dni.isBlank())) {
			return false;
		}
		if (dni.length() != 9) {
			return false;

		} else {
			return true;
		}
	}
	
	public boolean validar() {
		return true;
	}

	@Override
	public String toString() {
		return "Alumno nota=" + nota + ", dni=" + dni + ", curso=" + curso + ", nombre=" + nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
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
