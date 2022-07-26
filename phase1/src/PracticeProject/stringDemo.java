package PracticeProject;

public class stringDemo {
	public static void main(String[] args)
	{
		System.out.println("Methods of Strings");
		String s = new String("Hi Hello");
		System.out.println(s.length());
		String sub = new String("world");
		System.out.println(sub.substring(2));
		String s1="String functions Program";
		String s2="String functions";
		System.out.println("String Operations are : ");
		System.out.println(s1.codePointAt(3));
		System.out.println(s1.codePointBefore(1));
		System.out.println(s1.codePointCount(0, 5));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println("Concatenated String");
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains(s2));
		System.out.println(s2.endsWith("gram"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.hashCode());
		System.out.println(s1.indexOf("Program"));
		String s3="Demo";
		System.out.println(s3.isEmpty());
		String s4="Hello World";
		System.out.println(s4.toLowerCase());
	    System.out.println(s4.toUpperCase());
	    String s5=" Hello world  ";
	    System.out.println(s5.trim());
	    System.out.println("String Buffering");
	    StringBuffer s6 = new StringBuffer("Started Java");
		System.out.println(s6.append(" Phase1"));
		System.out.println(s6.delete(2,5));
		System.out.println(s6.replace(5,9," Python "));
		System.out.println(s6.insert(4 ," language "));
		System.out.println(s6.reverse());
		System.out.println(s6.charAt(9));
		System.out.println("CreatingStringBuilder");
		StringBuilder sb1 = new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);
		System.out.println(sb1.delete(0, 1));
		System.out.println(sb1.insert(1,"Welcome"));
		System.out.println(sb1.reverse());
	 }
    
     	
}
