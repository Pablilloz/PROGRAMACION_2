package TEMA4;

public class ArrayUtils {
	public static void imprimirArray(String cad[]) {
		for (String dato : cad) {
			System.out.print(dato + " ");
		}
	}

	public static String obtenerPalabra(String[] cad, Integer n1) {
		if (n1 >= cad.length || n1 < 0) {
			return " ";
		}
		String lugar = cad[n1];
		return lugar;
	}

	public static Integer buscarPalabra(String[] array, String palabra) {


		for (int i = 0; i < array.length; i++) {
			if (palabra.equals(array[i])) {
				return i;	
			}
		}

		return -1;
	}
}