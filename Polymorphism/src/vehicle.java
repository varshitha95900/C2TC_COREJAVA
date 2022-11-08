
public class vehicle {
void run()
{
	System.out.println("vehicle is running");
}
}
class bike2 extends vehicle{
	void run()
	{
		System.out.println("bike is running slowly");
		
	}
	public static void main(String args[]) {
		bike2 obj= new bike2();
		obj.run();

	}

}
