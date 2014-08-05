import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> items;
	
	public ShoppingCart(){
		this.items = new ArrayList<Product>();
	}
	
	public void addToCart(int count, Imported imported, String name, Category category, double price) {
		items.add(new Product(count, imported, name, category, new BigDecimal(price)));
	}
	
	public List<Product> getItems() {
		return this.items;
	}

	public double getTotalCost() {
		BigDecimal totalCost = new BigDecimal(0);
		for (Product item : items) {
			totalCost = totalCost.add(item.getCost()).add(item.getTax());
		}
		return totalCost.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}


	public double getTax() {
		BigDecimal totalTax = new BigDecimal(0);
		for (Product item : items) {
			totalTax = totalTax.add(item.getTax());
		}
		return totalTax.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
