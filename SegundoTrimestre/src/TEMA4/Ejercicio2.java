package TEMA4;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String palabra = getMinusculas(" HOLAA SOY JEESUUSS    ");
	System.out.println(palabra);
	}
	public static String getMinusculas(String cad1) {
		return cad1.trim().toLowerCase();
}}
