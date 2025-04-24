package ejer05.App;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import ejer05.service.DatoIncompletosException;
import ejer05.modelo.Persona;
import ejer05.service.PersonaService;

public class app {
	private static Scanner scanner;
	private static PersonaService servicio;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		servicio = new PersonaService();
		scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int respuesta;
		try {
			do {
				System.out.println("(1) Buscar persona por dni");
				System.out.println("(2) Buscar persona por Nombre-Apellido");
				System.out.println("(3) Insertar persona");
				System.out.println("(4) Actualizar Persona");
				System.out.println("(5) Borrar Persona");
				System.out.println("(0) Salir");
				respuesta = sc.nextInt();

				if (respuesta == 1) {
					consultaPersona();
				} else if (respuesta == 2) {
					consultarPersonas();
				} else if (respuesta == 3) {
					insertaPersona();
				} else if (respuesta == 4) {

				}

			} while (respuesta != 0);
		} finally {
			sc.close();
		}
	}

	private static void consultaPersona() throws SQLException {

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
					// TODO Auto-generated catch block
					System.out.println("Los datos no están completos");
					error = true;
				}

			}
		} while (error);

		servicio.insertarPersona(p);

	}

	private static void actualizarPersona() throws SQLException {
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

		servicio.ActualizarPersona(p);

	}

}
