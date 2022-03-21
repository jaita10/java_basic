package com.training.cg;

public class MyThread implements Runnable{
	
	private Thread t;
	private String threadName;
	
	MyThread(String name) {
		threadName = name;
	}
	
	public void run() {
		System.out.println(threadName+": is running");
		
		for(int i=3;i>0;i--) {
			System.out.println("Thread "+threadName +","+i);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Thread "+threadName +" exiting");
		}
	}
	
	public void go() {
		t = new Thread(this, threadName);
		t.start();
	}

}
