package ejercicio28;

import java.util.Scanner;

import ejercicio22.Curso;
import orientadaObjetos.Alumno;

public class Main28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Curso curso = new Curso();
		curso.setDescripcion("DAM-DAW");
		curso.setIdentificador("1");
		
		//creo el Array de Alumno
		Alumno[] alumnos = new Alumno[3];

		for (int i = 0; i < alumnos.length; i++) {
			Alumno alumno1 ;	
			do {
				
			System.out.print("Diga el dni = ");
			String dni = sc.nextLine();
			alumno1 = new Alumno(dni);
			}while(alumno1.validarDNI() == false);

			System.out.print("Diga el nombre = ");
			String nombre = sc.nextLine();
			alumno1.setNombre(nombre);

			System.out.print("Diga la edad = ");
			Integer edad = sc.nextInt();
			alumno1.setEdad(edad);

			System.out.print("Diga el nota = ");
			Double nota = sc.nextDouble();
			alumno1.setNota(nota);

			sc.nextLine();

			alumno1.setCurso(curso);

			alumnos[i] = alumno1;
			
		}

		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		if (alumnos[0].equals(alumnos[1]) || alumnos[0].equals(alumnos[2]) || alumnos[1].equals(alumnos[2])) {
			System.err.print("Ocurre un error hay al menos 2 alumnos iguales");

		} else {
			System.out.println("Bien todos los alumnos son diferentes");
		}
	}


}
