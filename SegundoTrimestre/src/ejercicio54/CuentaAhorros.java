package ejercicio54;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class CuentaAhorros {
	private String cuenta;
	private List<Movimiento> listaMov;

	public CuentaAhorros(String cuenta) {
		this.cuenta = cuenta;
		listaMov = new ArrayList<>();
	}

	public void getAñadir(Movimiento añadir) {
		listaMov.add(añadir);
	}

	public BigDecimal getTotal() {
		BigDecimal saldo = BigDecimal.ZERO;
		for (Movimiento dato : listaMov) {
			String a = dato.getTipo();
			if (a.equals("cargo")) {
				saldo = saldo.add(dato.getImporte());
			} else {
				saldo = saldo.subtract(dato.getImporte());
			}
			saldo = saldo.setScale(2, RoundingMode.HALF_DOWN);

		}
		return saldo;

	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public List<Movimiento> getListaMov() {
		return listaMov;
	}

	public void setListaMov(List<Movimiento> listaMov) {
		this.listaMov = listaMov;
	}

}
