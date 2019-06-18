package shopping.cart;

public abstract class Product {

	private String name;
	private String size;

	public Product(String name, String size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	protected abstract double getPrice();

	protected double getDefaultPrice() {
		if (this.getSize().equals("S"))
			return 10.0;
		else if (this.getSize().equals("M"))
			return 20.0;
		return 30.0;
	}
}
