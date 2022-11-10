
public abstract class animal {
	abstract void eat();
}
class herbivores extends animal
{
	void eat()
	{
		System.out.println("i am vegetarian");
	}
}
class carnivores extends animal {
	void eat()
	{
		System.out.println("i am non vegetrain");
	}
	public static void main(String args[]) {
		{
			animal goat = new animal();
			
		} 
	}

}
