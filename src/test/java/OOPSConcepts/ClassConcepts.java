package OOPSConcepts;

public class ClassConcepts {

	static String name = "Pandian";
	static int empID = 485;
	static String office = "Msc Shipping Company";

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {

		ClassConcepts obj1 = new ClassConcepts();
		System.out.println(obj1.name + " " + obj1.empID + " " + obj1.office);

	}
}
