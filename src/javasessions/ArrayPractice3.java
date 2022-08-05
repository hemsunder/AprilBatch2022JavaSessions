package javasessions;

import java.util.ArrayList;

public class ArrayPractice3 {
	
	public ArrayList<String> getMenuLinks(String Screenname) {
		System.out.println("Screen name is "+Screenname);
		
		ArrayList<String> links = new ArrayList<String>();
		
		if(Screenname.equals("loginpage")) {
			links.add("login link");
			links.add("signup link");
			links.add("privacy link");
			links.add("forgot password link");
		}
		
		else if(Screenname.equals("homepage")) {
			links.add("cart link");
			links.add("search link");
			links.add("signout link");
		}
		else {
			System.out.println("no links found or screen name is not valid. please enter valid screen name");
		}
		
		return links;
	}
	
	

	public static void main(String[] args) {
		ArrayPractice3 ap = new ArrayPractice3();
		ArrayList<String> linknames = ap.getMenuLinks("cartpage");
		System.out.println(linknames);
		
	}

}
