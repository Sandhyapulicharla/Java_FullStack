package nov6.whileloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int t=sc.nextInt();
		System.out.print(a+" "+b+" ");
		int i=3;
		while(i<=t) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}

	}

}
