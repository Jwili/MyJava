package shopping.cart;

public class FormalPants extends Product {

	public FormalPants(String name, String size) {
		super(name, size);
	}

	@Override
	protected double getPrice() {
		return this.getDefaultPrice() + 30;
	}
}
