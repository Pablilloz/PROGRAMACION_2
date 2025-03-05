package ejer2Repaso;

import java.math.BigDecimal;

public class Movil extends Telefono {
	private BigDecimal posicion;

	public Movil(Integer numero, BigDecimal posicion) {
		super(numero);
		this.posicion = posicion;
	}

}
