package OOP_Abstract;

public class LoginPage extends Page {
	
	static int price = 20;

	public LoginPage() {
		System.out.println("Login Page ....const....");
	}

	@Override
	public void title() {
		System.out.println("Login page -- title");
	}

	@Override
	public void url() {
		System.out.println("Login page -- url");
	}

	@Override
	public void header() {
		System.out.println("Login page -- header");
	}

	@Override
	public void loadingPage() {
		System.out.println("Login page -- loading..." + 10);
	}

	public void doLogin(String un, String pwd) {
		System.out.println("login with : " + un + ":" + pwd);
	}
	
	/* @Override we can not override the final method
	 * public final void logo() { System.out.println("Page -- logo"); }
	 */

	//Method hiding will happen when you try to override static method
	public static void footer() {
		System.out.println("LoginPage -- footers..");
	}

}
