package ejercicio38;

import java.util.ArrayList;
import java.util.List;

public class PilaCadenas {
	private List<String> listaCadenas;

	public PilaCadenas() {
		this.listaCadenas = new ArrayList<>();
	}

	public void añadirCadena(String cadena) {
		listaCadenas.add(cadena);
	}

	public String sacarCadena() {

		if (listaCadenas.isEmpty()) {
			return null;
		}
		String cadena = listaCadenas.get(listaCadenas.size()-1);
		listaCadenas.remove(listaCadenas.size()-1);
		return cadena;
	}

	public Integer getTamaño() {
		Integer tamaño = listaCadenas.size();

		return tamaño;
	}

	@Override
	public String toString() {
		return "PilaCadenas [listaCadenas=" + listaCadenas + "]";
	}

	public List<String> getListaCadenas() {
		return listaCadenas;
	}

	public void setListaCadenas(List<String> listaCadenas) {
		this.listaCadenas = listaCadenas;
	}

}
