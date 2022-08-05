package OOP_Encapsulation;

public class TestUser {

	public static void main(String[] args) {

				//Create: POST
				User u1 = new User("Nikita", 25, true); /*constructor works like setters. 
				 Q: When we have a constructor to pass the data then why setters required?
				 because constructor can provide the data at one time so to update the data provided in the constructor, 
				 setters are required*/
				
				//Retrieve: GET
				System.out.println(u1.getName());
				System.out.println(u1.getAge());
				System.out.println(u1.isActive());
				/*From the above constructor we have passed the data so that these getters are giving the data. So far we have not
				 *used setters.
				 *To update the data, we need setters so it must be a good practice that we have to create the Constructor along 
				 *with setters. */
				
				System.out.println("-------");
				//update: PUT/PATCH
				u1.setActive(false); // Here we are updating the value of 'setActive 'from the setter
				System.out.println(u1.getName());
				System.out.println(u1.getAge());
				System.out.println(u1.isActive());
				
				u1.setName("Nikita Kapoor"); //Again we are updating the value of 'setName'
				u1.setActive(true); //Again we are updating the value of 'setActive'
				System.out.println("-------");

				System.out.println(u1.getName());
				System.out.println(u1.getAge());
				System.out.println(u1.isActive());
				
				//The below code is belongs to another class
				Login l1 = new Login("naveen", "naveen123");
				System.out.println(l1.getUsername() +" :" + l1.getPassword()); //naveen :naveen123
				
				Login l2 = new Login("nikita", "nikita123");
				l2.setPassword("nikita4567");
				
				System.out.println(l1.getUsername() +" :" + l1.getPassword()); //naveen :naveen123
				System.out.println(l2.getUsername() +" :" + l2.getPassword()); //nikita :nikita4567
	}

}
