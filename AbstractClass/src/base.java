
public class base {
	void fun()
	{
		System.out.println("abstract class method");
	}
	}
class derived extends base { }
public class Main
{
	public static void main(String args[]) {
		{
			derived d =new derived();
			d.fun();
			
		}

	}

}
