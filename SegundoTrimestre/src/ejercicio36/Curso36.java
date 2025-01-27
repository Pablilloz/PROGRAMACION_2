package ejercicio36;

import java.util.ArrayList;
import java.util.List;

import orientadaObjetos.Alumno;

public class Curso36 {
	public class Curso {
		private String identificador;
		private List<Alumno> alumnos;
		private Integer numAlumnosMaximos;

		public Curso(Integer numAlumnos) {
			this.numAlumnosMaximos = numAlumnos;
			alumnos = new ArrayList<>();
		}

		public void addAlumno(Alumno alumno) {

			if (alumnos.size() < numAlumnosMaximos) {
				alumnos.add(alumno);
			} else {

				System.out.println("No hay sitio para mas alumnos");
				{
				}
			}
		}

		public void setAlumnos(List<Alumno> alumnos) {
			this.alumnos = alumnos;
		}

		public List<Alumno> getAlumnos() {
			return alumnos;
		}

		@Override
		public String toString() {
			return "identificador=" + identificador + ", descripcion=" + descripcion;
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

}
