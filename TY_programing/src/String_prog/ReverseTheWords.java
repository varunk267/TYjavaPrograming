package String_prog;

public class ReverseTheWords {
	public static void main(String[] args) {
		String s="my name is nithin";
		//1st way
		String[] s1 = s.split(" ");
		for(int i=s1.length-1; i>=0;i--){

			System.out.print(s1[i]+" ");
		}
		System.out.println();
		
		//2nd way
		String tab="	nithin is power";
		String ta = tab.trim();
		String[] t = ta.split(" ");
		
		for(int i=0; i<=t.length-1; i++){
			System.out.print(t[i]+" ");
		}
		System.out.println();
		
		//3rd way
		String rev="";
		for(int i=s1.length-1; i>=0; i--){
			rev=rev+" "+s1[i];
		}
		System.out.println(rev.trim());
		
		
	}
}

//output: nithin is name my 
