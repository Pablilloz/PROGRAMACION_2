package ejercicio22;

import java.util.Scanner;

import orientadaObjetos.Alumno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("DNI = ");
		String dni = sc.nextLine();
		Alumno alumno = new Alumno(dni);

		System.out.print("Nombre = ");
		String nombre = sc.nextLine();
		alumno.setNombre(nombre);

		System.out.print("Edad = ");
		Integer edad = sc.nextInt();
		alumno.setEdad(edad);

		System.out.print("Nota = ");
		Double nota = sc.nextDouble();
		alumno.setNota(nota);
		
		sc.nextLine();
		
		Curso curso = new Curso();
		System.out.print("id = ");
		String idCurso = sc.nextLine();
		System.out.print("descripcion = ");
		String descripcion = sc.nextLine();
		
		curso.setDescripcion(descripcion);
		curso.setIdentificador(idCurso);
		
		System.out.println("DNI = " + alumno.getDni());
		System.out.println("NOMBRE = " + alumno.getNombre());
		System.out.println("Edad = " + alumno.getEdad());
		System.out.println("Nota = " + alumno.getNota());
		System.out.println("El id curso es = " + idCurso);
		System.out.println("La descripcion es = " + descripcion);

		alumno.aprobar();
		System.out.println("Nueva nota = " + alumno.getNota());
		sc.close();

	}



	}


