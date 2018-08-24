
public class DemoJoin {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread t1= new MyThread();
		t1.setName("High");
//		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		try {
			t1.join(); // current thread will move from 'running' to 'runnable'. t1 will start 'running'. Once t1 is done executing the current thread will start 'running' again.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	
	}
}
