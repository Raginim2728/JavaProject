package product.pack;
class Base{
	private int i;
	Base(int i)
	{ 
		this.i=i;
		
		System.out.println("The value of i="+i);
	}
}
class SubClass extends Base{
	SubClass(int j)
	{ 
		super(j);
	}
}

public class Conscall {

	public static void main(String[] args) 
	{
		SubClass sob=new SubClass(8);
	}

}
