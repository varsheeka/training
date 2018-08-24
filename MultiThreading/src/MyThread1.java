
public class MyThread1 {

	public static void main(String[] args) {
		Thread1 t1= new Thread1();
		Thread1 t2= new Thread1(5);
		
		t1.setName("one");
		t2.setName("two");
		t1.start();
		t2.start();
				
	}
}
