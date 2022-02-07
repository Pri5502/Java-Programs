package p;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class phonebook {

public static void  main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	int ch;
	long userKey;
	String userValue,tempname;
	HashMap<Long,String>m=new HashMap<>();
	m.put((long) 909090909,"Pri");
	m.put((long) 999999999,"Mansi");
	m.put((long) 1010101010,"Smarty");
	//System.out.println(" "+ m.size());
	for(;;) {
	System.out.println("1.Display\n2.Create new\n 3.Find number\n 4.exit");
	System.out.println("Enter your choice:");
	ch=sc.nextInt();
	
	switch(ch) {
	case 1:
		for(Entry<Long, String> e:m.entrySet())
		System.out.println(e.getKey()+" "+e.getValue());
		break;
		
	case 2:
		System.out.println("Enter number:");
		userKey=sc.nextLong();
		System.out.println("Enter name:");
		userValue=sc.next();
		//sc.nextLine();
		m.put((long) userKey,userValue);
		for(Entry<Long,String>e:m.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
		break;
	//case 3:
		//System.out.println("Enter name: ");
		//String key = sc.nextLine();
		//System.out.println("Number: " + m.get(key) + "\n");
		
	case 4:
		break;
	default:
		System.out.println("wrong choice");
	}
}	
}
}
