package inheritancePractice;

public class School {
	
	public void teaching() {
		System.out.println("Teaching is good in the school");
	}
	
	public void exams() {
		System.out.println("Exams will be conducted strictly in the school");
	}
	
	public static void staff() {
		System.out.println("Excellent staff is there in the school");
	}
	
	final void playgames() {
		System.out.println("School allows children to play games in leaser time");
	}
	
	/*Java gives a warning "The method events() from the type School is never used locally". 
	because this private method can not be inherit in child class and test class as well. Still we write a private method in
	parent class that will never used*/
	private void events() {
		System.out.println("School performs events");
	}

}
