package mercadoCentral;

public class Producto implements Cobrable {
	private Integer precio;
	private Integer stock;
	

	public Integer getPrecio() {
		return precio;
	}

	public Integer getStock() {
		return stock;
	}

	public Integer montoAPagar() {
		this.stock -= 1;
		return getPrecio();
	}

	public Producto(Integer precio, Integer stock) {
		this.precio = precio;
		this.stock = stock;
	}
}
