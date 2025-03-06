package ejer3Repaso;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		LocalizacionGPS loc = new LocalizacionGPS(new BigDecimal("121414"), new BigDecimal("125151"));
		Movil telefonoMovil = new Movil(654654654, loc);
		Fijo telefonoFijo = new Fijo(954954954, "Calle Valparaiso");

		// 2
		System.out.println(telefonoMovil.consultarNumero());
		System.out.println(telefonoFijo.consultarNumero());

		// 3
		telefonoMovil.marcar(654654654);
		telefonoMovil.marcar(610610610);

		// 4
		telefonoMovil.colgar();
		telefonoMovil.colgar();
	}

}
