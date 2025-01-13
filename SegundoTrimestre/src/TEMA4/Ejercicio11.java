package TEMA4;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] palabras = {"manzana", "pera", "plátano", "uva"};
	        String palabraABuscar = "plátano";

	        int posicion = ArrayUtils.buscarPalabra(palabras, palabraABuscar);
	        if (posicion != -1) {
	            System.out.println("La palabra se encuentra en la posición: " + posicion);
	        } else {
	            System.out.println("La palabra no se encuentra en el array.");
	        }
	   }
	}