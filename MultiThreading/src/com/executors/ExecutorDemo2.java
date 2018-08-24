package com.executors;
import java.util.concurrent.*;

class MyApplication implements Callable<Integer>{
	private int data;
	public MyApplication(int i) {
		this.data=i;
	}
	
	int perform() {
		int sum=0;
		for(int i=0;i<data;i++) {
			sum=sum+i;
		}
		return sum;
	}
	
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello: "+ Thread.currentThread());
		return perform();
	}
}

public class ExecutorDemo2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ExecutorService exec = Executors.newFixedThreadPool(3);
		
		for(int i=12;i<15;i++) {
			Future<Integer> future = exec.submit(new MyApplication(i));
			System.out.println("After Calculation: "+future.get());
		}
		exec.shutdown();
	}
}
