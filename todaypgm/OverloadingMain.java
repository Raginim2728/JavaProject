package todaypgm;


class SeriesOverload
{
	void sumSeries(int n,double x)
	{
		double ssum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				ssum=ssum-(double)x/i;
    		}else
    		{
    			ssum=ssum+(double)x/i;
    		}
		}
		System.out.println("sum of"+ssum);
	}
	
	void sumSeries()
	{
		int p=1, sum=0;
		for(int i=1;i<=20;i++) {
			p=1;
			for (int j=1;j<=i;j++) {
			p=p*i;
		}
			sum=sum+p;
			System.out.println("sum of s= ");
			}
}
public class OverloadingMain {

	public static void main(String[] args) {
		SeriesOverload ob=new SeriesOverload();
		ob.sumSeries(2,5);
		ob.sumSeries();
	}

}
}