public class SuperMarket {
	private BillCalculator billCalculator;
	
	public SuperMarket() {
		this.billCalculator = new BillCalculator();
	}
	
	public ShoppingCart getEmptyCart() {
		return new ShoppingCart();
	}
	
	public void calculateBill(ShoppingCart cart) {
		billCalculator.caclculateBill(cart);
	}
	
	public double getSalesTax(ShoppingCart cart) {
		return cart.getTax();
	}
	
	public double getTotalCost(ShoppingCart cart) {
		return cart.getTotalCost();
	}
}
