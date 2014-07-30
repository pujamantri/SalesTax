
public class Product {
	private String name;
	private int quantity;
	private Imported imported;
	private Category category;
	private double price;
	
	public Product(int quantity,Imported imported, String name, Category category, double price) {
		this.quantity = quantity;
		this.imported = imported;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public Imported getImported() {
		return imported;
	}
	public Category getCategory() {
		return category;
	}
	public double getPrice() {
		return price;
	}
}
