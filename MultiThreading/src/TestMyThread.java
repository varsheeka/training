
public class TestMyThread {

	public static void main(String[] args) {
		System.out.println("Main Started: " + Thread.currentThread().getName());
		Thread t = new MyThread();
	//	t.run(); // when dealing with threads, NEVER invoke run method.
		t.start(); // start should be used 
		// START doesn't invoke immediately. It tells the scheduler to schedule this according to its convenience.
		// start is a request for another thread i.e another stack. run uses the same thread.
		Thread t1 = new MyThread();
		t1.start(); // CANNOT restart thread. should either end or quit first. 
		System.out.println("Main Done: " + Thread.currentThread().getName());	
		
	}
}
