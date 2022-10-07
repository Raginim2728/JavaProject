package sep27pgm.ex;

public class ConstructorJava {
	int i;
	float sal;
	String s;
	
	ConstructorJava(){
		i=9;
		s="Hello";
		sal=456.2f;
	}

	public static void main(String[] args) {
		ConstructorJava ob=new ConstructorJava();
		System.out.println("i="+ob.i);
		System.out.println("s="+ob.s);
		System.out.println("sal="+ob.sal);
		
	}

}
