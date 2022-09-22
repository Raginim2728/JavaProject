package arrayproject.sep22;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int ar[]=new int[5];
		int search,pos=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter"+ar.length+"array elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
       
		System.out.println("Enter the search element");
		search=sc.nextInt();
		
		for (int i=0;i<ar.length;i++)
		{
			if(search==ar[i])
			{
				pos=i;
				break;
			}
		}
		if(pos>-1)
		{
			System.out.println("successful search");
			System.out.println(search+"element found at position"+(pos+1));
		}
		else
		{
			System.out.println("Unsuccessful search");
			System.out.println(search+"element not found");
		}
		}
}
