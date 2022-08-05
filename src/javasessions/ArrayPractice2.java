package javasessions;

import java.util.Arrays;

public class ArrayPractice2 {
	

	public String[] getKidNames(String mothername) {
		System.out.println("The Mother name is "+mothername);
		
		String names[] = null;
		if(mothername.equals("srujana")) {
			//names = {"chintu, bantu, bittu"};		
		}
		
		else if(mothername.equals("chinni")) {
			//names = {"harshini, madhuri"};		
		}
		
		else {
			System.out.println("Mother name is invalid");
		}
		return names;
		
	}
	
	

	public static void main(String[] args) {
		ArrayPractice2 ap = new ArrayPractice2();
		String name[] = ap.getKidNames("srujana");
		System.out.println(Arrays.toString(name));
	}

}
