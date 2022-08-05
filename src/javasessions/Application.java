package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

			// WAF: this will return menu links on the page
			// param: page name
			// return: ArrayList<String>

			public ArrayList<String> getPageMenuLinks(String pageName) {
				System.out.println("page name is : " + pageName);

				ArrayList<String> menuList = new ArrayList<String>();

				if (pageName.trim().equalsIgnoreCase("loginpage")) {
					menuList.add("product");
					menuList.add("category");
					menuList.add("price");
				} else if (pageName.trim().equalsIgnoreCase("homepage")) {
					menuList.add("product");
					menuList.add("category");
					menuList.add("price");
					menuList.add("search");
					menuList.add("cart");
				} else if (pageName.trim().equalsIgnoreCase("productpage")) {
					menuList.add("product");
					menuList.add("category");
					menuList.add("price");
					menuList.add("info");
					menuList.add("seller");
				} else {
					System.out.println("please pass the right page name...." + pageName);
				}

				return menuList;
			}
			
			
			//WAF: name: getEmpDevicesList()
			//return the list of devices -- static String [] array
			//param: empName -- String
			public String[] getEmpDevicesList(String empName) {
				System.out.println("welcome to IT team....emp name is : " + empName);
				
				String devices[] = new String[5];
				//String devices[] = null;
				
				empName = empName.toLowerCase();//sachin
				if(empName.equals("sachin")) {
					devices[0] = "iPhonex";
					devices[1] = "Macbook pro";
					devices[2] = "Airtel SIM";
				}
				else if(empName.equals("ravi")) {
					devices[0] = "iPhone12";
					devices[1] = "Macbook Air";
					devices[2] = "Airtel SIM";
					devices[3] = "Lenovo Windows";

				}
				else if(empName.equals("archana")) {
					devices[0] = "iPhone13";
					devices[1] = "Macbook Pro";
					devices[2] = "HP Windows";
					devices[3] = "Keyboard";
					devices[4] = "Mouse";
				}
				else {
					System.out.println("emp name is not found..." + empName);
				}
				
				return devices;
			}
			
			
			public static void main(String[] args) {

				Application app = new Application();
				ArrayList<String> loginList = app.getPageMenuLinks("cartpage");
				System.out.println(loginList);
				
				String emp_devices[] = app.getEmpDevicesList("naveen");
				System.out.println(Arrays.toString(emp_devices));

	}

}
