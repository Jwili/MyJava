package shopping.cart;

public class App {
	public static void main(String[] args) {

		Cart cart = new Cart();
		
		TShirt tshirt1 = new TShirt("whiteTshirt", "S");
		TShirt tshirt2 = new TShirt("blueTshirt", "L");
		Golfer golfer1 = new Golfer("golfer", "M");
		Jeans jean1 = new Jeans("jean", "M");
		FormalPants pants1 = new FormalPants("pants1", "L");
		
		cart.addProduct(tshirt1);
		cart.addProduct(tshirt2);
		cart.addProduct(golfer1);
		cart.addProduct(jean1);
		cart.addProduct(pants1);
		
		System.out.println("SHOPPING CART TOTAL : R"+cart.calculateTotal());
	}
}
