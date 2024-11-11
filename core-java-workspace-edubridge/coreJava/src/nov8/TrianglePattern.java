/*
bb1
b22
333
 */
package nov8;


public class TrianglePattern {


	public static void main(String[] args) {
		int r=3;
		
		for(int i=1;i<=r;i++) {
			for(int b=1;b<=r-i;b++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		r=2;
		for(int i=1;i<=r;i++) {
			for(int b=1;b<=r-i;b++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		r=4;
		for(int i=1;i<=r;i++) {
			for(int b=1;b<=r-i;b++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

