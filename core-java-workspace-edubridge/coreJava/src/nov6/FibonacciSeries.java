package nov6;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int t=sc.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=3;i<=t;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
