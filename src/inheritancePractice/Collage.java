package inheritancePractice;

public class Collage extends School{
	
	public void games() {
		System.out.println("Games will be conducted in the collage");
	}
	
	@Override
	public void teaching() {
		System.out.println("Collage teaching is good");
	}
	
	//Method hiding. Here we can not write @Override because we can not override static method
	public static void staff() {
		System.out.println("Excellent staff is there in the Collage");
	}
	
	/*we can not over ride the final method of parent class in child class with private/public access modifier. Compiler gives error  
	final void playgames() {
		System.out.println("School allows children to play games in leaser time");
	}
	*/

}
