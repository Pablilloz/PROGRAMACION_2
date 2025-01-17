package ejercicio20;

import java.util.Scanner;

import orientadaObjetos.Alumno;

public class Ejercicio20 {

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

		System.out.println("DNI = " + alumno.getDni());
		System.out.println("NOMBRE = " + alumno.getNombre());
		System.out.println("Edad = " + alumno.getEdad());
		System.out.println("Nota = " + alumno.getNota());

		alumno.aprobar();
		System.out.println("Nueva nota = " + alumno.getNota());
		sc.close();

	}

}
