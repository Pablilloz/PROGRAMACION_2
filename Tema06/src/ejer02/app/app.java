package ejer02.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import ejer02.modelo.Personas;
import ejer02.servicio.*;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre;

		PersonasServices service = new PersonasServices();
		System.out.println("Escriba un nombre");
		nombre = sc.nextLine();

		try {
			List<Personas> p = service.BuscarPersonas(nombre);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * Scanner sc = new Scanner(System.in); String dni;
		 * 
		 * try { PersonasService service = new PersonasService();
		 * System.out.print("Dame un dni = "); dni = sc.nextLine();
		 * 
		 * Persona p = service.ConsultarPersona(dni);
		 * 
		 * if (p == null) {
		 * System.out.println("No existe persona con los datos solicitados"); } else {
		 * System.out.println(p); } } catch (SQLException e) { // TODO Auto-generated
		 * catch block System.out.println(e.getMessage()); } sc.close();
		 */
	}
}
