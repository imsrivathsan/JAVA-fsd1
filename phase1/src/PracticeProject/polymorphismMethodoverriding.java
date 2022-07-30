package PracticeProject;
class A
{
	public void show()
	{
		System.out.println("In show A");
	}
}
class B extends A
{
	
}
public class polymorphismMethodoverriding {
	public static void main(String[] args)
	{
		B ob1 = new B();
		ob1.show();
	}

}
