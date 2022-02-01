package p;
import java.time.format.*;
import java.time.format.DateTimeFormatter.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
public class msg {

	public static void main(String args[])
	{
		int h1,h2,m1,m2,s1,s2;
		//int h3,h4,m3,m4,s3,s4;
		h1=12;m1=00;s1=00;
		h2=05;m2=00;s2=00;
		LocalTime m,n;
		LocalTime t=java.time.LocalTime.now();
		m=LocalTime.of(h1,m1,s1);
		n=LocalTime.of(h2,m2,s2);
		int c=m.compareTo(t);
		int c1=n.compareTo(t);
		if(c>0)
		
			System.out.println("good morning");

		else if(c<0 && c1>0)
			System.out.println("Good afternoon");
		else if(c1<0)
			System.out.println("good evening");
		else
			System.out.println("Good night");
	
		
	}
}
