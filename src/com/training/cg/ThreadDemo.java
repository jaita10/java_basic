package com.training.cg;

public class ThreadDemo {
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread("thread - 1");
		t1.go();
		MyThread t2 = new MyThread("thread - 2");
		t2.go();
	}

}
