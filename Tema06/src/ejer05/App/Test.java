package ejer05.App;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejer05.modelo.Persona;
import ejer05.service.PersonaService;

public class Test {
	private static PersonaService servicio;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Persona> ListaPersonas = new ArrayList<>();

		Persona p1 = new Persona();
		String dni;
		String nombre;
		String apellido;
		LocalDate fecha;
		String fechaP;
		int contador = 0;
		do {

			System.out.print("Escriba el dni = ");
			dni = sc.nextLine();
			p1.setDni(dni);

			System.out.print("Escriba el Nombre = ");
			nombre = sc.nextLine();
			p1.setNombre(nombre);

			System.out.print("Escribe el apellido = ");
			apellido = sc.nextLine();
			p1.setApellidos(apellido);

			System.out.print("Escriba la fecha de nacimiento = ");
			fechaP = sc.nextLine();
			fecha = LocalDate.parse(fechaP);
			p1.setFecha(fecha);

			ListaPersonas.add(p1);
			contador++;
		} while (contador <= ListaPersonas.size());
		servicio.insertarPersonas(ListaPersonas);

	}

}
