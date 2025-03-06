package ejer4Repaso;

import java.time.LocalDate;

public class Digital extends Libro {

	public Digital(String titulo, String autor, LocalDate fechaEdicion, Integer numPag) {
		super(titulo, autor, fechaEdicion, numPag);
	}

	@Override
	public Integer peso() {
		
		return 0;
	}

	
	
}
