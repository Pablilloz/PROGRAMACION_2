package orientadaObjetos;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Alumno Alumno1 = new Alumno(null);

		System.out.print("DNI = ");
		String dni = sc.nextLine();
		Alumno1.setDni(dni);

		System.out.print("Nombre = ");
		String nombre = sc.nextLine();
		Alumno1.setNombre(nombre);

		System.out.print("Edad = ");
		Integer edad = sc.nextInt();
		Alumno1.setEdad(edad);

		System.out.print("Nota = ");
		Double nota = sc.nextDouble();
		Alumno1.setNota(nota);
		
		System.out.println("DNI = "+ Alumno1.getDni());
		System.out.println("NOMBRE = " + Alumno1.getNombre());
		System.out.println("Edad = " + Alumno1.getEdad());
		System.out.println("Nota = " + Alumno1.getNota());
		
		
		Alumno1.aprobar();
		System.out.println("Nueva nota = " + Alumno1.getNota());
		sc.close();
		
		
	}

}
