package nov9;

public class StringMethods {
	public static void main(String[] args) {
		String s="Education";
		
		//convert word to char array
		char ch[]=s.toCharArray();
		
		System.out.println(s.substring(0));
		System.out.println(s.substring(0,3));
		
		/*
		 *  EDUBRIDGE
		 *  E
		 *  ED
		 *  EDU
		 *  EDUB
		 *  EDUBR
		 *  EDUBRI
		 *  EDUBRID
		 *  EDUBRIDG
		 *  EDUBRIDGE
		 */
		
		/*String s1="EDUBRIDGE";
		for(int i=1;i<=s1.length();i++) {
			System.out.println(s1.substring(0,i));
		}
		for(int i=s1.length();i>=0;i--) {
			System.out.println(s1.substring(0,i));
		}
		*/
		String m="Mahathma Karamchand Gandhi";
		//M.K.Gandhi
		System.out.print(m.charAt(0)+".");
		int i = m.indexOf(' ');
		System.out.print(m.charAt(i+1)+".");
		int j=m.lastIndexOf(' ');
		String lw=m.substring(j+1);
		System.out.println(lw);
}
}
