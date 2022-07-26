package PracticeProject;

public class StringOperations {
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("Started Java");
		System.out.println(s.append(" Phase1"));
		System.out.println(s.delete(2,5));
		System.out.println(s.replace(5,9," Python "));
		System.out.println(s.insert(4 ," language "));
		System.out.println(s.reverse());
		System.out.println(s.charAt(9));
		
	    
		
	}
}
