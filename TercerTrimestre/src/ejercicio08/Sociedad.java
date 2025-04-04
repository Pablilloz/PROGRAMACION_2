package ejercicio08;

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
		Integer contador = 0;
		BigDecimal suma = BigDecimal.ZERO;
		for (Persona persona : conjunto) {
			if (genero == null || persona.getGenero().equals(genero)) {
				suma = suma.add(persona.getAltura());
				contador++;
			}
		}
		if (contador == 0) {
			throw new ListaVaciaException("No hay personas con el genero indicado");
		}
		return suma.divide(new BigDecimal(contador));

	}

	
	public void borrarGenero() {
		
	}
	
}
