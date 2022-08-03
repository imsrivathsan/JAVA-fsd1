package PracticeProject;
import java.util.Scanner;
public class OrderStat {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int t;
		System.out.println("Enter the size of an array : ");
		n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the value of an array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int k;
		System.out.println("Enter the value of k : ");
		k=sc.nextInt();
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
		int ans= arr[k-1];
		System.out.println(ans);
	}
}
