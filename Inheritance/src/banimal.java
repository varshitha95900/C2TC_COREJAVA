
public class banimal {
String color="white";
}
class dog extends banimal
{
	String color="black";
	void printcolor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	}
class Demo
{
	public static void main(String args[]) {
		dog d=new dog();
		d.printcolor();
	}
}

		
		

	


