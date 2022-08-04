package PracticeProject;
import java.util.Scanner;
public class ExponentialSearch {
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
		System.out.println("enter the kth element to be searched");
		k=sc.nextInt();
		int cnt=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==k)
			{
				cnt++;
				System.out.print("element is present in the array at index : ");
				System.out.println(i);
			}
			
			
		}
		if(cnt==0)
		{
			System.out.println("element is not found at array");
		}
		
	}
}
