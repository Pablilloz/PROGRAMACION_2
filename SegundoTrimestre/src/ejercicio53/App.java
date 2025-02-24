package ejercicio53;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		Hucha hucha = new Hucha();
		System.out.println(hucha);
		
		// 2
		hucha.meterDinero(new BigDecimal("100"));
		System.out.println(hucha);

		// 3
		hucha.meterDinero(new BigDecimal("50.501"));
		System.out.println(hucha);

		// 4
		hucha.sacarDinero(new BigDecimal("20.5"));
		BigDecimal dinero = hucha.contarDinero();
		System.out.println(hucha);

		// 5
		hucha.sacarDinero(new BigDecimal("200"));
		System.out.println(hucha);

		// 6
		hucha.meterDinero(dinero);
		System.out.println(hucha);

		// 7
		hucha.meterDinero(hucha.contarDinero());
		System.out.println(hucha);

		// 8
		hucha.meterDinero(hucha.romperHucha());
		System.out.println(hucha);
	}

}
