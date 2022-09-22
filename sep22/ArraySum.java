package arrayproject.sep22;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		int ar[]=new int[5];
		int sum=0 ,max,min;
		 Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter the "+ar.length+" elements");
	        for(int i=0;i<ar.length;i++) {
	        	ar[i]=sc.nextInt();
	        }
	        
	        System.out.println("Array elements are");
	        for(int i:ar) {
	        	System.out.println(i);
	        }
	        
	        for(int i=0;i<ar.length;i++) {
	        	sum=sum+ar[i];
		    }
	        System.out.println("Total of all array elements="+sum);
	        //or
	        /*for(int i:ar) {
	        	sum=sum+i;
	        }*/
	        max=ar[0];
	        for(int i=1;i<ar.length;i++)
	        {
	        	if(ar[i]>max)
	        	{
	        		max=ar[i];
	        	}
	        }
	        System.out.println("Maximum elements="+max);

	min=ar[0];
    for(int i=1;i<ar.length;i++)
    {
    	if(ar[i]<min)
    	{
    		min=ar[i];
    	}
    }
    System.out.println("Maximum elements="+min);


	}	
	}
