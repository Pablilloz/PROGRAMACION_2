package ejercicio54;

public class Ingreso extends Movimiento {
	private String Descripcion;

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "[I - " + getFecha() + " - " + getImporte() + " - " + Descripcion + "]";
	}

	@Override
	public String getTipo() {
		String I = "ingreso";
		return I;

	}

}
