package ejercicio01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer numero;
		List<Integer> lista = new ArrayList<>();
		try {

			do {
				System.out.print("Escriba un numero entero :");
				numero = sc.nextInt();
				if(!numero.equals(-1)) {
					lista.add(numero);
				}

				

			} while (!numero.equals(-1));

			System.out.println(lista);
		} catch (InputMismatchException exception) {
			System.out.println("Eso no es correcto");
			sc.nextLine();
		} finally {
			sc.close();
			System.out.println("Scanner cerrado correctamente ");
		}

	}

}
