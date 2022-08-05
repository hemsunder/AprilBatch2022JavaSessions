package OOP_Interface;

public interface USMedical extends WHO{
	
	int min_fee = 10;
	//variables are static and final by default
	// can not have any method body
	// no method body --> Abstract method
	// only method prototype --only method declaration
	// can not have method business logic
	// can not create the object of interface in java
	// Interface can not have constructor

	public void cardioServices();
	public void cardioServices(int a); //method overloading
	public void neuroServices();
	public void physioServices();
	public void emergencyServices();
	
	@Override
	public void covid19Vaccination();

	// after jdk 1.8: two major changes:
	// 1. can have static method with method body:
	public static void billing() {
		System.out.println("US Medical -- billing");
	}
	
	//2. can have default method with method body:
	default void medicalDevelopment() {
		System.out.println("US -- medicalDevelopment");
	}
}
