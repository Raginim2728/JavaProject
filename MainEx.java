package todaypgm;
abstract class A
{
	abstract void m1();
}
abstract class B extends A
{
	void m2()
	{
		System.out.println("m2 method");
	}
}
class C extends B
{
	@Override
	void m1()
	{
		System.out.println("m1 method");
	}
}
public class MainEx {

	public static void main(String[] args) {
		C ob=new C();
		ob.m1();
		ob.m2();
	}

}
