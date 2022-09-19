package operator.com;

public class UnaryOperator {

	public static void main(String[] args) {
		int k, j;
		k=2;
		j=k++;//post
		System.out.println("j="+j);
		System.out.println("k="+k);
		j=++k;//pre
		System.out.println("j="+j);
		System.out.println("k="+k);
	}

}
