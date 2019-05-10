package mercadoCentral;

import java.util.ArrayList;

public class Caja implements Agencia {
	private Integer montoTotal;
	
	
	public Integer getMontoAPagar() {
		return montoTotal;
	}

	public Caja(Integer montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	public void registrar (ArrayList <Producto> productos) {
		for (Producto p: productos) {
			this.montoTotal += p.montoAPagar();
		}
	}
	
	public void registrar2 (ArrayList <Factura> facturas) {
		for (Factura f: facturas) {
			this.montoTotal = f.montoAPagar();
			Agencia.registrarPago(Factura f);
		}
	}
	
	public void registrarPago(Factura factura) {
		// no se que hace
	}
	
}
