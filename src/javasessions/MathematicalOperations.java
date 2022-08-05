package javasessions;

public class MathematicalOperations {

	public static void main(String[] args) {
		
		System.out.println(9/3);//3
		System.out.println(9/2);//4
		System.out.println(9.0/2);//4.5
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2.0);//4.5
		
		System.out.println(0/100);//0
		//System.out.println(9/0);//AE
		//number/0 = AE, number could be 1,100,500 or 0
		//System.out.println(0/0);//AE
		System.out.println(9.0/0);//Infinity
		System.out.println(9/0.0);//Infinity
		
		System.out.println(0.0/0.0);//NaN
		System.out.println(0.0/0);//NaN
		System.out.println(0/0.0);//NaN
		
		System.out.println(9 % 2); //1
		System.out.println(10 % 2); //0
		System.out.println(100 % 3); //1
		
		System.out.println('a'/97); //1 as the ASCII value of a is 97
		System.out.println('b' - 'a'); // 98-97=1
		System.out.println('b' / 'a'); //98/97=1
		System.out.println('b' * 'a'); // 98*97=9506
		
		System.out.println("hello" + "testing"); //hellotesting
		
		System.out.println("hello" + 12.33 + 30 + 12.33 + 'a' + 'b'+ 100); //hello12.333012.33ab100
		System.out.println(12.33 + 30 + 12.33 + 'a' + 'b'+ 100); //349.65999999999997
	}

}
