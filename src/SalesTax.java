import java.math.BigDecimal;

public class SalesTax extends Tax {
	public SalesTax() {
		super(NOTAX);
	}
	
	public SalesTax(Tax tax) {
		super(tax);
	}
	
	@Override
	public BigDecimal  getTax(Product product) {
		return tax.getTax(product).add(new BigDecimal(product.getCategory().getSalesTax()));
	}

}
