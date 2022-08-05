package inheritanceSuperMethod;

public class TestFamily {

	public static void main(String[] args) {

		MiddleClassFamily mc = new MiddleClassFamily();/*Once you create the object of the class, constructor will be called.
		Hence constructor of MiddleClassFamily will be called.*/
		mc.ownHouse();
		mc.familymembers();
		mc.lands();
	}
}
