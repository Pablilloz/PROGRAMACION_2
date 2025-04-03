package ejercicio03;

import java.util.InputMismatchException;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer numero = 0;
		SacoNumero sacoNumeros = new SacoNumero();
		Integer posicion = 0;
		try {

			do {
				try {

					System.out.print("Escriba un numero entero :");
					numero = sc.nextInt();
					if (!numero.equals(-1)) {
						sacoNumeros.addNumero(numero);
					}
				} catch (InputMismatchException exception) {
					System.out.println("solo se admiten numeros");
					sc.nextLine();
				}
			}

			while (!numero.equals(-1));
			System.out.println("Lista : " + sacoNumeros);

			do {

				System.out.print("Diga la posicion que quiere obtener el numero :");
				posicion = sc.nextInt();

				System.out.println(sacoNumeros.getNumero(posicion));

			} while (!posicion.equals(-1));
			System.out.println(sacoNumeros);

		} finally {
			sc.close();
			System.out.println("Scanner cerrado correctamente");
		}
		System.out.println(sacoNumeros.division());
	}
}
