
public class DemoWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoNotify t1=new DemoNotify();
		t1.start();
		try {
			synchronized (t1) { // lock will be shifted from main to t1
				t1.wait();
				System.out.println(t1.sum); }
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		
	}

}
