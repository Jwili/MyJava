package shopping.cart;

public class Jeans extends Product {
	
	public Jeans(String name, String size) {
		super(name, size);
	}
	
	@Override
	protected double getPrice() {
		return this.getDefaultPrice();
	}
}
