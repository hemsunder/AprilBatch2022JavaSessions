package OOP_Encapsulation;

public class TestEncapsulationConstructor {

	public static void main(String[] args) {

		EncapsulationConstructor en = new EncapsulationConstructor("Subhash", 25); /*Here instead of setters with the help of 
		constructor we have assigned the data*/
		
		System.out.println(en.getName()+" "+en.getAge());//Subhash 25
		
		//Now we will update the data with setters
		en.setName("Akash");
		en.setAge(26);
		System.out.println(en.getName()+" "+en.getAge());//Akash 26

		
		
	}

}
