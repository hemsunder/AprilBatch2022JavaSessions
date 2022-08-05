package OOP_Encapsulation;

public class TestEncapsulationPractice {

	public static void main(String[] args) {

		EncapsulationPractice encap = new EncapsulationPractice();
		encap.setUsername("hemsunder");
		encap.setAddress("hyd");
		encap.setAge(28);
		encap.setCountry("India");
		
		System.out.println(encap.getUsername()+" "+encap.getAge()+" "+encap.getAddress()+" "+encap.getCountry());
		
		//to update the data also we use setters
		encap.setUsername("srujana");
		encap.setAddress("safilguda");
		encap.setAge(24);
		encap.setCountry("India");
		System.out.println(encap.getUsername()+" "+encap.getAge()+" "+encap.getAddress()+" "+encap.getCountry());

	}

}
