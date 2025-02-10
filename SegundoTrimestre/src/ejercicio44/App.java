package ejercicio44;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador jugador1 = new Jugador();
		EquipoCombate equipo1 = new EquipoCombate();
		Asesino asesino1 = new Asesino();
		asesino1.setNombre("Paco");
		asesino1.setCodigo("A1");
		Asesino asesino2 = new Asesino();
		asesino2.setCodigo("A2");
		asesino2.setNombre("Luis");
		Asesino asesino3 = new Asesino();
		asesino3.setNombre("Juan");
		asesino3.setCodigo("A3");
		
		List<Personaje>lista = new ArrayList<>();
		lista.add(asesino3);
		lista.add(asesino2);
		lista.add(asesino3);
		
		equipo1.setTropa(lista);
		jugador1.setEquipo(equipo1);
		System.out.println(jugador1);
		
	}

}
