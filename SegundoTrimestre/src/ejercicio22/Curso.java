package ejercicio22;

public class Curso  {
	private String identificador;
	@Override
	public String toString() {
		return "identificador=" + identificador + ", descripcion=" + descripcion ;
	}

	private String descripcion;

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
