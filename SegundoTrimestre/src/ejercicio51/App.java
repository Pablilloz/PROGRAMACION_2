package ejercicio51;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<BigDecimal> lista = new ArrayList<>();

		while (lista.size() < 5) {
			System.out.println("Dame un numero : ");
			BigDecimal num = sc.nextBigDecimal();
			if (!lista.isEmpty()) {
				BigDecimal ultimo = lista.get(lista.size() - 1);
				if (num.compareTo(ultimo) > 0) {
					lista.add(num);
				} else {
					System.out.println("No es mayor que el anterior");
				}

			} else {
				lista.add(num);
			}
		}
		System.out.println("Lista");
		System.out.println(lista);

		// 2
		BigDecimal suma = BigDecimal.ZERO;
		for (BigDecimal dato : lista) {
			suma = suma.add(dato);

		}
		suma = suma.setScale(1, RoundingMode.HALF_DOWN);
		System.out.println(suma);

		// 3
		BigDecimal resultadoDivision = lista.get(0).divide(lista.get(1), 3, RoundingMode.HALF_UP);
		System.out.println("División del primer número entre el segundo: " + resultadoDivision);

	}
}
