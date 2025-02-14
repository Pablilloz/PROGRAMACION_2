package ejercicio48;

public class Cliente {
	private String dni;
	private String nombre;

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
