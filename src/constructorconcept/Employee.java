package constructorconcept;

public class Employee {

	//class variables
		String name;
		int age;
		double salary;
		boolean isPerm;
		
		//constructor of the class
		//constructor name will be same as the class name
		//constructor looks like a function but not a function
		//constructor can not return any value, there is no return type
		//constructor will be called when you create the object of the class
		//constructor can be overloaded
		//constructor is used to initialize the class variables
		//constructor is used to create the object on the basis of given parameters
		//constructor is helping to prevent of creating unnecessary object
		
		
//		public Employee() {//0 parameter - default constructor
//			System.out.println("default constructor");
//		}
	//	
//		public Employee(int i) {//1 parameter
//			System.out.println("1 parameter constructor" + i);
//		}
	//	
//		public Employee(int i, String p) {//2 parameters
//			System.out.println("2 parameters constructor" + i + p);
//		}
		
		public Employee(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public static void main(String[] args) {

			Employee e1 = new Employee("Neel", 25); /*these arguments will be assigned to respective constructor parameters. In this 
			way class variables will be assigned with data from the object in the main class*/
			System.out.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.isPerm);

	}

}
