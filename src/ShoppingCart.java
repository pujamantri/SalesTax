import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> items;
	private float totalCost;
	private float tax;
	
	public ShoppingCart(){
		this.items = new ArrayList<Product>();
		this.totalCost = 0;
		this.tax = 0;
	}
	
	public void addToCart(int count, Imported imported, String name, Category category, double price) {
		items.add(new Product(count, imported, name, category, price));
	}
	
	public List<Product> getItems() {
		return this.items;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	
	public float getTotalCost() {
		return totalCost;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}
}
