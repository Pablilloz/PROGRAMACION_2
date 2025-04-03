package ejercicio06;

import java.math.BigDecimal;

public class Persona {
	private String genero;
	private BigDecimal altura;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) throws ParametroIncorrectoException {
		if (genero.toUpperCase().equals("H") || genero.toUpperCase().equals("M")) {
			this.genero = genero;
		} else {
			throw new ParametroIncorrectoException("Tiene que ser H o M");
		}

	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) throws ParametroIncorrectoException {
		if (altura.compareTo(new BigDecimal("0")) < 0 || altura.compareTo(new BigDecimal("3")) > 0) {
			throw new ParametroIncorrectoException("El numero debe estar entre 0 y 3");
		}

		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [genero=" + genero + ", altura=" + altura + "]";
	}

}
