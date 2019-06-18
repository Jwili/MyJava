package shopping.cart;

public class Golfer extends Product {

	public Golfer(String name, String size) {
		super(name, size);
	}

	@Override
	protected double getPrice() {
		return this.getDefaultPrice() * 2;
	}
}
