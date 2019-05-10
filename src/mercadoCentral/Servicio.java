package mercadoCentral;

public class Servicio implements Factura{
	private Integer costoPorUnidad;
	private Integer unidadesConsumindas;

	
	public Integer montoAPagar() {
		return this.costoPorUnidad * this.unidadesConsumindas;
	}
	
}
