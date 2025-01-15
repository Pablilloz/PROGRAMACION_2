package repaso;

public class Caballo {

	private String nombre;
	private Integer carrerasGanadas;
	private String color;
	private Integer edad;
	
	public Caballo() {
		
	}
	
	public Caballo(String nombre,Integer carrerasGanadas,Integer edad,String color){
		this.nombre = nombre;
		this.carrerasGanadas = carrerasGanadas;
		this.color= color;
		this.edad= edad;
	}
	
	public void imprimeCarrerasGanadas() {
		System.out.println("El nº de carreras ganas es " + this.carrerasGanadas); 
	}
	public Integer añoNacimiento() {
	Integer año = 2025 - edad;
		return año;
	}
	public void relincha() {
		System.out.println("Hiiiiiieeeee");
	}
	public void incrementarCarrerasGanadas() {
		this.carrerasGanadas ++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCarrerasGanadas() {
		return carrerasGanadas;
	}

	public void setCarrerasGanadas(Integer carrerasGanadas) {
		this.carrerasGanadas = carrerasGanadas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
}
