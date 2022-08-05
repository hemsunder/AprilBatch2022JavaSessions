package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();// overridden
		b.stop();// inherited
		b.refuel();// inherited
		b.autoParking();// individual
		b.engine();//BMW -- engine
		System.out.println(b.speed);//200
		BMW.run();//BMW -- run
		b.aeroDynamic();//BMW -- aeroDynamic

		System.out.println("-----");

		Car c = new Car();//100
		c.start();//Car -- start
		c.stop();//Car -- stop
		c.refuel();//Car -- refuel
		c.engine();//Vehicle -- engine
		Car.run();//Car -- run
		c.aeroDynamic();//Car -- aeroDynamic

		System.out.println("-----");
		Audi a = new Audi();
		a.theftSafety();
		a.start();
		a.stop();
		a.refuel();
		a.engine();//inherited from grand parent

		System.out.println("----------");
		Automobile au = new Automobile();
		au.aeroDynamic();

		System.out.println("-----");
		Truck t = new Truck();
		t.heavyLoading();

		System.out.println("-----");

		// Top casting
		Car c1 = new BMW();// child class object can be referred by parent class ref variable
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		System.out.println("----c1.run----");
		c1.run();

		System.out.println("-----");
		
		Vehicle c2 = new BMW();// child class object can be referred by Grand parent class ref variable
		Automobile c3 = new BMW();
		
		c2.aeroDynamic();
		c2.engine();

		// down casting: at RunTime -- it will throw ClassCastException
		 //BMW b1 = (BMW) new Car();
		// BMW b2 = (BMW) new Vehicle();
	}

}
