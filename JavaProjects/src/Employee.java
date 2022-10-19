
public class Employee {
	int id;
	String name;
	float salary;
	Employee(int i, String string, int j) {
		System.out.println("user defined no-argument" + "constructor executed");
	}
	void display() {
		System.out.println(id + ""+name+""+salary);
	}
}
