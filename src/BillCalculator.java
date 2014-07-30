import java.util.List;


public class BillCalculator {
	private Tax tax = new ImportDuty(new SalesTax());
	
	public void caclculateBill(ShoppingCart cart) {
		List<Product> items = cart.getItems();
		float totalTax = 0;
		float totalBill = 0;
		for (Product eachItem : items) {
			double taxAmount = tax.getTax(eachItem);
			double price = Math.ceil(eachItem.getPrice() * eachItem.getQuantity() * 20) / 20;
			double tax = Math.ceil(taxAmount * price * 20/ 100) / 20;
			totalTax += tax;
			totalBill += price + tax;
		}
		
		cart.setTax(totalTax);
		cart.setTotalCost(totalBill);
	}
	
}
