package String_prog;

public class ChangeUppertolower {
	public static void main(String[] args) {
		String s="IndIa";
		String out="";
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='I'){
				String ch = s.charAt(i)+"";
				out=out+(ch+"").toLowerCase();
			}else{
				out=out+s.charAt(i);
			}
		}
		System.out.println(out);
		//output="india"
		
		
	}
}
