
public class Student {
	int rollno;
	String name;
	float fee;
	Student(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);}
	}
	class TestThis2 {
	public static void main(String args[]) {
		Student s1=new Student(111,"sky",200f);
		Student s2=new Student(121,"vim",400f);
		s1.display();
		s1.display();
		
		
	}

}
