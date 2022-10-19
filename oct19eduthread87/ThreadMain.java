package oct19eduthread87;
class MyThread extends Thread{
	public void run()
	{
		for(int i=1;i<=5; i++)
		{
			System.out.println("Thread Name="+Thread.currentThread() +"i="+i);
		}
	}
}

public class ThreadMain {

	public static void main(String[] args) {
	MyThread tob1=new MyThread();
	MyThread tob2=new MyThread();
	tob1.setName("first");
	tob2.setName("second");
	tob1.setPriority(2);
	tob2.setPriority(4);
	tob1.start();
	tob2.start();
	}

}
