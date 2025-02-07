package ejercicio44;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador jugador1 = new Jugador();
		EquipoCombate equipo1 = new EquipoCombate();
		Asesino asesino1 = new Asesino();
		Asesino asesino2 = new Asesino();
		Asesino asesino3 = new Asesino();
		
		List<Personaje>lista = new ArrayList<>();
		lista.add(asesino3);
		lista.add(asesino2);
		lista.add(asesino3);
		
		equipo1.setTropa(lista);
		jugador1.setEquipo(equipo1);
		System.out.println(jugador1);
		
	}

}
