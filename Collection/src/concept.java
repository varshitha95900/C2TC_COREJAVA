

import javax.swing.text.ElementIterator;

public class concept {

	public static <integer> void main(String[] args) {
	list val=new arraylist();
		val.add(0);
		val.add(11);
		val.add(23);
		ElementIterator z=val.iterator();
		while(z.next() != null)
		{
			System.out.print(z.next());}
		System.out.println("arraylist : "+val);
		}
	}


