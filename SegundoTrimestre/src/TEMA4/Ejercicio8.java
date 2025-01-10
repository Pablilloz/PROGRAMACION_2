package TEMA4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Que desea hacer? = ADD, SUB, MUL, DIV");
		String cad = sc.nextLine();
		
		System.out.println("Diga un numero");
		Integer n1 = sc.nextInt();

		System.out.println("Diga otro numero");
		Integer n2 = sc.nextInt();
		
		sc.close();
		
		Integer calcular = Calculadora.calcular(cad, n1, n2);
		System.out.println(calcular);
		
	}

}
