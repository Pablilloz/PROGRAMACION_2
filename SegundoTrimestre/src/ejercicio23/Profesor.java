package ejercicio23;

import orientadaObjetos.Persona;

public class Profesor extends Persona{

	@Override
	public String toString() {
		return "Profesor Nombre=" + getNombre() + ", Edad =" + getEdad() + "";
	}

}
