package OOPSConcepts;

public class CarClass extends AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarClass object = new CarClass();
		object.Method1();
		object.Method2();
		object.Method3();
		object.changeCarGear();
		object.changeBikeGear();
	}

	@Override
	public void Method1() {
		// TODO Auto-generated method stub
		System.out.println("Car Petrol Checked");
	}

	@Override
	public void Method2() {
		// TODO Auto-generated method stub
		System.out.println("Car Started");
	}

	@Override
	public void Method3() {
		// TODO Auto-generated method stub
		System.out.println("Car Running");
	}

}
