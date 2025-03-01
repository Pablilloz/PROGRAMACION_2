package ejercicio47;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente();
		cliente1.setDni("12345678X");
		cliente1.setNombre("Blas de los Montes");
		System.out.println(cliente1);

		Carrito cesta = new Carrito(cliente1);
		//System.out.println(cesta);

		Ropa poncho = new Ropa();
		poncho.setColor("Azul");
		poncho.setDescripcion("Poncho");
		poncho.setTalla("XL");
		poncho.setPrecio(20.0);

		cesta.addArticulo(poncho);
		cesta.addArticulo(poncho);
		System.out.println(cesta);

		Libro nietzshe = new Libro();
		nietzshe.setAutor("Nietzshe");
		nietzshe.setDescripcion("Asi habla Zaratustra");
		nietzshe.setPrecio(15.0);

		cesta.addArticulo(nietzshe);
		System.out.println(cesta);

		cesta.borrarArticulo(1);
		System.out.println(cesta);

		System.out.println(cesta.getPrecioMedio());

		cesta.vaciarCesta();
		System.out.println(cesta);

		System.out.println(cesta.getPrecioMedio());
	}

}
