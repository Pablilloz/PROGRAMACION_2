package ejercicio03;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class SacoNumero {
	private List<Integer> lista;

	public SacoNumero() {
		lista = new ArrayList<>();
	}

	public void addNumero(Integer n) {
		lista.add(n);
	}

	public Integer getNumero(Integer posicion) {

		try {
			return lista.get(posicion);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Ese valor no esta disponible");
		}
		return null;

	}

	public BigDecimal division() {
		try {
			BigDecimal resultado = new BigDecimal(lista.get(0));
			for (int i = 1; i < lista.size(); i++) {
				BigDecimal siguiente = new BigDecimal(lista.get(i));
				resultado = resultado.divide(siguiente, 2, RoundingMode.HALF_UP);
			}
			return resultado;
		} catch (ArithmeticException e) {
			return BigDecimal.ZERO;
		} catch (IndexOutOfBoundsException e) {
			return BigDecimal.ZERO;
		} finally {
			System.out.println("Division completa");
		}
	}

	@Override
	public String toString() {
		return "SacoNumero [lista=" + lista.toString() + "]";
	}

}
