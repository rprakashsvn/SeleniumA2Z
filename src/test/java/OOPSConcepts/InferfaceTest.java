package OOPSConcepts;

public class InferfaceTest implements InterfaceDemo {

	@Override
	public void Test1() {
		// TODO Auto-generated method stub
		System.out.println("Test Method 1 Implements From Interface");
	}

	@Override
	public void Test2() {
		// TODO Auto-generated method stub
		System.out.println("Test Method 2 Implements From Interface");
	}

	@Override
	public void Test3() {
		// TODO Auto-generated method stub
		System.out.println("Test Method 3 Implements From Interface");
	}

	public static void main(String args[]) {
		InferfaceTest testing = new InferfaceTest();
		testing.Test1();
		testing.Test2();
		testing.Test3();
	}
}