package ejercicio37;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {
	private List<String> lista;

	
	public ColaCadenas() {
		this.lista = new ArrayList<>();
	}
	public void añadirCadena(String cad) {
		lista.add(cad);
	}

	public String sacarCadena() {
		return lista.get(0);
	}

	public Integer getTamaño() {
		return lista.size();

	}

	@Override
	public String toString() {
		return "ColaCadenas [lista= " + lista + "]";
	}
}
