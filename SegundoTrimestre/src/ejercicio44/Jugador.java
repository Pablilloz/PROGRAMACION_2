package ejercicio44;

public class Jugador {
	private String nombre;
	private EquipoCombate equipo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EquipoCombate getEquipo() {
		return equipo;
	}

	public void setEquipo(EquipoCombate equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", equipo=" + equipo + "]";
	}

}
