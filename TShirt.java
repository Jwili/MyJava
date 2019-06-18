package shopping.cart;

public class TShirt extends Product {
	
	
	public TShirt(String name, String size) {
		super(name, size);
	}
	
	@Override
	protected double getPrice() {
		return this.getDefaultPrice();
	}

}
