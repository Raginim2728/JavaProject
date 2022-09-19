package sep19.branch;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		int choice;
		float pi=3.14f;
		float area,length,breadth,base,height, radius;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("************MENU************");
		System.out.println("1.Area of square");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Area of Triangle");
		System.out.println("4.Area of Circle");

		System.out.println("Enter your choice");
		
	    choice=sc.nextInt();
		
		 switch(choice)
		 {
		 case 1:System.out.println("Enter length of square");
		 length=sc.nextFloat();
		 area=length*length;
		 System.out.println("Area of square="+area);

		 break;
		 case 2:System.out.println("Enter length of rectangle");
		 length=sc.nextFloat();
		 breadth=sc.nextFloat();
		 area=length*breadth;
		 System.out.println("Area of rectangle="+area);
		 break;
		 
		 case 3:System.out.println("Enter length of triangle");
		 base=sc.nextFloat();
		 length=sc.nextFloat();
		 area=(base*length)/2;
		 System.out.println("Area of triangle="+area);
		 break;
		 
		 case 4:System.out.println("Enter length of triangle");
		 radius=sc.nextFloat();
		 area=pi*radius*radius;
		 System.out.println("Area of circle="+area);
		 break;
		 
		 default: System.out.println("Invalid input");
	}

}
}