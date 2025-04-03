package ejercicio07;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String acabar;
		Sociedad persona = new Sociedad();
		do {
			System.out.print("Introduzca la altura de una persona : ");
			BigDecimal altura = sc.nextBigDecimal();

			sc.nextLine();

			System.out.print("Introduzca el genero de la persona : ");
			String genero = sc.nextLine();

			System.out.println("¿Deesea acabar? (S/N)");
			acabar = sc.nextLine();

			persona.addPersona(genero, altura);

		} while (acabar.equalsIgnoreCase("N"));
		System.out.println("Seleccione si quiere Hombre(H), Mujer(M) o total de altura media ");
		String genero = sc.nextLine();
		try {
			persona.calcularAlturaMedia(genero);
		} catch (ListaVaciaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
