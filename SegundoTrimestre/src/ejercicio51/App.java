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

		Integer num1;
		Integer num2;
		Integer num3;
		Integer num4;
		Integer num5;

		BigDecimal n1;
		BigDecimal n2;
		BigDecimal n3;
		BigDecimal n4;
		BigDecimal n5;

		do {
			// 1
			System.out.print("Escriba un numero = ");
			num1 = sc.nextInt();
			n1 = new BigDecimal(num1);
			System.out.println(n1);

			System.out.print("Escriba un numero = ");
			num2 = sc.nextInt();
			n2 = new BigDecimal(num2);
			System.out.println(n2);

			System.out.print("Escriba un numero = ");
			num3 = sc.nextInt();
			n3 = new BigDecimal(num3);
			System.out.println(n3);

			System.out.print("Escriba un numero = ");
			num4 = sc.nextInt();
			n4 = new BigDecimal(num4);
			System.out.println(n4);

			System.out.print("Escriba un numero = ");
			num5 = sc.nextInt();
			n5 = new BigDecimal(num5);
			System.out.println(n5);

			// Añadimos a la lista
			lista.add(n1);
			lista.add(n2);
			lista.add(n3);
			lista.add(n4);
			lista.add(n5);

		} while ((num1 > num2) || (num2 > num3) || (num3 > num4) || (num4 > num5));

		// 2
		BigDecimal suma = n1.add(n2).add(n3).add(n4).add(n5);
		BigDecimal redondeado = suma.setScale(1, RoundingMode.HALF_DOWN);
		System.out.println(redondeado);

		// 3

		BigDecimal division = n1.divide(n2);
		BigDecimal redondeado1 = division.setScale(3, RoundingMode.HALF_UP);
		System.out.println(redondeado1);
	}
}
