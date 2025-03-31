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
		BigDecimal operaciones = BigDecimal.ZERO;
		BigDecimal primero = BigDecimal.ZERO;
		BigDecimal recorrido;

		try {
			for (Integer reco : lista) {
				if (reco == lista.getFirst()) {
					primero = new BigDecimal(reco);

				} else {
					recorrido = new BigDecimal(reco);
					if (reco == lista.getFirst() + 1) {
						operaciones = primero.divide(recorrido);
					} else {
						operaciones = operaciones.divide(recorrido, 2, RoundingMode.HALF_UP);
					}

				}
			}
			return operaciones;
		} catch (ArithmeticException e) {
			System.out.println("El denominador es 0");
			return operaciones;
		}

	}

	@Override
	public String toString() {
		return "SacoNumero [lista=" + lista.toString() + "]";
	}

}
