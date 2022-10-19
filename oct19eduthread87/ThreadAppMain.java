package oct19eduthread87;
import java.io.*;

	class MyThread extends Thread{
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println("Thread Name="+Thread.currentThread() +"i="+i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			
			}
			
		}
	}
	public class ThreadAppMain {

		public static void main(String[] args) throws InterruptedException {
			MyThread tob1=new MyThread();//new
			MyThread tob2=new MyThread();
			tob1.setName("first");
			tob2.setName("second");
			tob1.setPriority(2);
			tob2.setPriority(4);
			tob1.start(); //runnable
			
			tob1.join();
			
			tob2.start();

		}
	}
	