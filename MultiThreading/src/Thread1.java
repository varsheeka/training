
public class Thread1 extends Thread {

	private int data;
	public Thread1() {
		// TODO Auto-generated constructor stub
	data = 3;
	}
	public Thread1(int data) {
		super();
		this.data = data;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(data +" "+ Thread1.currentThread().getName());
	}
}
