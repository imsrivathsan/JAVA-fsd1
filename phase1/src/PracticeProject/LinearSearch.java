package PracticeProject;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the size of an elements : ");
		n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter the value of array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k;
		System.out.println("enter the element to be searched : ");
		k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==k)
			{
				System.out.println("Element found at: "+ i);
				System.out.println("Element found at: "+ arr[i]);
				
			}
		}
		
	}
}
