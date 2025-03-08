package ejer7Repaso;

import java.math.BigDecimal;
import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Academia academia = new Academia();
		academia.setCiudad("Madrid");
		academia.setTelefono(912345678);

		Curso curso1 = new Curso("Java Básico", new BigDecimal("500"), 20);
		curso1.setFechaIni(LocalDate.of(2023, 10, 1));
		curso1.setFechaFin(LocalDate.of(2023, 12, 1));

		Curso curso2 = new Curso("Java Avanzado", new BigDecimal("800"), 15);
		curso2.setFechaIni(LocalDate.of(2023, 11, 1));
		curso2.setFechaFin(LocalDate.of(2024, 2, 1));

		academia.getLista().add(curso1);
		academia.getLista().add(curso2);

		System.out.println("Cursos disponibles: " + academia.getCursosDisponibles().size());
		System.out.println("Precio medio: " + academia.precioMedio());
		System.out.println("Curso más barato: " + academia.getCursoMasBarato().getNombre());
		System.out.println("Total plazas libres: " + academia.getTotalPlazasLibres());
	}

}
