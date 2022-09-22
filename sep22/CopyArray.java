package arrayproject.sep22;
import java.util.Scanner;
public class CopyArray 
{

	public static void main(String[] args)
	{
		int firstarray[]=new int[5];
		int secondarray[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<firstarray.length;i++)
		{
			firstarray[i]=sc.nextInt();
	    }
    	for(int i=0; i<firstarray.length; i++) 
    	{
		secondarray[i]=firstarray[i];
		
    	}
    	System.out.println("Coppied elements");
	    for(int i:secondarray)
     	{
		   System.out.println(i);
    	}
    	for(int i:secondarray)
    	{
		   System.out.println(i);
	    }
	
     }
}