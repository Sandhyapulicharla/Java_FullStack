package nov4;

import java.util.Scanner;

public class LargestOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number:");
		int a=sc.nextInt();
		System.out.println("Enter your second number:");
		int b=sc.nextInt();
		int big=(a>b)?a:b;
		System.out.println("Largest of "+a+" and "+b+" is :"+big);

	}

}
