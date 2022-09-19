package operator.com;

import java.util.Scanner;

public class Largest3 {

	public static void main(String[] args) {
		int fnum, snum, tnum, lar;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 number");
		fnum=sc.nextInt();
		snum=sc.nextInt();
		tnum=sc.nextInt();
		
		lar=(fnum>snum && fnum>tnum)?fnum:(snum>fnum && snum>tnum)?snum:tnum;
        
		System.out.println("the largest of "+fnum+" and "+snum+ " and "+tnum+" is "+lar);
	}

}
