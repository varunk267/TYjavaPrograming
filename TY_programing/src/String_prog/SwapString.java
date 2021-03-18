package String_prog;

public class SwapString {
	public static void main(String[] args) {
		String s="welcome to testyantra";
		
		String[] sp = s.split(" ");
		
		String temp=sp[0];
		sp[0]=sp[sp.length-1];
		sp[sp.length-1]=temp;
		
		String store="";
		for(String c:sp){
			 store=store+c+" ";			
		}
		System.out.print(store.trim());
		
		//without 3rd variable
		
		//sp[0]=sp[0]+sp[2];
		//sp[2]=(sp[0].length())-(sp[2]);
	}
}
