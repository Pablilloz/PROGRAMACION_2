package ejercicio59;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String pais;
		String capital;
		Geografia geografia = new Geografia();
		for (int i = 0; i <= 5; i++) {
			System.out.print("Escriba un país : ");
			pais = sc.nextLine();
			System.out.print("Ahora escriba su capital : ");
			capital = sc.nextLine();

			geografia.agregarPais(pais, capital);

		}
		// 1
		geografia.imprimirPaises();

		// 2
		System.out.println(geografia.calcularLongitudMediaPaises());

		// 3
		System.out.print("Indique una letra : ");
		String letra = sc.nextLine();

		// 4
		geografia.imprimirNumeroPaisesLetra(letra);

		// 5
		geografia.eliminarPaisConCapitalLetra(letra);

		// 6
		System.out.println("Numero de paises con capitales");
		geografia.imprimirNumeroPaisesLetra(letra);

		sc.close();
	}

}
