import java.math.BigDecimal;

public class Product {
	private String name;
	private int quantity;
	private Imported imported;
	private Category category;
	private BigDecimal price;
	private BigDecimal cost;
	private BigDecimal tax;
	
	public Product(int quantity,Imported imported, String name, Category category, BigDecimal price) {
		this.quantity = quantity;
		this.imported = imported;
		this.name = name;
		this.category = category;
		this.price = price;
		this.cost = new BigDecimal(0);
		this.tax = new BigDecimal(0);
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
	
	public BigDecimal getPrice() {
		return price;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
}
