package ejercicio32;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Reloj reloj = new Reloj();

		System.out.print("Diga la hora =");
		Integer hora = sc.nextInt();
		

		System.out.print("Diga los minutos =");
		Integer minutos = sc.nextInt();
		

		System.out.print("Diga los segundos =");
		Integer segundos = sc.nextInt();
	
		reloj.ponerEnHora(hora, minutos, segundos);
		System.out.println(reloj);

		reloj.setFormato24horas(false);

		reloj.ponerEnHora(24, 17);
		System.out.println(reloj);

		reloj.ponerEnHora(21, 82);
		System.out.println(reloj);
		
		reloj.ponerEnHora(17, 16, 15);
		System.out.println(reloj);
		
		Reloj reloj2 = new Reloj(17, 16, 15);
		
		System.out.println(reloj.equals(reloj2));
		sc.close();
	}
}
