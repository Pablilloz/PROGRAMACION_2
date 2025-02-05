package ejercicio32;

public class Reloj {
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	private Boolean formato24horas;

	public Reloj() {
		this.horas = 00;
		this.minutos = 00;
		this.segundos = 00;

		this.formato24horas = true;
	}

	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		this.formato24horas = true;
	}
	public void ponerEnHora(Integer horas,Integer minutos) {
		
	}
	public void ponerEnHora(Integer horas,Integer minutos,Integer segundos) {
		
	}
	
	public Boolean check() {
		if((horas >= 0)&&(horas <= 23) &&(minutos >= 0)&&(minutos <= 59)&&(segundos <= 0)&&(segundos >=59)) {
			return true;
				
			}
		return false;
		}
	

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}

	public Boolean getFormato24horas() {
		return formato24horas;
	}

	public void setFormato24horas(Boolean formato24horas) {
		this.formato24horas = formato24horas;
	}

}
