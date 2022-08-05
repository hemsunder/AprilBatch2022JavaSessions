package OOP_Interface;

public interface UKMedical extends WHO{

	public void dentalServices();
	public void entServices();
	public void emergencyServices();
	
	default void medicalDevelopment() {
		System.out.println("UK -- medicalDevelopment");
	}
	
	public static void billing() {
		System.out.println("UK Medical -- billing");
	}
}
