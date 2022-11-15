package com.cg.mt;

public class eclipse extends Thread {
public void run() {
	System.out.println("eclipse thread is running");
}
}
class PPT extends Thread{
	public void run() {
		System.out.println("PPT thread is running");
	}
}
class chrome extends Thread{
	public void run() {
		System.out.println("chrome thread is running");
	}	
	}
public class Multithread {
	
	public static void main(String[] args) {
		eclipse e = new eclipse();
		e.start();
		PPT p=new PPT();
		p.start();
		chrome c=new chrome();
		c.start();
	}

}
