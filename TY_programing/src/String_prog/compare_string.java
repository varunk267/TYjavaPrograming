package String_prog;

public class compare_string {
	public static void main(String[] args) {
		String s="india";
		String s1="xyz";
		String s2="ixy";
		String s3="i";
		String s4="india";
		String s5="ind";
		
		//1st
		System.out.println(s.compareTo(s1));
		//2nd
		System.out.println(s.compareTo(s2));
		//3rd
		System.out.println(s.compareTo(s3));
		//4th
		System.out.println(s3.compareTo(s));
		//5th
		System.out.println(s.compareTo(s4));
		//6th
		System.out.println(s.compareTo(s5));
	}
}
