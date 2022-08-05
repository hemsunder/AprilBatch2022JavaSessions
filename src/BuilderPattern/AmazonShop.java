package BuilderPattern;

public class AmazonShop {

	public AmazonShop login() {
		System.out.println("Login completed");
		return this; 	/*Here instead of 'this', we can also write like return new AmazonShop(); but if we write 
		like this for below methods also, in every method a new object of the current class will be created. 
		Which means for every method a new object will be created and memory will be suffocated. 
		To avoid this we use this keyword here in all methods so that all methods will be point to one object 
		only. This will help in main method to achieve the builder pattern. */
	}
	
	public AmazonShop login(String un, String pwd) {
		System.out.println("Enter username "+un+"Enter password "+pwd);
		return this;
	}
	
	public AmazonShop searchProduct() {
		System.out.println("Search all products");
		return this;
	}
	
	public AmazonShop searchProduct(String productName) {
		System.out.println("Search for product name "+productName);
		return this;
	}
	
	public AmazonShop searchProduct(String productName, String color) {
		System.out.println("Search for product name "+productName+"with color "+color);
		return this;
	}
	
	public AmazonShop searchProduct(String productName, String color, int price) {
		System.out.println("Search for product name "+productName+"with color "+color+"price is "+price);
		return this;
	}
	
	public AmazonShop addToCart() {
		System.out.println("Product is added to cart");
		return this;
	}
	
	public AmazonShop doPayment() {
		System.out.println("Payment is done by COD by default");
		return this;
	}
	
	public AmazonShop doPayment(String cNum) {
		System.out.println("Payment is done by Credit card "+cNum);
		return this;
	}
	
	public AmazonShop doPayment(String cNum, int cvv) {
		System.out.println("Payment is done by Credit card "+cNum+"cvv num is "+cvv);
		return this;
	}
	
	public AmazonShop generateOrderID() {
		System.out.println("Order ID is generated successfully");
		return this;
	}
	
	public AmazonShop doLogout() {
		System.out.println("User is logged out successfully");
		return this;
	}

}
