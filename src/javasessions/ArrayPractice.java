package javasessions;

import java.util.Arrays;

public class ArrayPractice {
	
	//WAF: Accept father name and returns kids names
	
	public String[] getKidsNames(String fathername) {
		
		System.out.println("The father name is "+fathername);
		String kids[] = new String[3];
		
		fathername = fathername.trim().toLowerCase();
		
		if(fathername.equals("ravi")) {
			kids[0] = "Nithin";
			kids[1] = "lahari";
			kids[2] = "ram";
		}
		
		else if(fathername.equals("kishore")) {
			kids[0] = "Ashok";
			kids[1] = "Geetha";
		}
		
		else if(fathername.equals("shanker")) {
			kids[0] = "Chitra";
			kids[1] = "Madhu";
		}
		
		else {
			System.out.println("Please give the correct father name");
		}
		
		return kids;
		
	}
	
	
	
	

	public static void main(String[] args) {
		ArrayPractice ap = new ArrayPractice();
		String kidnames[] = ap.getKidsNames("shanker");
		System.out.println(Arrays.toString(kidnames));
		
	}

}
