//use else if ladder
/*  
  Marks(i/p)     Grade(o/p)
    90-100         Grade A
    80-89          Grade B
    50-79          Grade C
    35-49          Grade D
    0 - 34         Grade E
    0>m>100        Invalid marks
  
 */

package nov5;

import java.util.Scanner;

public class GradeBasedOnMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks=sc.nextInt();
		if(marks<0 || marks>100){
			System.out.println("Invalid marks");
			return;
		}
		
		if(marks>=90 && marks<100) {
			System.out.println("Grade A");
		}
		else if(marks>=80 && marks<90) {
			System.out.println("Grade B");
		}
		else if(marks>=50 && marks<80) {
			System.out.println("Grade C");
		}
		else if(marks>=35 && marks<50) {
			System.out.println("Grade D");
		}
		else if(marks>=0 && marks<35) {
			System.out.println("Grade E");
		}
		
	}

}
