package ejercicio48;

import java.util.HashSet;

import ejercicio47.Libro;
import ejercicio47.Ropa;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente();
		cliente1.setDni("12345678X");
		cliente1.setNombre("Blas de los Montes");
		System.out.println(cliente1);

		HashSet cesta = new HashSet();
		//System.out.println(cesta);

		Ropa poncho = new Ropa();
		poncho.setColor("Azul");
		poncho.setDescripcion("Poncho");
		poncho.setTalla("XL");
		poncho.setPrecio(20.0);

		cesta.add(poncho);
		cesta.add(poncho);
		System.out.println(cesta);

		Libro nietzshe = new Libro();
		nietzshe.setAutor("Nietzshe");
		nietzshe.setDescripcion("Asi habla Zaratustra");
		nietzshe.setPrecio(15.0);

		cesta.add(nietzshe);
		System.out.println(cesta);

		cesta.remove(1);
		System.out.println(cesta);

		System.out.println(cesta.());

		cesta.vaciarCesta();
		System.out.println(cesta);

		System.out.println(cesta.getPrecioMedio());
	}

}
