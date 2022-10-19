package oct19eduthread87;
class ThreadsApp extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread Name="+Thread.currentThread() +"i="+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
		}
		
	}
public class ThreadPgmMain {

	public static void main(String[] args) throws InterruptedException {
		MyThread tob1=new MyThread();
		MyThread tob2=new MyThread();
		tob1.setName("first");
		tob2.setName("second");
		tob1.setPriority(2);
		tob2.setPriority(4);
		tob1.start(); 
		
		tob1.join();
		
		tob2.start();
	
        }
	}
}