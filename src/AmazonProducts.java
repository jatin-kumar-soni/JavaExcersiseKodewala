
public class AmazonProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1= new Product("P101", "Wireless Mouse", 799, 20);
		System.out.println("Before sale\n");
		p1.details();
		p1.addStockQuantity(10);
		p1.sellProduct(30);
		System.out.println("\nAfter sale\n");
		p1.details();

	}

}


