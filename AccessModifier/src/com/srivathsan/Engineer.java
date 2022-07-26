package com.srivathsan;
import com.srivathsan.test.*;
public class Engineer extends Student{
	public void show()
	{
		marks=77;
	}
	public static void main(String[] args)
	{
		Engineer ob = new Engineer();
		System.out.println(ob.marks);
	}
	

}
