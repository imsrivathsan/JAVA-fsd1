package PracticeProject;
import java.util.Scanner;
public class LongestIncreasingSubsequence {
	public static int LisLength(int[] a)
	{
		int [] lis = new int[a.length];
		for(int i=0;i<lis.length;i++)
		{
			lis[i]=1;
		}
		int maxLisLength=1;
		for(int i=1;i<lis.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i]>a[j] && 1 + lis[j]>lis[i])
				{
					lis[i]=lis[j]+1;
					maxLisLength=Math.max(maxLisLength, lis[i]);
				}
			}
		}
		return maxLisLength;
	}
	public static void main(String[] args)
	{
		int a[]={7,1,4,8,11,2,14,3};
		int b[]={10, 22, 9, 33, 21, 50, 41, 60, 80};
		System.out.println("LongestIncreasingSubsequence of the given array");
		System.out.print("array A : ");
		System.out.println(LongestIncreasingSubsequence.LisLength(a));
		System.out.print("array B : ");
		System.out.println(LongestIncreasingSubsequence.LisLength(b));
		
	}
}
