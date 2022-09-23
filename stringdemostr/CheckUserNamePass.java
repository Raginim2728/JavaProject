package stringdemostr;
import java.util.Scanner;
public class CheckUserNamePass {

	public static void main(String[] args) {
		String uname,upass;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		uname=sc.next();
		System.out.println("Enter password");
		upass=sc.next();
		if(uname.equalsIgnoreCase("Ragi") && upass.equals("RagiAK:)"))
		{
			System.out.println("valid user");
	}
	else
	{
		System.out.println("invalid user");
	}
	}

}
