


public class TestMessage {
	
	public static void main(String[] args) {
		Message msg = new Message("process it");
		Consumer waiter= new Consumer(msg);
		new Thread(waiter,"consumer 1").start();
		
		Supplier waiter1=new Supplier(msg);
		new Thread(waiter1, "Supplier1").start();
		
		System.out.println("All the threads are started");
	}
}
