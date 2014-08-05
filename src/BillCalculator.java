import java.math.BigDecimal;
import java.util.List;

public class BillCalculator {
	private Tax tax = new ImportDuty(new SalesTax());
	private static BigDecimal HUNDRED = new BigDecimal(100);
	
	public void caclculateBill(ShoppingCart cart) {
		List<Product> items = cart.getItems();
	
		for (Product eachItem : items) {
			eachItem.setCost(eachItem.getPrice().multiply(new BigDecimal(eachItem.getQuantity())).setScale(2, BigDecimal.ROUND_HALF_UP));
			eachItem.setTax(tax.getTax(eachItem).multiply(eachItem.getCost()).divide(HUNDRED).setScale(2, BigDecimal.ROUND_HALF_UP));
		}
	}
	
}
