
public class ImportDuty extends Tax{
	public ImportDuty() {
		super(NOTAX);
	}
	
	public ImportDuty(Tax tax) {
		super(tax);
	}
	
	@Override
	public double getTax(Product product) {
		return tax.getTax(product) + product.getImported().getImportDuty();
	}

}
