package TEMA4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Di 1 o 2");
		Integer numero = sc.nextInt();
		String cadena = getMayMin(numero, "  holaa  Jeussuus . ");
		System.out.println(cadena);
		sc.close();
	}

	public static String getMayMin(Integer num, String cad) {
		cad = cad.trim();

		if (num == 1) {
			cad = Ejercicio1.getMayusculas(cad);
		} else {
			cad = Ejercicio2.getMinusculas(cad);
		}
		return cad;
	}

}
