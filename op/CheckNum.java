package conditonal.op;
import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("The number is positive");
			
		}
		if(num<0)
		{
			System.out.println("The number is negative");
		}
		if(num==0)
		{
			System.out.println("The number is zero");
		}
		System.out.println("After if statement");
	}

}
