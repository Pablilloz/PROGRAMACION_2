package ejercicio44;

public class Asesino extends Personaje {
	public static final Integer VIDA = 100;
	public static final Integer RESTA = 10;
	public static final Integer TIEMPO = 5;
	@Override
	public Integer getPuntos() {
		// TODO Auto-generated method stub
		return VIDA;
	}
	@Override
	public Integer getResta() {
		// TODO Auto-generated method stub
		return RESTA;
	}
	@Override
	public Integer getSegundos() {
		// TODO Auto-generated method stub
		return TIEMPO;
	}
}
