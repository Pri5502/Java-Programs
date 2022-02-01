package p;
import java.util.Scanner;
public class sumofarray {
	
	
	public static void main(String args[]) {
		
		int [] arr;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		int a=sc.nextInt();
		int i;
		arr=new int[a];
		int sum=0;
		for(i=0;i<a;i++)
		{
			
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		
		
			System.out.println(" "+sum);
		
		
	}
}
