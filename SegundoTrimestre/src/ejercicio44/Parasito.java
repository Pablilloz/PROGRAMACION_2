package ejercicio44;

public  class Parasito extends Personaje {
	public static final Integer VIDA = 200;
	public static final Integer RESTA = 2;
	public static final Integer TIEMPO = 1;
	
	public Integer getPuntos() {
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
