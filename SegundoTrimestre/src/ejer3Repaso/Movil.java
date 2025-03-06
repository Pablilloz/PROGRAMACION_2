package ejer3Repaso;

import java.math.BigDecimal;

public class Movil extends Telefono {
	private LocalizacionGPS localizacion;

	public Movil(Integer numero, LocalizacionGPS loc) {
		super(numero);
		this.localizacion = loc;
	}

}
