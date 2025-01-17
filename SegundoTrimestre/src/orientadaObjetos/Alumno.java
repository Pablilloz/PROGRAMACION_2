package orientadaObjetos;

public class Alumno extends Persona {

	private Double nota;
	private String dni;
	
	
public Alumno() {
	
}
	
	@Override
	public String toString() {
		return "Alumno [nota=" + nota + ", dni=" + dni + "]";
	}

	public Alumno(String dni) {
		super();
		this.dni = dni;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void aprobar() {
		this.nota = 5.0;

	}

}
