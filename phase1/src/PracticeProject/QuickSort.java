package PracticeProject;
import java.util.Scanner;
public class QuickSort {
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
		int arr1[]= new int[n];
		int arr2[]= new int[n];
		int c1 =0;
		int c2=0;
		int pivotel = arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]<=pivotel)
			{
				arr1[c1++]=arr[i];
			}
			else
			{
				arr2[c2++]=arr[i];
			}
		}
		int t1;
		int t2;
		for(int i=0;i<c1;i++)
		{
			for(int j=i+1;j<c1;j++)
			{
				if(arr1[i]>arr1[j])
				{
					t1=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=t1;
				}
			}
		}
		for(int i=0;i<c2;i++)
		{
			for(int j=i+1;j<c2;j++)
			{
				if(arr2[i]<arr2[j])
				{
					t1=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=t1;
				}
			}
		}
		for(int i=0;i<c1;i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
		for(int i=0;i<c2;i++)
		{
			System.out.print(arr2[i] + " ");
		}
		
	}
}
