package sep19.branch;

import java.util.Scanner;

public class MonthCase {


	

			public static void main(String[] args) {
				int month;
				 Scanner sc= new Scanner(System.in);
				 
				 System.out.println("enter month");
				 month=sc.nextInt();
				 switch(month)
				 {
				 case January: System.out.println("1st month of the year");
				 break;
				 case february: System.out.println("2nd month of the year");
				 break;
				 case march: System.out.println("3rd month");
				 break;
				 case april: System.out.println("4th month");
				 break;
				 case may: System.out.println("5th month");
				 break;
				 case june: System.out.println("6th month");
				 break;
				 case july: System.out.println("7th month");
				 break;
				 case august: System.out.println("8tht month of the year");
				 break;
				 case september: System.out.println("9th month of the year");
				 break;
				 case october: System.out.println("10th month");
				 break;
				 case november: System.out.println("11th month");
				 break;
				 case december: System.out.println("12th month");
				 break;
				 default: System.out.println("Invalid input");
			}

		}
			// TODO Auto-generated method stub

	}

}
