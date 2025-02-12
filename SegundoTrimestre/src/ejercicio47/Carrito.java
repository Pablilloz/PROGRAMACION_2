package ejercicio47;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate fechaActualizacion;
	private List<Articulo> listaArticulos;
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public Carrito(Cliente cliente) {
		this.fechaCreacion = LocalDate.now();
		this.fechaActualizacion = LocalDate.now();
	}
	
	public Integer getCantidad() {
		return listaArticulos.size();
	}

	public List<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}

}
