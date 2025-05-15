package examen.modelo;

import java.math.BigDecimal;

public class SegundaMano extends Libro {
	private Integer antiguedad;

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public BigDecimal getPrecio() {
		return getPrecio().divide(new BigDecimal("2"));
	}
}
