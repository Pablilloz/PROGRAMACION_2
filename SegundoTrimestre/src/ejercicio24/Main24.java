package ejercicio24;

import java.util.Scanner;

import ejercicio23.Profesor;
import orientadaObjetos.Alumno;

public class Main24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Profesor profesorNuevo = new Profesor();
		Alumno alumno = new Alumno();

		System.out.print("Nombre del profesor nuevo = ");
		String nombre = sc.nextLine();
		profesorNuevo.setNombre(nombre);
		System.out.print("Diga la edad del profesor = ");
		Integer edad = sc.nextInt();
		profesorNuevo.setEdad(edad);

		System.out.print("Diga la nota del alumno = ");
		Double nota = sc.nextDouble();
		alumno.setNota(nota);

		sc.nextLine();
		System.out.print("Diga el dni del alumno = ");
		String dni = sc.nextLine();
		alumno.setDni(dni);

		sc.close();
	/*	System.out.println("El nombre del nuevo profesor es = " + profesorNuevo.getNombre());
		System.out.println("La edad del nuevo profesor es = " + profesorNuevo.getEdad());*/
		System.out.println(profesorNuevo);
		System.out.println(alumno);
	}

}
