package PracticaFinal.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Equipo {
	private String codigo;
	private String nombre;
	private List<Jugador> ListaJugadores;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Jugador> getListaJugadores() {
		return ListaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		ListaJugadores = listaJugadores;
	}

	@Override
	public String toString() {
		return "Equipo [codigo=" + codigo + ", nombre=" + nombre + ", ListaJugadores=" + ListaJugadores + "]";
	}

	public BigDecimal getEdadMedia() {
		
		BigDecimal total = BigDecimal.ZERO;
		LocalDate fecha = LocalDate.now();
		
		if (ListaJugadores.size() == 0) {
			return BigDecimal.ZERO;
		}
		for (Jugador jugador : ListaJugadores) {
			Period periodo = jugador.getFechaNacimiento().until(fecha);
			Integer añosDife = periodo.getYears();
			BigDecimal años = new BigDecimal(añosDife);
			total = total.add(años);
		}

		return total.divide(new BigDecimal(ListaJugadores.size()), 2, RoundingMode.HALF_DOWN);
	}
	
}
