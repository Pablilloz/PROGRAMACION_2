package ejercicio23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Profesor profesorNuevo = new Profesor();

		System.out.print("Nombre del profesor nuevo = ");
		String nombre = sc.nextLine();
		profesorNuevo.setNombre(nombre);
		System.out.print("Diga la edad del profesor = ");
		Integer edad = sc.nextInt();
		profesorNuevo.setEdad(edad);

		sc.close();
		System.out.println("El nombre del nuevo profesor es = " + profesorNuevo.getNombre());
		System.out.println("La edad del nuevo profesor es = " + profesorNuevo.getEdad());
	}

}
