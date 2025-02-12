package ejercicio37;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {

	private List<String> listaCadenas;

	public ColaCadenas() {
		this.listaCadenas = new ArrayList<>();

	}

	public void añadirCadena(String cadena) {
		listaCadenas.add(cadena);

	}

	public String sacarCadena() {
		if (listaCadenas.isEmpty()) {
			return null;
		}
		String cadena = listaCadenas.get(0);
		listaCadenas.remove(0);
		return cadena;
	}

	public Integer getTamaño() {
		Integer tamaño = listaCadenas.size();

		return tamaño;
	}


	
	@Override
	public String toString() {
		return "ColaCadenas " + listaCadenas + "";
	}

	public List<String> getListaCadenas() {
		return listaCadenas;
	}

	public void setListaCadenas(List<String> listaCadenas) {
		this.listaCadenas = listaCadenas;
	}
}

