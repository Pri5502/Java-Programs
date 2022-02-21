package p;
import java.util.*;
public class stonepaperscissorwithcomputer {
public static void main(String args[])
{
	for(;;) {
	Scanner sc=new Scanner(System.in);
	System.out.println("1.Rock\n2.Paper\n3.Scissor\n4.exit");
	int player1=sc.nextInt();
	Random r= new Random();
	int rInt= r.nextInt(4);
	System.out.println(rInt);
	if(rInt==player1)
	{
		System.out.println("Tie");
	}
	else if(player1==1 && rInt==2)
		{
			System.out.println("Player 2 wins");
		}
	else if(player1==1 && rInt==3)
		{
			System.out.println("player 1 wins");
		}
	else if(player1==2 && rInt==1)
		{
			System.out.println("player 1 wins");
		}
	else if(player1==2 && rInt==3)
	{
		System.out.println("player 2 wins");
	}
	else if(player1==3 && rInt==1)
	{
		System.out.println("player 2 wins");
	}
	else if(player1==3 && rInt==2)
	{
		System.out.println("player 1 wins");
	}
	
	else
		System.out.println("something went wrong");
	}
	
}
}
