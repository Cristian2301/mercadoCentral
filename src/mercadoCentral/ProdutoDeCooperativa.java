package mercadoCentral;

public class ProdutoDeCooperativa extends Producto{
	
	public ProdutoDeCooperativa(Integer precio, Integer stock) {
		super(precio, stock);
	}
	
	public Integer getPrecio() {
		return (super.getPrecio() * 10) / 100;
	}
}
