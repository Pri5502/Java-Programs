package p;
//insert at end
public class one{
public static void main(String args[]) {
/*	
	
		
		int[] ar= new int[4];
		int length=0;
		ar[length]=4;
		for(int i=1;i<4;i++)
		{
			ar[length]= i;
			length++;
			
		}
		
		for(int i=0;i<ar.length;i++)
		{
			ar[length]=4;
			System.out.println(" " +i+ " " +""+ ar[i]);
			
		}
		
		
		
	*/

	int ar[]=new int[4];
	for(int i=3;i>0;i++) 
	{
		
		ar[i+1]=ar[i];
	}
	
	for(int i=0;i<3;i++)
	{
		ar[1]=30;
		System.out.println(" " +i+ " " +""+ ar[i]);
		
	}
	
}
}
	
