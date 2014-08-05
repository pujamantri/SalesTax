import java.math.BigDecimal;

public class NoTax extends Tax {
	public NoTax() {
		super(NOTAX);
	}
	@Override
	public BigDecimal getTax(Product product) {		
		return new BigDecimal(0);
	}

}
