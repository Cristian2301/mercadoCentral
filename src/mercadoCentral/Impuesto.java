package mercadoCentral;

public class Impuesto implements Factura {
	private Integer tasaDelServicio;
	
	public Integer montoAPagar() {
		return this.tasaDelServicio;
	}
	
}
