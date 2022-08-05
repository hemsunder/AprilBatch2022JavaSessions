package inheritanceSuperMethod;

public class RichFamily {
	
	int carscount;
	double propvalue;
	
	public RichFamily() {
		carscount = 10;
		System.out.println(carscount);
	}
	
	public RichFamily(int carscount, double propvalue) {
		this.carscount = carscount;
		this.propvalue = propvalue;
		System.out.println("carscount is "+carscount+" "+"property value of the Rich family is in billions dollars "+propvalue);
	}
	
	public RichFamily(double propvalue) {
		this.propvalue = propvalue;
		System.out.println("property value of the Rich family is in billions dollars"+propvalue);
	}
	
	public void familymembers() {
		System.out.println("Each one of the Family member does have independent home");
	}
	
	public void lands() {
		System.out.println("Each one of the Family member does have acres of land");
	}
}
