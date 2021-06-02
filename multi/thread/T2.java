package com.multi.thread;

public class T2 extends Thread {
	MyData md;
	
	public T2(MyData md){
		this.md=md;
	}
	
	public void run() {
		md.display("Thank You Razan");
		md.message("-------------------------");
	}
	

}
