package com.multi.thread;

public class YieldDemo {
	
	public static void main(String[] args) {

//anyanomus class reference is created.
		Runnable rn = new Runnable() {
			public void run()
			{
				int i=0;
				while(true) {
					System.out.println(Thread.currentThread().getName()+" : "+i);
					Thread.currentThread().yield();
				i++;
				}
			}
		};
//thread is created here 		
		Thread t1= new Thread(rn);
//renamed the thread to t1
		t1.setName("t1");
//this will place the thread to ready queue to be picked by thread executor 
		t1.start();
		
//initializing and creating infinite loop
		int z=0;
		while(true) {
			System.out.println(Thread.currentThread().getName()+" : "+z);
			z++;
		}
		
	}

}
