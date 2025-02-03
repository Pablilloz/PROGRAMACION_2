package ejercicio42;

import java.util.List;
import java.util.Scanner;

import ejercicio41.Equipo;
import ejercicio41.Jugador;
import ejercicio41.Partido;
import ejercicio41.Resultado;

public class Main42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime el nombre del primer equipo");
		String nombreEquipo = scanner.nextLine();
		Equipo equipo1 = new Equipo(nombreEquipo);
		cargarJugadores(scanner, equipo1);
		System.out.println(equipo1);

		System.out.println("Dime el nombre del segundo equipo");
		nombreEquipo = scanner.nextLine();
		Equipo equipo2 = new Equipo(nombreEquipo);
		cargarJugadores(scanner, equipo2);
		System.out.println(equipo2);

		Partido partido = new Partido();
		partido.setEquipoLocal(equipo1);
		partido.setEquipoVisitante(equipo2);
		Resultado resultado = new Resultado();
		partido.setResultado(resultado);
		System.out.println(partido);

		// apartado 3
		System.out.println("Dime los goles del equipo " + equipo1.getNombre());
		resultado.setGolesLocales(scanner.nextInt());
		System.out.println("Dime los goles del equipo " + equipo2.getNombre());
		resultado.setGolesVisitante(scanner.nextInt());
		System.out.println(partido);

		// apartado 4
		System.out.println("Equipo ganador: ");
		System.out.println(partido.getEquipoGanador());

		// apartado 5
		Jugador infiltrado = new Jugador("Blas Infiltrado", 99);
		equipo2.getJugadores().add(infiltrado);
		System.out.println(equipo2);

		// apartado 6
		List<Jugador> jugadoresEquipoLocal = equipo1.getJugadores();
		Integer tamaoLista = jugadoresEquipoLocal.size();
		Jugador ultimoJugador = jugadoresEquipoLocal.get(tamaoLista - 1);
		equipo1.setCapitan(ultimoJugador);
		System.out.println(equipo1);
		
		// apartado 7
		equipo1.setCompeticion("Liga Nacional");
		// apartado 8
		System.out.println(equipo2.getCompeticion());
		
		// apartado 9
		equipo2.setCompeticion("Copa Internacional");
		
		// apartado 10
		System.out.println(equipo1.getCompeticion());
		
		scanner.close();

	}

	private static void cargarJugadores(Scanner scanner, Equipo equipo) {
		for (int i = 0; i < 3; i++) {
			System.out.println("Dime el dorsal del jugador");
			Integer dorsalJugador = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Dime el nombre del jugador");
			String nombreJugador = scanner.nextLine();

			Jugador jugador = new Jugador(nombreJugador, dorsalJugador);
			equipo.getJugadores().add(jugador);

		}
		equipo.setCapitan(equipo.getJugadores().get(0));
	}
}
