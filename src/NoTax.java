
public class NoTax extends Tax {
	public NoTax() {
		super(NOTAX);
	}
	@Override
	public double getTax(Product product) {		
		return 0;
	}

}
