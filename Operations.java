package sep19.branch;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		int choice;
		float num1,num2,res;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("************MENU");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

        
		 choice=sc.nextInt();
		 
		 System.out.println("Enter two number");
		 num1=sc.nextFloat();
		 num2=sc.nextFloat();
		 switch(choice)
		 {
		 case 1:res=num1+num2;
		 System.out.println("sum="+res);
		 break;
		 case 2:res=num1-num2;
		 System.out.println("diff="+res);
		 break;
		 case 3:res=num1*num2;
		 System.out.println("sum="+res);
		 break;
		 case 4:res=num1/num2;
		 System.out.println("div="+res);
		 break;
		 default: System.out.println("Invalid input");
	}

}
}