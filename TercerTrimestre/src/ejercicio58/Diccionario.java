package ejercicio58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {
	private Map<String, List<String>> lista;

	public Diccionario() {
		lista = new HashMap<>();
	}

	public void cargarDiccionario(List<String> palabras) {
		if (palabras != null) {
			for (String palabra : palabras) {
				String ini = palabra.substring(0, 1);
				ini = ini.toUpperCase();

				if (lista.containsKey(ini)) {
					lista.get(ini).add(palabra);
				} else {
					List<String> listaPalabras = new ArrayList<>();
					listaPalabras.add(palabra);
					lista.put(ini, listaPalabras);
				}
			}
		}
	}

	public void borrarDiccionario() {
		lista.clear();
	}

	public void imprimirPalabras(String palabra) {
		List<String> lista1 = lista.get(palabra.toUpperCase());
		if (lista == null) {
			System.out.println("No hay palabra que empiezan opr " + palabra);
		} else {
			System.out.println("Hay " + lista1.size() + " palabras que empienza por " + palabra);
			for (String string : lista1) {
				System.out.println("\t " + string);
			}
		}
	}

}
