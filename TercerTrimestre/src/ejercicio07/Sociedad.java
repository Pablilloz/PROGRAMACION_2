package ejercicio07;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Sociedad {
	private Set<Persona> conjunto;

	public Sociedad() {
		conjunto = new HashSet<>();
	}

	public void addPersona(String genero, BigDecimal altura) {
		Persona persona = new Persona();
		try {
			persona.setGenero(genero);
		} catch (ParametroIncorrectoException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		try {
			persona.setAltura(altura);
		} catch (ParametroIncorrectoException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		conjunto.add(persona);
	}

	public BigDecimal calcularAlturaMedia(String genero) throws ListaVaciaException {
		genero = genero.toUpperCase();
		BigDecimal altura = BigDecimal.ZERO;
		int contador = 0;
		Boolean hay = false;

		if (conjunto.isEmpty()) {
			throw new ListaVaciaException("La lista está vacia");
		}

		if (genero.equals("H")) {
			for (Persona persona : conjunto) {
				if (persona.getGenero().equals(genero)) {
					altura = altura.add(persona.getAltura());
					contador++;
					hay = true;
				}
			}
			if (!hay) {
				throw new ListaVaciaException("No hay hombres");
			}

		} else if (genero.equals("M")) {
			for (Persona persona : conjunto) {
				if (persona.getGenero().equals(genero)) {
					altura = altura.add(persona.getAltura());
					contador++;
					hay = true;
				}
			}
			if (!hay) {
				throw new ListaVaciaException("No hay Mujeres");
			}
		} else {
			for (Persona persona : conjunto) {
				altura = altura.add(persona.getAltura());
				contador++;
			}
		}
		return altura.divide(new BigDecimal(contador));

	}

}
