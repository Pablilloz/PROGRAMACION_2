package ejercicio44;

public abstract class Personaje {
	private String nombre;
	private String codigo;
	
	public abstract Integer getPuntos();
	public abstract Integer getResta();
	public abstract Integer getSegundos();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
