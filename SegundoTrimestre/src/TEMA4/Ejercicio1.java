package TEMA4;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String palabra = getMayusculas(" hola  soy jesssuuus   ");
System.out.println(palabra);
	}
public static String getMayusculas(String cad1) {
	return cad1.trim().toUpperCase();
}
}
