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
	public static Integer buscarPalabra (String[]cad, String cad1) {
		
		if(!cad.equals(cad1)) {
			return -1;
		}
		else
			for(String dato:cad) {
				Integer contador = 0;
				do {
					contador ++;
					
				}while(cad.equals(cad1));
			}
		
		return;
	}
}
