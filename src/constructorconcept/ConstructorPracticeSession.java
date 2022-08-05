package constructorconcept;

public class ConstructorPracticeSession {
	
	String name;
	int id;
	double salary;
	String ceo;
	
	public ConstructorPracticeSession() {
		this.name = "hemsunder";
		this.id = 143;
		this.salary = 10.2;
		this.ceo = "Neel";
	}
	
	public ConstructorPracticeSession(String name) {
		this.name = name;
		this.id = 121;
		this.salary = 18;
		this.ceo = "SSR";
		
	}


	public static void main(String[] args) {
		
		ConstructorPracticeSession cp = new ConstructorPracticeSession();
		System.out.println(cp.name+" "+cp.id+" "+cp.salary+" "+cp.ceo);
		
		ConstructorPracticeSession cp1 = new ConstructorPracticeSession("sripal");
		System.out.println(cp1.name+" "+cp1.id+" "+cp1.salary+" "+cp1.ceo);
		
		
		
		
		
		
	}

}
