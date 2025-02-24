package ejercicio53;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hucha {
	private BigDecimal importeActual;

	public Hucha() {
		this.importeActual = BigDecimal.ZERO;
	}

	public BigDecimal meterDinero(BigDecimal importe) {
		BigDecimal suma = importeActual.add(importe).setScale(2,RoundingMode.HALF_DOWN);
		this.importeActual = suma;
		return suma;
	}

	public BigDecimal sacarDinero(BigDecimal importeAsacar) {
		if (importeAsacar.compareTo(importeActual) > 0) {
			BigDecimal Importe = importeActual;
			importeActual = BigDecimal.ZERO;
			return Importe;
			
		} else {
			importeActual = importeActual.subtract(importeAsacar);
			return importeAsacar;
		}
	}

	public BigDecimal contarDinero() {
		return importeActual;
	}

	public BigDecimal romperHucha() {
		BigDecimal sacado = importeActual;
		importeActual = BigDecimal.ZERO;
		return sacado;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,##0.00 €");
		return "Hucha [importeActual=" + formato.format(importeActual) + "]";
	}

}