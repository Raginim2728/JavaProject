package arrayproject.sep22;

class Student {
	// static variable
	public static double fees;
	public static String name = "Aanh";
	}
	public class Exercise4 {
	public static void main(String[] args) {
	Student.fees = 9999999.99;
	System.out.println(Student.name + "'s annual fees : " + Student.fees);
	}
	}