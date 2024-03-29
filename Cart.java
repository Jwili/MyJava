package shopping.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	List<Product> products = new ArrayList<Product>();

	public Cart() {
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void removeProduct(Product product) {
		products.remove(product);
	}

	public double calculateTotal() {
		double total = 0;
		for (Product product : products) {
			total += product.getPrice();
		}
		return total;
	}
}
