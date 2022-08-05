package constructorconcept;

public class User {

	String id;
	String name;
	int age;
	boolean isActive;

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public User(String id, String name, boolean isActive) {
		this.id = id;
		this.name = name;
		this.isActive = isActive;
	}

	public User(String id, boolean isActive) {
		this.id = id;
		this.isActive = isActive;
	}

	public User(String id, String name, int age, boolean isActive) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.isActive = isActive;
	}

	public static void main(String[] args) {

		/*Here we did not create a default constructor hence we can not create a object like
		User user = new User(); it will throw compile error.*/
		User u1 = new User("101", "Tom");
		User u2 = new User("102", "Peter", 25);
		User u3 = new User("103", "Naveen", true);
		User u4 = new User("104", "Ravi", 20, false);
		
		System.out.println(u1.id+" "+u1.age+" "+u1.name+" "+u1.isActive);
		System.out.println(u2.id+" "+u2.age+" "+u2.name+" "+u2.isActive);
		System.out.println(u3.id+" "+u3.age+" "+u3.name+" "+u3.isActive);
		System.out.println(u4.id+" "+u4.age+" "+u4.name+" "+u4.isActive);

	}

}
