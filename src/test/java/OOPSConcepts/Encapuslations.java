package OOPSConcepts;

class Encaps {
	private String name;
	private String office;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setoffice(String office) {
		this.office = office;
	}

	public String getoffice() {
		return office;
	}
}

public class Encapuslations {

	public static void main(String[] args) {

		Encaps encapsTest = new Encaps();
		encapsTest.setName("Prakash");
		encapsTest.setoffice("Msc Technology India Pvt Ltd");
		System.out.println("Name Of the Employee : " + encapsTest.getName());
		System.out.println("Name Of the Office   : " + encapsTest.getoffice());
	}

}
