package ejercicio38;

public class Main38 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PilaCadenas pila = new PilaCadenas();
		System.out.println(pila);

		pila.añadirCadena("Primero");
		pila.añadirCadena("Segundo");
		System.out.println(pila);

		String elemento = pila.sacarCadena();
		System.out.println(elemento);
		System.out.println(pila);

		pila.añadirCadena("Tercero");
		System.out.println(pila);

		
		while (pila.getTamaño() > 0) {
			elemento = pila.sacarCadena();
			System.out.println(elemento);
		}
		System.out.println(pila);

		pila.añadirCadena("Cuarto");
		System.out.println(pila);

	}

}