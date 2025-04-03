package ejercicio06;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {

			Persona persona = new Persona();

			System.out.println("Indique la altura de una persona");
			BigDecimal altura = sc.nextBigDecimal();
			try {
				persona.setAltura(altura);
			} catch (ParametroIncorrectoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sc.nextLine();

			System.out.println("Indique el genero de la persona");
			String genero = sc.nextLine();
			try {
				persona.setGenero(genero);
			} catch (ParametroIncorrectoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(persona);
		} finally {
			sc.close();
		}
	}

}
