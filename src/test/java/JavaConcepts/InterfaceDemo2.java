package JavaConcepts;

interface Movable {
	boolean isMovable();
}

interface Rollable {
	boolean isRollable();
}

public class InterfaceDemo2 implements Movable, Rollable {
	@Override
	public boolean isRollable() {
		return true;
	}

	@Override
	public boolean isMovable() {
		return true;
	}

	public static void main(String[] args) {

		InterfaceDemo2 demo = new InterfaceDemo2();
		System.out.println(demo.isMovable());
		System.out.println(demo.isRollable());
	}
}