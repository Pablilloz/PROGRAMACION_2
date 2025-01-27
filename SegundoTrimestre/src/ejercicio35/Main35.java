package ejercicio35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio22.Curso;
import orientadaObjetos.Alumno;

public class Main35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Curso curso = new Curso();
		curso.setDescripcion("DAM-DAW");
		curso.setIdentificador("1");
		
		//creo la lista de Alumno
		List<Alumno> Alumno = new ArrayList<>();

		for (int i = 0; i < 3; i++) {

			System.out.print("Diga el dni = ");
			String dni = sc.nextLine();
			Alumno alumno1 = new Alumno(dni);

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

			Alumno.add(alumno1);
			
		}
		sc.close();
		for (Alumno alumno : Alumno) {
			System.out.println(alumno);
		}
		if (Alumno.get(0).equals(Alumno.get(1)) || Alumno.get(0).equals(Alumno.get(2)) || Alumno.get(1).equals(Alumno.get(2))) {
			System.err.print("Ocurre un error hay al menos 2 alumnos iguales");

		} else {
			System.out.println("Bien todos los alumnos son diferentes");
		}
	}


	}


