package todaypgm;
import java.util.Scanner;
public class NeonNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int square=num*num;
		while(square!=0) {
			int d = square % 10;
			sum+=d;
			square=square/10;
						
		}
		if(sum==num) {
			System.out.println("NEON number");
		}
		else {
				System.out.print("It is not a neon number");
			}
			}
		

	}
