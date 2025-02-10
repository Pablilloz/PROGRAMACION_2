package ejercicio45;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer dia;
		Integer mes;
		Integer año;
		// 1
		do {
			System.out.print("Diga su dia nacimiento =");
			dia = sc.nextInt();

			System.out.print("Diga su mes nacimiento =");
			mes = sc.nextInt();

			System.out.print("Diga su año nacimiento =");
			año = sc.nextInt();
		} while (dia < 1 && dia > 31 && mes < 12 && mes > 1 && año < LocalDate.now().getYear());

		LocalDate fecha = LocalDate.of(año, mes, dia);
		System.out.println(fecha);

		// 2
		Boolean bisiesto = fecha.isLeapYear();

		if (bisiesto == true) {
			System.out.println("Has nacido en año bisiesto");
		} else {
			System.out.println("Tu año de nacimiento no es bisiesto");
		}

		// 3
		DayOfWeek diaSemana = fecha.getDayOfWeek();
		System.out.println("naciste el " + diaSemana);

		// 4
		Integer Año = fecha.getYear();
		System.out.println("Tienes " + (LocalDate.now().getYear() - Año) + " años");

		// 5
		Integer edad = (LocalDate.now().getYear() - Año);
		Integer vida = (100 - edad);
		System.out.println("Suponiendo que vas a vivir 100 años te quedan " + vida + " años");

		// 6
		Date Hora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
		String fechaCadena = formato.format(Hora);
		System.out.println("La hora actual es = " + fechaCadena);
		sc.close();
	}
}
