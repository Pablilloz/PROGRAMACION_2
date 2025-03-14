package ejercicio47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate fechaActualizacion;
	private List<Articulo> listaArticulos;
	private Cliente cliente;

	public Carrito(Cliente cliente) {
		this.fechaCreacion = LocalDate.now();
		this.fechaActualizacion = LocalDate.now();
		this.cliente = cliente;
		this.listaArticulos = new ArrayList<>();
	}

	public Integer getCantidad() {
		return listaArticulos.size();
	}

	public Double getTotal() {
		Double total = 0.0;
		for (int i = 0; i < listaArticulos.size(); i++) {
			total = total + listaArticulos.get(i).getPrecio();
		}
		return total;
	}

	public Double getPrecioMedio() {
		if (getCantidad() == 0) {
			return 0D;

		}
		return getCantidad() / getTotal();
	}

	public void borrarArticulo(int posicion) {
		if (posicion >= 0 && posicion < this.listaArticulos.size()) {

		}
		listaArticulos.remove(posicion);
		fechaActualizacion = LocalDate.now();
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

	public List<Articulo> getListaArticulos() {
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
