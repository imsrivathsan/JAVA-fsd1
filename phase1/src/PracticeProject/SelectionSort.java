package PracticeProject;
import java.util.*;
public class SelectionSort {
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
		int t;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
