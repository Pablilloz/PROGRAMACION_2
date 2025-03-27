package ejercicio56;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> mapa = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		Integer numero;
		Integer contador = 0;
		Integer cont2 = -1;
		do {

			System.out.print("Escriba un número entero = ");
			numero = sc.nextInt();
			cont2++;
			if (!numero.equals(0)) {

				if (mapa.containsKey(numero)) {

					Integer cantidadActual = mapa.get(numero);
					mapa.put(numero, cantidadActual + 1);
				} else {
					mapa.put(numero, 1);
				}
				contador++;

			}
		} while (!numero.equals(0));
		System.out.println("Total numeros indicados " + contador);
		System.out.println("Distribucion");

		Set<Entry<Integer, Integer>> keys = mapa.entrySet();
		for (Entry<Integer, Integer> entry : keys) {
			String terminacion = "veces";
			if (entry.getValue().equals(1)) {
				terminacion = "vez";
			}
			System.out.println("\t> numero " + entry.getKey() + ": " + entry.getValue() + " " + terminacion);
		}
		sc.close();
	}

}
