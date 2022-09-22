package arrayproject.sep22;
import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter"+ar.length+"elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Array elemts are");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		//display pupose enhanced loop
		System.out.println("Using enhanced for loop display array elements");
		for(int k:ar)
		{
			System.out.println(k);
		}
	}

}
