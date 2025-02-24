package ejercicio52;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private Cliente cliente;
	private List<Articulo> articulos;

	public Carrito(Cliente cliente) {
		this.cliente = cliente;
		fechaCreacion = LocalDate.now();
		fechaModificacion = LocalDate.now();
		articulos = new ArrayList<>();
	}

	public BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Articulo articulo : articulos) {
			total = total.add(articulo.getPrecio());
		}

		return total;

	}

	public BigDecimal getPrecioMedio() {
		if (getCantidad() == 0) {
			return BigDecimal.ZERO;
		}
		BigDecimal cantidad = new BigDecimal(getCantidad());

		return getTotal().divide(cantidad, 2, RoundingMode.HALF_UP);

	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Cliente: " + cliente.getDni() + " / " + cliente.getNombre() + " Artculos: " + getCantidad() + " / "
				+ getTotal() + " euros" + " Fecha ltima actualizacin :" + fechaModificacion.format(formato);
	}

	public void addArticulo(Articulo articulo) {
		articulos.add(articulo);
		fechaModificacion = LocalDate.now();
	}

	public void borrarArticulo(int posicion) {

		// hay que comprobar si la posicion es correcta:

		if (posicion >= 0 && posicion < this.articulos.size()) // posicion < getCantidad()
		{
			articulos.remove(posicion);
			fechaModificacion = LocalDate.now();
		}
	}

	public void vaciarCesta() {
		articulos.clear();
		fechaModificacion = LocalDate.now();
	}

	public Integer getCantidad() {
		return articulos.size();

	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

}
