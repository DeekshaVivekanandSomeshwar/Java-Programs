package array;

public class AverageOfNumber {

	public static void main(String[] args) 
	{
		
		double num[]=new double[4];
		num[0]=10;
		num[1]=30;
		num[2]=20;
		num[3]=90;
		double sum=0;
		double avg=0;
		for(int i=0;i<=num.length-1;i++)
		{
			sum=sum+num[i];
		}
		System.out.println("Sum of numbers: "+sum);
		avg=sum/num.length;
		System.out.println("Average of numbers: "+avg);
	}

}
