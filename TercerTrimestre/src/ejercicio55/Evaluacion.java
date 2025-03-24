package ejercicio55;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Evaluacion {

	private Map<String, BigDecimal> mapa;

	public Evaluacion() {
		mapa = new HashMap<>();
	}

	public Boolean addNota(String dni, BigDecimal nota) {
		Boolean n = false;
		if (!mapa.containsKey(dni)) {
			mapa.put(dni, nota);
			n = true;
		} else {
			n = false;
		}
		return n;
	}

	public Boolean corregirNota(String dni, BigDecimal nota) {
		if (mapa.containsKey(dni)) {
			mapa.put(dni, nota);
			return true;
		}
		return false;
	}

	public BigDecimal obtenerNotaAlumno(String dni) {
		if (mapa.containsKey(dni)) {
			return mapa.get(dni);
		}
		BigDecimal z = BigDecimal.ZERO;
		return z;
	}

	public BigDecimal obtenerNotaMedia() {
		Collection<BigDecimal> notas = mapa.values();
		BigDecimal nota = BigDecimal.ZERO;
		for (BigDecimal notas1 : notas) {
			nota = nota.add(notas1);
		}
		BigDecimal n = new BigDecimal(notas.size());
		nota = nota.divide(n, 2, RoundingMode.HALF_UP);
		return nota;
	}

	public Integer obtenerCantidadAprobados() {
		Integer contador = 0;
		Collection<BigDecimal> values = mapa.values();
		for (BigDecimal n : values) {
			if (n.compareTo(new BigDecimal("5")) >= 0) {
				contador++;
			}
		}
		return contador;
	}

	public List<String> obtenerSuspensos() {
		List<String> listaNotas = new ArrayList<>();
		Set<Entry<String, BigDecimal>> p = mapa.entrySet();
		for (Entry<String, BigDecimal> n : p) {
			if (n.getValue().compareTo(new BigDecimal("5")) < 0) {
				listaNotas.add(n.getKey());
			}
		}
		return listaNotas;
	}

	public void borrarAprobados() {
		Set<String> listaAlum = mapa.keySet();
		Iterator<String> iterador = listaAlum.iterator();
		while (iterador.hasNext()) {

		}

		Collection<BigDecimal> values = mapa.values();
		for (BigDecimal v : values) {

		}

	}

}
