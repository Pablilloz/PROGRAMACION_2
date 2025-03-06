package ejer3Repaso;

public class Telefono {

	private Integer numero;
	private Boolean enLlamada;

	public Telefono(Integer numero) {
		this.enLlamada = false;
		this.numero = numero;
	}

	public Integer consultarNumero() {

		return this.numero;
	}

	public void marcar(Integer num) {
		System.out.println("LLAMANDO A " + num);
		if (num == this.numero) {
			System.out.println("COMUNICANDO");
		} else {
			System.out.println("EN COMUNICACION");
			this.enLlamada = true;
		}
	}
	
	public void colgar() {
		if(this.enLlamada == true) {
			System.out.println("COMUNICACIÓN TERMINADA");
			this.enLlamada = false;
		}else {
			
		}
	}

}
