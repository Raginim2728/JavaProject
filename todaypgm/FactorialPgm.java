package todaypgm;

import java.util.Scanner;

public class FactorialPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;
		int n;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        for(i=1;i<=n;i++) {
        	fact=fact*i;
        	
        }
        System.out.println("Factorial of" +n+ " is ="  +fact);
	}

}
