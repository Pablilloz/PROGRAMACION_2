package ejerRepaso.ejer1.App;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejerRepaso.ejer1.modelo.Producto;
import ejerRepaso.ejer1.service.ProductoService;

public class App {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Producto p = new Producto();
		Integer cont = 0;
		ProductoService metodos = new ProductoService();
		List<Producto> listaProductos = new ArrayList<>();
		try {
			do {
				System.out.print("Diga el id = ");
				Integer id = sc.nextInt();
				sc.nextLine();

				System.out.print("Escriba el nombre del producto = ");
				String nombre = sc.nextLine();

				System.out.print("Escriba el tipo de producto = ");
				String tipo = sc.nextLine();

				System.out.println("Indica el precio del producto = ");
				BigDecimal precio = sc.nextBigDecimal();

				p.setId(id);
				p.setNombre(nombre);
				p.setPrecio(precio);
				p.setTipo(tipo);

				listaProductos.add(p);
				metodos.insertarProductos(listaProductos);
				cont++;
			} while (cont <= 3);
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error");
		}
		try {
			System.out.print("Indica el tipo del producto =");
			String tipo = sc.nextLine();

			metodos.consultaTipoProductos(tipo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

	}
}
