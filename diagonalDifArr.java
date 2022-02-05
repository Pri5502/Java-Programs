package p;
import java.util.Scanner;
public class diagonalDifArr {
public static void main(String args[])
{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter matrix");
		n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		int sumleft=0,sumright=0;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					sumleft+=arr[i][j];
					
				}
				if(i+j==n-1)
				{
					sumright+=arr[i][j];
					
				}
				
			}
			}
		System.out.println(sumleft);
		System.out.println(sumright);
		System.out.print(sumleft-sumright);
}
}
