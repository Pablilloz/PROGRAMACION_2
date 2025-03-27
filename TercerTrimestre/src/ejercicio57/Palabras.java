package ejercicio57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Palabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String palabra;
		String letra;
		String ini;

		Map<String, List<String>> palabras = new HashMap<>();

		do {
			System.out.print("Dime una palabra : ");
			palabra = sc.nextLine();

			if (!palabra.equalsIgnoreCase("Fin")) {
				ini = palabra.substring(0, 1);
				ini = ini.toUpperCase();

				if (palabras.containsKey(ini)) {
					palabras.get(ini).add(palabra);
				} else {
					List<String> listaPalabras = new ArrayList<>();
					listaPalabras.add(palabra);
					palabras.put(ini, listaPalabras);
				}
			}
		} while (!palabra.equalsIgnoreCase("FIN"));

		do {
			System.out.print("Dime una letra : ");
			letra = sc.nextLine();

			if (letra.equalsIgnoreCase("Fin")) {
				break;
			}
			List<String> lista = palabras.get(letra.toUpperCase());
			if (lista == null) {
				System.out.println("No hay palabras que empiezan por " + letra);
			} else {
				System.out.println("Hay " + lista.size() + " palabras que empiezan por " + letra);
				for (String p : lista) {
					System.out.println("\t> " + p);
				}

			}
		} while (!letra.equalsIgnoreCase("FIN"));

		System.out.println(palabras);
		sc.close();
	}
}
