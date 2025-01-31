package ejercicio41;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el nombre del primer equipo");
		String nombreEquipo = sc.nextLine();
		Equipo equipo1 = new Equipo(nombreEquipo);
		
		Equipo equipo2 = new Equipo();
		List<Jugador> nombres = new ArrayList();

		for (int e = 0; e < 3; e++) {
			System.out.println("Introduzca el nombre del jugador " + e + " = ");
			String nombre = sc.nextLine();
			equipo1.setJugadores(nombres);

		}
		System.out.println(nombres);

	}

}
/*
private static void cargarJugadores(Scanner sc,Equipo equipo) {
	for(int i = 0; i<3; i++) {
		System.out.print("Dime el dorsal del jugador" + i + " =");
		Integer dorsalJugador = sc.nextInt();
	
	
}
}	}*/
