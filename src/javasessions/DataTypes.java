package javasessions;

public class DataTypes {

	public static void main(String[] args) {

		//1. byte:
		//size:1 byte(8 bits)
		
		byte b1=10;
		byte b2=20;
		System.out.println(b1+b2);
		
		//2. short:
		//size:2 bytes(16 bits)
		
		short s1=1500;
		short s2=20000;
		System.out.println(s1+s2);
		
		//3. int:
		//size: 4 bytes(32 bits)
		
		int i1=123456;
		int i2=321654987;
		System.out.println(i1+i2);
		
		//4. long:
		//size: 8 bytes(64 bits)
		
		long l1 = 123456789123456l;
		long l2 = 321654987321l;
		System.out.println(l1+l2);
		
		//5. float:
		//size: 4 bytes(32 bits)
		
		float f1 = 123.654987f;
		
		//6. double:
		//size: 8 bytes(64 bits)
		
		double d1 = 654.321654987654321;
		
		//7. char:
		//size: 2 bytes	(16 bits)
		
		char c1 = '1';
		char c2 = 'a';
		char c3 = '$';
		char c4 = 'b';
		System.out.println("characters value " +(c2+c4));
		//in the above print statement, it will take the ASCII values and add and then prints the result
		
		
		//8. bool:
		//size: 1bit
		
		boolean flag = true;
		flag=false;
		System.out.println(flag);
		
	}

}
