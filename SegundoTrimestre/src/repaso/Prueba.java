package repaso;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caballo caballo1 = new Caballo();
		/*
		 * Hace falta que los atributos sean publicos para poder cambiarlos desde el
		 * main
		 * 
		 */

		/*
		 * caballo1.color = "marron";
		 * 
		 * System.out.println(caballo1.nombre);
		 * System.out.println(caballo1.carrerasGanadas);
		 * System.out.println(caballo1.color);
		 */
		caballo1.imprimeCarrerasGanadas();

		caballo1.setEdad(20);
		caballo1.setCarrerasGanadas(5);
		
		caballo1.incrementarCarrerasGanadas();
		
		System.out.println(caballo1.getCarrerasGanadas());
		System.out.println(caballo1.añoNacimiento());
		
		caballo1.relincha();
		
		caballo1.setNombre("Bolita");
		
		System.out.println(caballo1.getNombre());
		
		caballo1.setColor("Negro");
		
		System.out.println(caballo1.getColor());
		
		caballo1.setEdad(2);
		caballo1.setCarrerasGanadas(10);
		System.out.println("**********ESTE ES EL CABALLO 2**********");
		Caballo caballo2 = new Caballo("fideo",20, 4,"blanco");
		System.out.println(caballo2.getNombre());
		
	}

}
