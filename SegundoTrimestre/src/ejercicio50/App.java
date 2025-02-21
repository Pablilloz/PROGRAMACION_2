package ejercicio50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		Set<Pais> s1 = new HashSet<>();
		System.out.println(s1);
		// 2
		Pais pais1 = new Pais("ES","España");
		Pais pais2 = new Pais("CK","Islas Cook");
		Pais pais3 = new Pais("CK","Islas Caimán");
		// 3
		s1.add(pais1);
		s1.add(pais2);
		s1.add(pais3);
		System.out.println(s1);
		
		//4
		Pais pais4 = new Pais("es","España");
		s1.add(pais4);
		System.out.println("Apartado 4 = "+ s1);
		// 5 se cambia el equals
		
		//6
		Iterator<Pais>it = s1.iterator();
		while(it.hasNext()) {
			Pais pais = it.next();
			if(!pais.getCodigo().equals("ES")) {
				it.remove();
			}
			System.out.println(s1);
		s1.clear();
		System.out.println(s1);
		}
		
	
	
	}}


