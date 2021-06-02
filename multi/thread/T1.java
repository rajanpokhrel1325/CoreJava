package com.multi.thread;

public class T1 extends Thread {
	
	MyData md;
	
	public T1(MyData md){
		this.md=md;
	}
	public void run() {
		md.display("Hello World Namaskar");
		md.message("xxxxxxxxxx ");
	}
	

}
