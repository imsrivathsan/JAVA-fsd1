package PracticeProject;
class MyException extends Exception{
	String str1;
	MyException(String str2)
	{
		str1=str2;
	}
	public String toString()
	{
		return("MyExceptionOccurred:"+str1);
	}
}
public class ExcepHandling {
	public static void main(String args[])
	{
		try
		{
			System.out.println("Starting of try block");
			throw new MyException("This is My error Message");

		}
		catch(MyException exp)
		{
			System.out.println("Catch Block") ;
			System.out.println(exp) ;

		}
	}
}
