
 abstract class Bike {
abstract void run();
 }
 class honda extends Bike{
	 void run() {
		 System.out.println("running safely");
	 }
	 
	 }
 class Demo{
 public static void main(String args[]) {
	 honda h=new honda();
	 h.run();
 }
 
}
