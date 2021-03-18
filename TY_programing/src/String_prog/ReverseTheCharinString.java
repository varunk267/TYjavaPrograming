package String_prog;

public class ReverseTheCharinString {
	public static void main(String[] args) {
		String s="welcome to india";
		String[] st = s.split(" ");
		String rev="";
		//run the loop to get single string value
		for (int i = 0; i < st.length; i++) {
			//store the string value in 'a' variable
			String a=st[i];
			//run the loop to reverse the take String(so take the length and run the loop decrimentaly) 
			for (int j = a.length()-1; j >=0; j--) {
				//use charAt method to get single string from reverse and store the value in 'ch' variable
				char ch = a.charAt(j);
				//concat with the declared string
				rev=rev+ch;
			}
			//add space after every itteration
			rev=rev+" ";
		}
		System.out.println(rev);
	}
}
