package ejer2Repaso;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		Movil telefonoMovil = new Movil(654654654, new BigDecimal("121414124"));
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
