package String_prog;

public class ChangeFirstCharToUpperCase {

	public static void main(String[] args) {
		
		String s="welcome to india";
		String[] st = s.split(" ");
		String Upper="";
		for(int i=0; i<st.length; i++){
			String word = st[i];
			

				  char fchar = word.charAt(0);
				Upper=Upper+(fchar+"").toUpperCase();
				Upper=Upper+st[i].substring(1);
				System.out.print(" ");
			
			
		}
		
		System.out.println(Upper+" ");
		
	}
}
