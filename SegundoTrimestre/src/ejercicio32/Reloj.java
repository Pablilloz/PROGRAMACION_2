package ejercicio32;

import java.util.Objects;

public class Reloj {
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	private Boolean formato24horas;

	public Reloj() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
		this.formato24horas = true;
	}

	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		this.formato24horas = true;
	}

	public void ponerEnHora(Integer horas, Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;

	}

	public void ponerEnHora(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public Boolean check() {
		if ((horas > 23) || (horas < 0)) {
			return false;
		}
		if ((minutos > 59) || (minutos < 0)) {
			return false;
		}
		if ((segundos < 0) || (segundos > 59)) {
			return false;
		}
		return true;
	}

	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public Boolean getFormato24horas() {
		return formato24horas;
	}

	public void setFormato24horas(Boolean formato24horas) {
		this.formato24horas = formato24horas;
	}

	private String formatearNumero(Integer numero) {
		if (numero < 10) {
			return "0" + numero;
		}
		else {
			return numero + "";
		}
	}

	@Override
	public String toString() {
		if (!check()) {
			return "HORA INCORRECTA";
		}
		if (formato24horas) {
			return formatearNumero(horas) + ":" + formatearNumero(minutos) + ":" + formatearNumero(segundos);
		}
		String franja = "";
		Integer horaRestada = horas;
		if (horas <= 12) {
			franja = "AM";
		} else {
			franja = "PM";
			horaRestada = horas - 12;
		}
		return formatearNumero(horaRestada) + ":" + formatearNumero(minutos) + ":" + formatearNumero(segundos);

	}

	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}

}
