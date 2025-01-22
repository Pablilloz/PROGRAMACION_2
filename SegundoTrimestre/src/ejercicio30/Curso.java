package ejercicio30;

import orientadaObjetos.Alumno;

public class Curso  {
	private String identificador;
	private Alumno[] alumnos;
	
	
	public void addAlumno(Alumno alumno) {
		
	
	for(int i = 0; i< alumnos.length; i++) {
		if(alumnos[i] == null) {
			alumnos[i] = alumno;
			return;
		}
	}
		System.out.println("No hay sitio para mas alumnos");
	}
	
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "identificador=" + identificador + ", descripcion=" + descripcion ;
	}

	private String descripcion;

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
