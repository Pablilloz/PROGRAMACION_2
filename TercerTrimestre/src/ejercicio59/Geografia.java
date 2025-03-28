package ejercicio59;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Geografia {

	private Map<String, String> paises;

	public Geografia() {
		paises = new HashMap<>();
	}

	// Apartado 1
	public Boolean agregarPais(String pais, String capital) {

		pais = pais.toUpperCase();
		capital = capital.substring(0, 1).toUpperCase() + capital.substring(1).toLowerCase();

		paises.put(pais, capital);

		if (paises.containsKey(pais)) {
			paises.put(pais, capital);
			return true;
		} else {
			return false;
		}

	}

	// Apartado 2
	public String obtenerCapital(String pais) {

		pais = pais.toUpperCase();
		return paises.getOrDefault(pais, "");

	}

	// Apartado 3
	public void imprimirPaises() {
		Set<Entry<String, String>> pares = paises.entrySet();
		for (Entry<String, String> par : pares) {
			System.out.println("PAIS : " + par.getKey() + " - " + "CAPITAL: " + par.getValue());
		}

	}

	// Apartado 4
	public void eliminarPais(String pais) {
		pais = pais.toUpperCase();
		paises.remove(pais);
	}

	// Apartado 5
	public int calcularLongitudMediaPaises() {
		int total = 0;

		if (paises.isEmpty()) {
			return 0;
		} else {
			Set<Entry<String, String>> pares = paises.entrySet();
			for (Entry<String, String> par : pares) {
				total += par.getKey().length();
			}

			return total / paises.size();
		}

	}

	// Apartado 6
	public void eliminarPaisConCapitalLetra(String letra) {
		Set<Entry<String, String>> pares = paises.entrySet();
		Iterator<Entry<String, String>> iterador = pares.iterator();
		letra = letra.toUpperCase();

		while (iterador.hasNext()) {
			Map.Entry<String, String> entrada = iterador.next();
			if (entrada.getValue().startsWith(letra)) {
				iterador.remove();
				break;
			}

		}
	}

	// Apartado 7
	public int numeroPaisesConCapitalLetra(String letra) {

		int total = 0;

		Set<Entry<String, String>> pares = paises.entrySet();
		for (Entry<String, String> par : pares) {
			if (par.getValue().startsWith(letra.toUpperCase())) {
				total++;
			}
		}

		return total;
	}

	// Apartado 8
	public void imprimirNumeroPaisesLetra(String letra) {
		letra = letra.toUpperCase();
		boolean encontrado = false;
		Set<Entry<String, String>> pares = paises.entrySet();
		for (Entry<String, String> par : pares) {
			if (par.getValue().startsWith(letra)) {
				System.out.println(par.getKey() + " - " + par.getValue());
				encontrado = true;
			}

		}
		if (!encontrado) {
			System.out.println("Ninguna capital del mapa comienza por " + letra);
		}

	}

	// Apartado 9
	public void mismaLetra() {
		Set<Entry<String, String>> pares = paises.entrySet();
		for (Entry<String, String> par : pares) {
			if (par.getKey().substring(0, 1).startsWith(par.getValue().substring(0, 1))) {
				System.out.println(par.getKey() + " - " + par.getValue());
			} else {
				System.out.println("no hay ningún país y capital que comiencen por la misma letra");
			}
		}
	}
}
