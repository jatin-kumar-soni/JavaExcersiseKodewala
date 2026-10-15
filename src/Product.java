
public class Product {
	private String productId, productName;
	private int price,  stockQuantity;
	public Product(String productId, String productName, int price, int stockQuantity) {
		
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void addStockQuantity(int stockQuantity) {
		this.stockQuantity += stockQuantity;
		System.out.println("Stock added");
	}
	void sellProduct(int quantity)
	{
		if(quantity<=this.getStockQuantity())
		{
			this.stockQuantity -= quantity;
			System.out.println("Product sell successfully with quantity : "+quantity);
		}
		else {
		
				System.out.println("only "+(this.getStockQuantity())+" is left\n\t wait till stock will come and meet your requirement");
				
		
		}
	}
	void details()
	{
		System.out.println("Product ID  : "+this.productId);
		System.out.println("Product Name: "+this.productName);
		System.out.println("Price		: "+this.price);
		System.out.println("Product Stock: "+this.getStockQuantity());
		if(this.getStockQuantity() == 0)
		{
			System.out.println(this.getProductName()+" is out of stock");
			return;
		}
	}
	
	

}
