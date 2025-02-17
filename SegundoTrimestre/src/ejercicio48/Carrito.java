package ejercicio48;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate fechaActualizacion;
	private Set<Articulo> listaArticulos;
	private Cliente cliente;

	public Carrito(Cliente cliente) {
		this.fechaCreacion = LocalDate.now();
		this.fechaActualizacion = LocalDate.now();
		this.cliente = cliente;
		this.listaArticulos = new HashSet<>();
	}

	public Integer getCantidad() {
		return listaArticulos.size();
	}

	public Double getTotal() {
		Double total = 0.0;
		for (Articulo articulo:listaArticulos ) {
			total = total + articulo.getPrecio();
		}
		return total;
	}

	public Double getPrecioMedio() {
		if (getCantidad() == 0) {
			return 0D;

		}
		return getCantidad() / getTotal();
	}

	public void borrarArticulo(Articulo posicion) {
		if (listaArticulos.remove(posicion)) {
			fechaActualizacion = LocalDate.now();
		}
		
		
	}

	public void vaciarCesta() {
		listaArticulos.clear();
	}

	public void addArticulo(Articulo articulo) {
		this.listaArticulos.add(articulo);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Set<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		return "cliente: " + cliente.getDni() + " / " + cliente.getNombre() + " Articulos : " + getCantidad() + " / "
				+ getTotal() + " Fecha " + fechaActualizacion.format(formato);
	}

}
