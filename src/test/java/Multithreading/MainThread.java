package Multithreading;

public class MainThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("MainThread");
		System.out.println("Name of thread is : " + t);
	}
}
