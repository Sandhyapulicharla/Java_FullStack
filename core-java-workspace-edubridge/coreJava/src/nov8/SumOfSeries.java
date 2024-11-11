package nov8;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		int i=1;
		for(int j=1;j<=10;j++) {
			sum+=(double)i/j;
		}
		System.out.println("The sum of series is : "+sum);

	}

}
