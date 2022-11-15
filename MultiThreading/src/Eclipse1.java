
public abstract class Eclipse1 implements Runnable {
public void run() {
	System.out.println("eclipse thread ID is"+" "+Thread.currentThread().getId());
	}
}
class PPT extends Thread {
	public void run() {
		System.out.println("PPT thread ID is"+""+Thread.currentThread().getId());
	}
	}
public class multithread {
	public static void main(String[] args) {
		Eclipse obj =new Eclipse();
		Thread t =new Thread (obj);
		t.start();
		PPT obj1=new PPT();
		Thread t1=new Thread(obj1);
		t1.start();
		
		
	}

}
