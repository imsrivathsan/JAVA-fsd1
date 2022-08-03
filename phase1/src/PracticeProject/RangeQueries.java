package PracticeProject;
import java.util.Scanner;
public class RangeQueries {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of an array : ");
		n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the value of an array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int starti;
		int endi;
		System.out.println("enter the value of start index : ");
		starti=sc.nextInt();
		System.out.println("enter the value of end index : ");
		endi=sc.nextInt();
		int sum=0;
		for(int i=starti;i<=endi;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}
