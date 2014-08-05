import java.math.BigDecimal;

public class ImportDuty extends Tax {
	public ImportDuty() {
		super(NOTAX);
	}
	
	public ImportDuty(Tax tax) {
		super(tax);
	}
	
	@Override
	public BigDecimal getTax(Product product) {
		return tax.getTax(product).add(new BigDecimal(product.getImported().getImportDuty()));
	}

}
