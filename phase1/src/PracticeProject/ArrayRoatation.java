package PracticeProject;
import java.util.Scanner;
public class ArrayRoatation {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of an array : ");
		n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n1;
		System.out.println("enter the no of time the array need to be rotatated : ");
		n1=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			int first=arr[0];
			for(int j=0;j<n-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[n-1]=first;
		}
		System.out.println();
		System.out.println("output array");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
	}
}
