import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class SuperMarketTest {
	
	private SuperMarket superMarket;
	
	@Before
	public void setup() {
		this.superMarket = new SuperMarket();
	}
	
	@Test
	public void givenListOfItemsCalculateBill() {
		ShoppingCart cart = superMarket.getEmptyCart();
		cart.addToCart(1, Imported.LOCAL, "book", Category.BOOK, 12.49);
		cart.addToCart(1, Imported.LOCAL, "music CD", Category.OTHERS, 14.99);
		cart.addToCart(1, Imported.LOCAL, "chocolate bar", Category.FOOD, 0.85);
		superMarket.calculateBill(cart);
		
		Assert.assertEquals(1.5f, superMarket.getSalesTax(cart));
		Assert.assertEquals(29.85f, superMarket.getTotalCost(cart));
	}
	
	@Test
	public void givenImportedGoodsCalculateBill() {
		ShoppingCart cart = superMarket.getEmptyCart();
		cart.addToCart(1, Imported.IMPORTED, "box of chocolates", Category.FOOD, 10.00);
		cart.addToCart(1, Imported.IMPORTED, "bottle of perfume", Category.OTHERS, 47.50);
		superMarket.calculateBill(cart);
		
		Assert.assertEquals(7.65f, superMarket.getSalesTax(cart));
		Assert.assertEquals(65.15f, superMarket.getTotalCost(cart));
	}
	
	@Test
	public void givenMixedGoodsCalculateBill() {
		ShoppingCart cart = superMarket.getEmptyCart();
		cart.addToCart(1, Imported.IMPORTED, " bottle of perfume", Category.OTHERS, 27.99);
		cart.addToCart(1, Imported.LOCAL, "bottle of perfume", Category.OTHERS, 18.99f);
		cart.addToCart(1, Imported.LOCAL, "packet of headache", Category.MEDICAL_PRODUCTS, 9.75);
		cart.addToCart(1, Imported.IMPORTED, "box of chocolates", Category.FOOD, 11.25);
		superMarket.calculateBill(cart);
		
		Assert.assertEquals(6.70f, superMarket.getSalesTax(cart));
		Assert.assertEquals(74.700005f, superMarket.getTotalCost(cart));
	}
}
