package ejercicio54;

public class Retirada extends Movimiento {

	@Override
	public String toString() {
		return "[R - " + getFecha() + " - " + getImporte() + "]";
	}

	@Override
	public String getTipo() {
		String r = "retirada";
		return r;

	}

}
