package TEMA4;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Diga un numero");
		Integer n1 = sc.nextInt();
		System.out.println("Diga otro numero");
		Integer n2 = sc.nextInt();
		Integer suma = suma(n1, n2);
		System.out.println("La suma total es = " + suma);
sc.close();
	}

	public static Integer suma(Integer n1, Integer n2) {
		Integer sumaTotal = n1 + n2;

		return sumaTotal;

	}
}
