package JavaConcepts;

interface Movable1 {
	boolean isMovable();
}

interface Rollable1 {
	boolean isRollable();
}

class BaseClass {
	void baseMethod() {
		System.out.println("Base Test Class Method");
	}
}

public class InterfaceDemo1 extends BaseClass implements Movable, Rollable {

	public static void main(String[] args) {
		InterfaceDemo1 demo = new InterfaceDemo1();
		System.out.println(demo.isMovable());
		demo.baseMethod();
		System.out.println(demo.isRollable());
	}

	@Override
	public boolean isRollable() {
		return true;
	}

	@Override
	public boolean isMovable() {
		return true;
	}
}