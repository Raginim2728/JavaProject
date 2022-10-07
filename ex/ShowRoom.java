package sep27pgm.ex;

import java.util.Scanner;

class ShowRoom1 {
	String name;
	long mobno;
	double cos,dis,amount;
void Input() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Your Customer Name");
	name=sc.next();
	System.out.println("Enter Your Mobile Number");
	mobno=sc.nextLong();
	System.out.println("You Want Purchased The Cost");
	cos=sc.nextDouble();
}
void Caluculate() {
	if(cos>=0 && cos<=10000) {
		     dis=(cos*5)/100;
		    
            // System.out.println("1."+(cos-dis));	
         }
	else if(cos>=10001 && cos<=20000){
		 dis=(cos*10)/100;
		//System.out.println("2." +(cos-dis));
	}
	else if(cos>=20001 && cos<=35000) {
		dis=(cos*15)/100;
		//System.out.println("3." +(cos-dis));
	}
	else {
		dis=(cos*20)/100;
		//System.out.println("4. "+(cos-dis));
	}
	amount = cos-dis;
	
}

void display() {
	System.out.println("Name ="+name);
	System.out.println("Mobile no="+mobno);
	System.out.println("Amount="+amount);
}

 }


public class ShowRoom {

	public static void main(String[] args) {
           ShowRoom1 ob1=new ShowRoom1();
           ob1.Input();
           ob1.Caluculate();
           ob1.display();


	}

}
