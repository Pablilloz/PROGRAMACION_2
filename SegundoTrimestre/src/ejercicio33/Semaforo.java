package ejercicio33;

public class Semaforo {
	private String color;
	private Boolean parpadeando;
	public static final String ROJO = "Rojo";
	public static final String AMBAR = "Ambar";
	public static final String VERDE = "Verde";

	public Semaforo() {
		color = ROJO;
		parpadeando = false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equals(ROJO) || color.equals(AMBAR) || color.equals(VERDE)) {
			this.color = color;
		}

	}

	public Boolean isParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(boolean parpadeando) {
		if (parpadeando && color.equals(AMBAR)) {
			return;
		}
		this.parpadeando = parpadeando;
	}

	@Override
	public String toString() {
		String mensaje = "Semaforo en " + color;
		if (parpadeando) {
			mensaje += " parpadeando";
		}
		return mensaje;
	}

	public void cambiarEstado() {
		if (color.equals(VERDE)) {
			color = AMBAR;
			parpadeando = true;
		} else if (color.equals(AMBAR) && parpadeando) {
			parpadeando = false;
		} else if (color.equals(AMBAR)) {
			color = ROJO;
		} else {
			color = VERDE;
		}
	}

}
