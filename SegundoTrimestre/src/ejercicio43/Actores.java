package ejercicio43;

public class Actores extends Trabajadores {

	@Override
	public int getSueldo() {
		return 100000;

	}

	@Override
	public String toString() {
		return "Sueldo = " + getSueldo() + ", Nombre = " + getNombre() + ", Año de Nacimiento = "
				+ getAñoNacimiento() + ", Nacionalidad =" + getNacionalidad()  ;
	}

}
