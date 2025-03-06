package ejer4Repaso;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		Libreria libreria = new Libreria();
		libreria.setDireccion("Avda. de los sueños perdidos, 89");
		libreria.setTelefono(954696954);

		// 2
		Normal libroFisico1 = new Normal("Jesus va a la ciudad", "Pablo", LocalDate.of(2006, 12, 8), 12, 14, 120, 123);
		Normal libroFisico2 = new Normal("Anto va a la ciudad", "Pablo", LocalDate.of(2012, 12, 8), 14, 15, 130, 124);

		// 3
		Digital libroDigital1 = new Digital("Juan va a la ciudad", "Pablo", LocalDate.of(2001, 12, 8), 123);
		Digital libroDigital2 = new Digital("Paco va a la ciudad", "Pablo", LocalDate.of(2000, 12, 8), 125);

		// 4
		libreria.getListaLibros().add(libroFisico1);
		libreria.getListaLibros().add(libroFisico2);
		libreria.getListaLibros().add(libroDigital1);
		libreria.getListaLibros().add(libroDigital2);

		// 5
		System.out.println(libreria.obtenerLibroMasAntiguo());
		System.out.println(libreria.obtenerPesototalDelLibro());
		System.out.println(libreria.obtenerNumPaginasMedio());
	}
}
