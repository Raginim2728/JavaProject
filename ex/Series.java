package sep27pgm.ex;
class Series
{
public void series(int x, int n){
    double sum = 0L;
    for(int i = 1; i <= n; i++)
    {
        sum=sum+Math.pow(x, i);
    }
    System.out.println("Sum of series is " + sum);
}
public void series(int p)
{
    int term=0;
    for(int i = 1; i <= p; i++)
    {
        term = (int)(Math.pow(i, 3)-1);
        System.out.print(term + ",");
    }
}
public void series()
{
    double sum = 0.0;
    for(int i = 2; i <= 10; i++)
        sum = sum+ 1.0 / i;
    System.out.println("Sum of series is " + sum);
}
/**main function to run this program 
public static void main(String args[])
{
  Overload2019 ob = new Overload2019();
  ob.series(2,4);
  ob.series(3);
  ob.series();  
} */

}
