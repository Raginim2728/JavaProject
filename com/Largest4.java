package operator.com;

import java.util.Scanner;

public class Largest4 {

	public static void main(String[] args) {
		int fnum, snum, tnum,lnum, lar;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 number");
		fnum=sc.nextInt();
		snum=sc.nextInt();
		tnum=sc.nextInt();
		lnum=sc.nextInt();
		
		lar=(fnum>snum && fnum > tnum && fnum>lnum)?fnum:((snum > tnum && snum >lnum)?snum:(tnum >lnum ?tnum :lnum));

	     
		
		System.out.println("the largest of "+fnum+", "+snum+ " ,"+tnum+" and "+lnum+" is "+lar);
	}

}
