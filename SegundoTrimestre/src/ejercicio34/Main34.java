package ejercicio34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<String> listaCadenas = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.print("Escriba una cadena = ");
			String cad = sc.nextLine();
			listaCadenas.add(cad);
		}
		System.out.println(listaCadenas.toString());
// Apartado 1 
		for (int i = 0; i < listaCadenas.size(); i++) {

			String mayus = listaCadenas.get(i).toUpperCase();
			listaCadenas.set(i, mayus);
		}
		System.out.print(listaCadenas.toString() + " ");
//Apartado 2
		if (listaCadenas.contains("")) {
			System.err.print("= La cadena contiene alguna cadena vacia ");
		}

		Iterator<String> it = listaCadenas.iterator();
		while (it.hasNext()) {
			if (it.next().length() < 6) {
				it.remove();
			}
		}
		System.out.println(listaCadenas.toString() + " ");

		sc.close();
	}
}
