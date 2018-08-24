public class Supplier implements Runnable {

	 private Message msg;
	 
	public Supplier(Message msg) {
		super();
		this.msg = msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		try{
			Thread.sleep(1000);
			synchronized (msg) {
	           msg.setMsg("Hello from hread");
	           msg.notify();
			}
		}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			
		}

	}
}
