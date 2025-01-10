package TEMA4;

public class Calculadora {

	public static Integer suma(Integer n1, Integer n2) {
		Integer sumaTotal = n1 + n2;
		return sumaTotal;
	}

	public static Integer resta(Integer n1, Integer n2) {
		Integer restaTotal = n1 - n2;
		return restaTotal;
	}

	public static Integer multiplicacion(Integer n1, Integer n2) {
		Integer MultiplicacionTotal = n1 * n2;
		return MultiplicacionTotal;
	}

	public static Integer division(Integer n1, Integer n2) {
		if (n2 == 0)
			return 0;
		else
			return n1 / n2;

	}

	public static Integer calcular(String cad, Integer n1, Integer n2) {

		if (cad.equals("ADD")) {
			return suma(n1, n2);
		}
		if (cad.equals("SUB")) {
			return division(n1, n2);
		}
		if (cad.equals("MUL")) {
			return multiplicacion(n1, n2);
	}
		if (cad.equals("DIV")) {
			return division(n1, n2);
		}
		return null;
	}

}
