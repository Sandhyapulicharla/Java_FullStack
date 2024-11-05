package nov5;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character:");
		char ch = sc.next().toLowerCase().charAt(0);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':System.out.println(ch+" is a vowel");
				 break;
		default:System.out.println(ch+" is not a vowel");
		 		break;
		}
	}

}
