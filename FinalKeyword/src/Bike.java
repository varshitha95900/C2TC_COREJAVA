
public class Bike {
	void run()
	{
		System.out.println("running");}
}
	class honda extends Bike {
		void run()
		{
			System.out.println("runnimg safely with 100kph");
		}
	public void main(String args[]) {
		honda honda=new honda();
		honda.run();
	}
	} 

