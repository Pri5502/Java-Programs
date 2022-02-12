package p;
import java.util.*;
public class perSquare {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int temp=0,i;
	for( i=1;i<num;i++)
	{
		if(i*i==num)
		{
			temp=1;
			break;
		}
		
	}
	if(temp==1)
		System.out.println("It is perfect square");
	else
		System.out.println("no");
}
}
