package ejercicio43;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actores actor1 = new Actores();
		Actores actor2 = new Actores();
		Actores actor3 = new Actores();
		Actores actor4 = new Actores();

		actor1.setNombre("Blas Blau");
		actor1.setAñoNacimiento(1983);
		actor1.setNacionalidad("España");

		actor2.setNombre("Laura Pozo");
		actor2.setAñoNacimiento(1981);
		actor2.setNacionalidad("Italia");

		actor3.setNombre("Marce Cade");
		actor3.setAñoNacimiento(2001);
		actor3.setNacionalidad("Suiza");

		actor4.setNombre("Violeta Volo");
		actor4.setAñoNacimiento(1999);
		actor4.setNacionalidad("Rusia");

		Directores director1 = new Directores();
		director1.setNombre("Sara Marea");
		director1.setNacionalidad("Portugal");
		director1.setAñoNacimiento(1994);

		Guionistas guionista1 = new Guionistas();
		guionista1.setNombre("Marco Smith");
		guionista1.setAñoNacimiento(1988);
		guionista1.setNacionalidad("Reino Unido");

		Guionistas guionista2 = new Guionistas();
		guionista2.setAñoNacimiento(1977);
		guionista2.setNacionalidad("China");
		guionista2.setNombre("Cheng Shu");

		Peliculas pelicula1 = new Peliculas();
		pelicula1.setAñoDeEstreno(2027);
		pelicula1.setDirector(director1);
		pelicula1.setGuionista(guionista1);

		List<Actores> actores1 = new ArrayList();
		actores1.add(actor1);
		actores1.add(actor2);
		pelicula1.setListaActores(actores1);
		pelicula1.setTitulo("Do you know Joe Blas?");

		Peliculas pelicula2 = new Peliculas();
		pelicula2.setAñoDeEstreno(2027);
		pelicula2.setDirector(director1);
		pelicula2.setGuionista(guionista1);
		pelicula2.setTitulo("Muerte en la sombra");

		List<Actores> actores2 = new ArrayList();
		actores2.add(actor4);
		actores2.add(actor3);
		actores2.add(actor2);
		actores2.add(actor1);

		System.out.println(actores1);
		System.out.println(pelicula1.getGuionista().getSueldo() + " " + pelicula1.getGuionista().getNacionalidad());
		actores2.remove(actor3);
		actores1.add(actor3);
		System.out.println("Lista Pelicula 1 = " + actores1);
		System.out.println("Lista Pelicula 2 = " + actores2);
	}

}
