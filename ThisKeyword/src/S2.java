
public class S2 {
	void m(S2 a)
	{
		System.out.println("method is invoked");
	}
	void p()
	{
		m(this);}
	}
	static class main{
	public static void main(String args[]) {
		S2 s1 =new S2();
	}
	}
	