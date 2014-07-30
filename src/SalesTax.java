
public class SalesTax extends Tax {
	public SalesTax() {
		super(NOTAX);
	}
	
	public SalesTax(Tax tax) {
		super(tax);
	}
	
	@Override
	public double  getTax(Product product) {
		return tax.getTax(product)+ product.getCategory().getSalesTax();
	}

}
