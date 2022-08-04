package PracticeProject;
import java.util.Scanner;
public class MergeSort {
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
		int n1;
		System.out.println("enter the size of an elements : ");
		n1=sc.nextInt();
		int arr1[]= new int[n];
		System.out.println("enter the value of array : ");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int size=n+n1;
		int arr3[] = new int[size];
		int c1=0;
		for(int i=0;i<n;i++)
		{
			arr3[c1++] = arr[i];
		}
		for(int i=0;i<n1;i++)
		{
			arr3[c1++] = arr1[i];
		}
		int t;
		for(int i=0;i<c1;i++)
		{
			for(int j=i+1;j<c1;j++)
			{
				if(arr3[i]>arr3[j])
				{
					t=arr3[i];
					arr3[i]=arr3[j];
					arr3[j]=t;
				}
			}
		}
		for(int i=0;i<c1;i++)
		{
			System.out.print(arr3[i] + " ");
		}
		
		
	}
}
