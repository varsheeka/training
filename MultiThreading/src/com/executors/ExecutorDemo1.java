package com.executors;
import java.util.concurrent.*;

class myapp implements Runnable{
	public void run() {
		perform();
	}

void perform() {
	for(int i=0; i<5;i++) {
		System.out.println("Hello "+i+" "+Thread.currentThread());
		try {
			Thread.sleep(100);
		}catch(InterruptedException ie) {
			System.out.println(ie);
		}
	}
}
}

public class ExecutorDemo1 {
	public static void main(String[] args) 
	{
		ExecutorService exec = Executors.newFixedThreadPool(3);
		
		for(int i=0;i<3;i++) {
			exec.execute(new myapp());
		}
		System.out.println("After submitting tasks");
		System.out.println("After for loop");
		exec.execute(new myapp());
		exec.shutdown();
		System.out.println("Done");
	}
} 

