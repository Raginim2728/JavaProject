package stringdemostr;

public class StrConcat {

	public static void main(String[] args) {
	  String s1="Good morning";
	  String s2="RaginiAK";
	  System.out.println(s1+""+s2);
	  System.out.println("Hello"+6+8);
	  System.out.println(6+8+"Hello");
	  System.out.println("hello"+(6+8));
	  System.out.println((6+8)+"Hello");
	  String s4=s1.concat(s2); //combining two string
		System.out.println(s4);

	}

}
