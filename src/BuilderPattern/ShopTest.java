package BuilderPattern;

public class ShopTest {

	public static void main(String[] args) {

		AmazonShop asp = new AmazonShop();
		
		//1
		asp.login().searchProduct().addToCart().doPayment().generateOrderID().doLogout();
		
		//2
		asp.login("hemsundergoud@gmail.com", "hem@123")
			.searchProduct("Iphone13")
				.addToCart()
					.doPayment("123456789123", 231)
						.generateOrderID()
							.doLogout();
		
		//3
		asp.login("hemsundergoud@gmail.com", "hem@123")
			.searchProduct("macbook", "red", 35000)
				.addToCart()
					.doLogout();
		
		//4
		asp.login("hemsundergoud@gmail.com", "hem@123")
			.doPayment()
				.generateOrderID()
					.doLogout();
		//5
		asp.login("hemsundergoud@gmail.com", "hem@123");
		
		//6
		asp.login()
			.searchProduct("Lenovo", "cream")
				.addToCart()
					.doPayment("123456987456")
						.generateOrderID()
							.doLogout();
		
		
	}

}
