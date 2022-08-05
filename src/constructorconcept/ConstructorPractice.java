package constructorconcept;

import java.util.ArrayList;

public class ConstructorPractice {
	
	String name;
	int id;
	double salary;
	ArrayList<String> ar;
	ArrayList<Integer> ar1;
	
	public ConstructorPractice(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public ConstructorPractice(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}

	public ConstructorPractice(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public ConstructorPractice(String name, int id, double salary, ArrayList<String> ar, ArrayList<Integer> ar1) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.ar = ar;
		this.ar1 = ar1;
	}

	public static void main(String[] args) {
	
		ConstructorPractice cp = new ConstructorPractice("vijay", 100, 25.5);
		System.out.println(cp.name+" "+cp.id+" "+cp.salary); //vijay 100 25.5
		
		cp.name = "Sravan";
		cp.id = 101;
		cp.salary = 5.5; //we can update the values even after assigning
		
		System.out.println(cp.name+" "+cp.id+" "+cp.salary);//Sravan 101 5.5
	
	
		ConstructorPractice cp1 = new ConstructorPractice("Kirani", 130, 8.2); /*we can pass different inputs for 
		new object reference*/
		System.out.println(cp1.name+" "+cp1.id+" "+cp1.salary);//Kirani 130 8.2
		
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ConstructorPractice cp2 = new ConstructorPractice("hemanth", 106, 15.6, ar, ar1);
		System.out.println(cp.name+" "+cp.id+" "+cp.salary+" "+cp2.ar+" "+cp2.ar1);
		
		ArrayList<String> arr = new ArrayList<String>();
		ConstructorPractice cp3 = new ConstructorPractice(143, arr);
		System.out.println(cp3.id+" "+cp3.ar+" "+cp3.ar1+" "+cp3.name); //try to understand this line in deep
		
	}

	public ConstructorPractice(int id, ArrayList<String> arr) {
		this.id = id;
		this.ar = arr;
		this.name = "Aman";
	}
}
