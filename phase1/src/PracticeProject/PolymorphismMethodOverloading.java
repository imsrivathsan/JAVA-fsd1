package PracticeProject;
class C
{
	public void show()
	{
		System.out.println("HelloWorld");
	}
	public void show(int i)
	{
		System.out.println("Hi Hello");
	}
	public void show(double i)
	{
		System.out.println("Gud night");
	}
}

public class PolymorphismMethodOverloading {
	public static void main(String[] args){
		C ob1 = new C();
	    ob1.show();
	    ob1.show(3.5);
	    ob1.show(6);
	    
		
	}
}
