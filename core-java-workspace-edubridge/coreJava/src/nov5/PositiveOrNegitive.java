package nov5;

import java.util.Scanner;

public class PositiveOrNegitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number:");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println(n+" is positive");
		}
		else if(n<0) {
			System.out.println(n+" is negitive");
		}
		else {
			System.out.println(n+" is zero");
		}

	}

}
