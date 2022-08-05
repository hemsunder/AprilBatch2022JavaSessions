package inheritanceSuperMethod;

public class MiddleClassFamily extends RichFamily{
	
	int carscount = 1;
	
	public MiddleClassFamily() {
		/*super();  Here super() will be exists by default. Even though you don't write super(), java calls super class/parent class 
		default constructor by own. But here instead of super() if you write parameterized super then parameterized constructor will be 
		called*/
		super(10, 3.5);
		System.out.println("Car count of the middle class family is "+carscount);
	}
	
	public void ownHouse() {
		System.out.println("Middle class family have only one Individual house");
	}
}
