package inheritancePractice;

public class TestClass {

	public static void main(String[] args) {

		
		Collage col = new Collage();
		col.teaching();//overridden
		col.exams();//inherited
		col.games();//individual
		Collage.staff();// as staff method is static we have to call the method in static way
		//Collage.staff(); output will be: staff method from Collage will be executed
		
		System.out.println("================");
		
		School sc = new School();
		sc.teaching();
		sc.exams();
		School.staff();// as staff method is static we have to call the method in static way
		/*School.staff(); output will be: staff method from School will be executed, even though staff method is available 
		in College Class*/
		sc.playgames();
		/*sc.events(); //this will never happen, as events is a private method, we can not inherit or access the private method in
		another class. Hence compiler never give the suggestion to write sc.events(); but still if you write forcefully, java gives 
		error like "Unresolved compilation problems"*/
	}

}
