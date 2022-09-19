package sep19.branch;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		int r=num%2;
        switch(r)
        {
        case 0:
        	System.out.println(num+ "is an even number");
            break;
        case 1:    
            System.out.println(num+ "is an odd number");
            break;
            
		}
	}

}
