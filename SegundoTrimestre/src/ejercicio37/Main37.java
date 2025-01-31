package ejercicio37;

import java.util.ArrayList;
import java.util.List;

import orientadaObjetos.Alumno;

public class Main37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaCadenas cola = new ColaCadenas();
		System.out.println(cola);

		cola.añadirCadena("Primero");
		cola.añadirCadena("Segundo");
		System.out.println(cola);

		String elemento = cola.sacarCadena();
		System.out.println(elemento);
		System.out.println(cola);

		cola.añadirCadena("Tercero");
		System.out.println(cola);

		while (cola.getTamaño() > 0) {
			elemento = cola.sacarCadena();
			System.out.println(elemento);
		}
		System.out.println(cola);

		cola.añadirCadena("Cuarto");
		System.out.println(cola);

	}

}

