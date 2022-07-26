package PracticeProject;
import java.util.*;
public class arrayAssisted {
	public static void main(String[] args)
	{
		System.out.println("One Dimensional Array");
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the array element size : ");
		n=sc.nextInt();
		int []array= new int[n];
		System.out.print("Enter the element of the array : " );
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Array elements are : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Two Dimensional Array");
	    int m;
	    System.out.println("Enter the row size : ");
	    m=sc.nextInt();
	    int x;
	    System.out.println("Enter the Column size : ");
	    x=sc.nextInt();
	    int[][] array1= new int[m][x];
	    System.out.print("Enter the elements of the array : ");
	    for(int i=0;i<m;i++)
	    {
	    	for(int j=0;j<x;j++)
	    	{
	    		array1[i][j]=sc.nextInt();
	    	}
	    }
	    System.out.println("Elements of the array are: ");
	    for(int i=0;i<m;i++)
	    {
	    	for(int j=0;j<x;j++)
	    	{
	    		System.out.print(array1[i][j]+ " ");
	    	}
	    	System.out.println();
	    }
	    
	    
		
	}
	
}
