package String_prog;

public class UppertoLower_LowertoUpper {
	public static void main(String[] args) {
		String s="India";
		String out="";
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='i'){
				char ch = s.charAt(i);
				out=out+(ch+"").toUpperCase();
			}else if(s.charAt(i)=='I'){
				char ch1=s.charAt(i);
				out=out+(ch1+"").toLowerCase();
			}else{
				out=out+s.charAt(i);
			}
		}
		System.out.println(out);
	}
}
