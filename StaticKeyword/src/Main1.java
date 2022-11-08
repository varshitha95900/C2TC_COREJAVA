
public class Main1 {
int rollno;
String name;
static String college ="ITS";
void Student(int r,String n) {
	rollno =r;
	name=n;
}
static void change() {
	college ="bbdit";
}
void display() {

	System.out.println(rollno+" "+name+" "+college);
}
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.display();
		s2.display();

	}

}
