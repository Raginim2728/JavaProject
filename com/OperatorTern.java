package operator.com;

import java.util.Scanner;

public class OperatorTern {

	public static void main(String[] args) {
		int fnum, snum, lar;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 number");
		fnum=sc.nextInt();
		snum=sc.nextInt();
		lar=(fnum>snum)?fnum:snum;
		
		
		System.out.println("the largest of " +fnum+ " and " +snum+ " is " +lar);
	}

}
