package ejerRepaso.ejer1.App;

import java.util.Scanner;

import ejerRepaso.ejer1.modelo.Producto;

public class App {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Producto p = new Producto();
		Integer cont = 0;

		do {
			System.out.println("Diga el id");

			cont++;
		} while (cont <= 3);
	}

}
