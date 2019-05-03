package mercadoCentral;

public class Impuesto implements Cobrable {
	private Integer tasaDelServicio;
	
	public Integer montoAPagar() {
		return this.tasaDelServicio;
	}
	
}
