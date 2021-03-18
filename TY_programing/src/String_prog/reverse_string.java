package String_prog;

public class reverse_string {
	public static void main(String[] args) {
		String s="INDIA";
		//1 way
		for(int i=s.length()-1; i>=0; i--){

			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		
		//2nd way
		char[] ch = s.toCharArray();
		String rev="";
		for(int i=0; i<ch.length; i++){
			rev=ch[i]+rev;
		}
		System.out.println(rev);
		
		//get count of char without length method or keyword
		String S1="";
		System.out.println(s.compareTo(S1));
		
		System.out.println(S1.compareTo(s));
	}
}
