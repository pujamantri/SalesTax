import java.math.BigDecimal;

public abstract class Tax {
	public static final Tax NOTAX = new NoTax();
	protected Tax tax;
	
	public Tax(Tax tax) {
		this.tax = tax;
	}
	
	public abstract BigDecimal getTax(Product product);
}
