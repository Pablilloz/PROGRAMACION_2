package ejercicio49;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<String> listaCadenas = new HashSet<>();
		Set<String> listaCadenasAux = new HashSet<>();
		String cad;

		for (int i = 0; i < 5; i++) {
			System.out.print("Escriba una cadena " + i + " = ");
			 cad = sc.nextLine();
			listaCadenas.add(cad);
		}
		//System.out.println(listaCadenas.toString());
		
		//System.out.print(listaCadenas.toString() + " ");
		// Apartado 2
		
		for(String a : listaCadenas) {
			String cadenaMay = a.toUpperCase();
			listaCadenasAux.add(cadenaMay);
			
		}
		listaCadenas = listaCadenasAux;
		System.out.println(listaCadenas);
		
		if (listaCadenas.contains("")) {
			System.err.print("= La cadena contiene alguna cadena vacia ");
		}
		//System.out.println(listaCadenas.toString());
		
		Iterator<String> it = listaCadenas.iterator();
		while (it.hasNext()) {
			if (it.next().length() < 6) {
				it.remove();
			}
		}
		
		//System.out.println(listaCadenas.toString()+ " ");

		sc.close();
	}
}
