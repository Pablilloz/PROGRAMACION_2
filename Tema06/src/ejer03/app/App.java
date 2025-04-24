package ejer03.app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import ejer03.modelo.Persona;
import ejer03.service.DatoIncompletosException;
import ejer03.service.PersonaService;

public class App {

	private static Scanner scanner;
	private static PersonaService servicio;

	public static void main(String[] args) {

		try {
			servicio = new PersonaService();
			scanner = new Scanner(System.in);

			// Por DNI
			consultarPersona();

			// Filtro para buscar por nombre o apellidos

			consultarPersonas();

			// insertar
			insertaPersona();

		} catch (SQLException e) {
			System.out.println("Excepcion en main: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

	private static void consultarPersona() throws SQLException {

		System.out.println("Indica el  DNI  de la persona:");
		String vDni = scanner.nextLine();

		Persona p = servicio.consultarPersona(vDni);
		if (p == null) {
			System.out.println("No existe ninguna persona con el DNI " + vDni);
		} else {
			System.out.println(p);
		}

	}

	private static void consultarPersonas() throws SQLException {

		System.out.println("Indica nombre o apellidos a buscar:");
		String filtro = "";
		do {
			filtro = scanner.nextLine();
		} while (filtro.isEmpty());

		List<Persona> lista = servicio.consultarPersonas(filtro);
		for (Persona persona : lista) {
			System.out.println(persona);
		}

	}

	private static void insertaPersona() throws SQLException {
		Boolean error = false;
		Persona p = new Persona();
		do {

			System.out.println("Indica el DNI de la persona:");
			String vDni = scanner.nextLine();
			p.setDni(vDni);

			System.out.println("Indica el nombre de la persona:");
			String vNombre = scanner.nextLine();
			p.setNombre(vNombre);

			System.out.println("Indica los apellidos de la persona:");
			String vApellidos = scanner.nextLine();
			p.setApellidos(vApellidos);

			System.out.println("Indica la fecha de nacimiento (dd/MM/yyyy) de la persona:");
			String vFecha = scanner.nextLine();

			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			try {
				LocalDate fechaNacimiento = LocalDate.parse(vFecha, format);
				p.setFecha(fechaNacimiento);
			} catch (DateTimeParseException e) {
				System.out.println("La fecha indicada no es correta. Empieza de nuevo");
				error = true;
			}

			if (!error) {
				try {
					p.validar();
				} catch (DatoIncompletosException e) {
					System.out.println("Los datos no est�n completos.");
					error = true;
				}
			}
		} while (error);

		servicio.insertarPersona(p);

	}

}
