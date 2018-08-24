
public interface DemoInterface {

	void display();
	default void description() {
		System.out.println("hello from interface");
	}
	
	static void count() {
		System.out.println("hello from count");
	}
	// ONLY DEFAULT and STATIC methods can have definition in an interface.
	// No constructor or data members allowed in an interface.
}
