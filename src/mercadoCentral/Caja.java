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
	
	public void registrar (ArrayList <Cobrable> cobrables) {
		for (Cobrable c: cobrables) {
			this.montoTotal += c.montoAPagar();
		}
	}
	
}
