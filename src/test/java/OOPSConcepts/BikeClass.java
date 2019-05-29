package OOPSConcepts;

public class BikeClass extends AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeClass object = new BikeClass();
		object.Method1();
		object.Method2();
		object.Method3();
		object.changeBikeGear();
	}

	@Override
	public void Method1() {
		// TODO Auto-generated method stub
		System.out.println("Bike Petrol Checked");
	}

	@Override
	public void Method2() {
		// TODO Auto-generated method stub
		System.out.println("Bike Started");
	}

	@Override
	public void Method3() {
		// TODO Auto-generated method stub
		System.out.println("Bike Running");
	}

}
