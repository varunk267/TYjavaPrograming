package String_prog;

public class ChangeCharIntoUpper {
	public static void main(String[] args) {
		String s="indiaindia";
		//1st way
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length; i++){
			if(ch[i]=='i'){
				ch[i]='I';
			}
		}
		for(int i=0; i<ch.length; i++){
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		//2nd way follow this way
		String m="";
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='i'){
				char c=s.charAt(i);
				m=m+(c+"").toUpperCase();
			}else{
				m=m+s.charAt(i);
			}
		}
		System.out.println(m);
	}
	
}
