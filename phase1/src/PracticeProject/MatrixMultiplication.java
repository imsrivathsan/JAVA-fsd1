package PracticeProject;
import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		int row1;
		System.out.println("enter the row size of the matrix: ");
		row1=sc.nextInt();
		int col1;
		System.out.println("enter the col size of the matrix: ");
		col1=sc.nextInt();
		System.out.println("enter the elements of matrix a : ");
		int mat1[][] = new int[row1][col1];
		
		int max=50;
		int pro[][] = new int [row1][col1];
		int sum=0;
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		int row2;
		System.out.println("enter the row size of the matrix: ");
		row2=sc.nextInt();
		int col2;
		System.out.println("enter the col size of the matrix: ");
		col2=sc.nextInt();
		int mat2[][] = new int[row2][col2];
		if(row2!=col1)
		{
			System.out.println("Sorry we cannot multiply the matrices a and b");
		}
		else
		{
			System.out.println("enter the elements of matrix b : ");
			for(int i=0;i<row2;i++)
			{
				for(int j=0;j<col2;j++)
				{
					mat2[i][j]=sc.nextInt();
				}
			}
			
		}
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col2;j++)
			{
				for(int k=0;k<row2;k++)
				{
					sum=sum+mat1[i][k]* mat2[k][j];
					
				}
				pro[i][j]=sum;
				sum=0;
			}
		}
		System.out.println("Resultant Matrix");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col2;j++)
			{
				System.out.print(pro[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
