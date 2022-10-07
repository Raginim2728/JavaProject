package todaypgm;

public class ArmstrongPgm {

	public static void main(String[] args) {
		int num = 153;
		double sum = 0;
		int d;
		int armnum = num;
		while (num > 0) {
			d = num % 10;
			sum = sum + Math.pow(d, 3);
			num = num / 10;

		}
		if (sum == armnum) {
			System.out.println(armnum + " is armstrong number");

		} else {
			System.out.println(armnum + " is not armstrong number");
		}
	}

}
