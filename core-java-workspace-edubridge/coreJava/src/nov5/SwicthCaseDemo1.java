package nov5;

import java.util.Scanner;

public class SwicthCaseDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int n=sc.nextInt();
		int rem=n%2;
		switch(rem) {
		case 0:System.out.println(n+" is even number");
			   break;
		case 1:System.out.println(n+" is odd number");
		      break;
		}
	}

}
