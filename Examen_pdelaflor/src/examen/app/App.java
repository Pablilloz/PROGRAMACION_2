package examen.app;

import java.math.BigDecimal;
import java.util.Scanner;

import examen.modelo.Libreria;
import examen.modelo.Libro;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Libreria solicitarLibreria() {
		Libreria libreria = new Libreria();
		Libro libro = new Libro();

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el ISBN = ");
		String ISBN = sc.nextLine();
		libro.setISBN(ISBN);

		System.out.print("Introduce el titulo = ");
		String titulo = sc.nextLine();
		libro.setTitulo(titulo);

		System.out.print("Introduce el autor = ");
		String autor = sc.nextLine();
		libro.setAutor(autor);

		System.out.print("Introduce el precio = ");
		BigDecimal precio = sc.nextBigDecimal();
		libro.setPrecio(precio);

		return null;
	}

}
