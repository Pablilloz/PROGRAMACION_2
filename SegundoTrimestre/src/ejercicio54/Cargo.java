package ejercicio54;

public class Cargo extends Movimiento {
	private String cif;

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	@Override
	public String toString() {
		return "[C - " + getFecha() + " - " + getImporte() + " - " + cif + "]";
	}

	@Override
	public String getTipo() {
		String c = "cargo";
		return c;

	}

}
