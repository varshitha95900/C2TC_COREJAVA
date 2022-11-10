
public abstract class dress {
abstract void type();
}
class menswear extends dress 
{
	void type()
	{
		System.out.println("its a men's wear");
	}
}
public class Main{
	public static void main(String args[]) {
	menswear coat = new menswear();
	coat.type();
	}

}
