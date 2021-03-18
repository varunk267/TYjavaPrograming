package String_prog;

public class Split_String {
	public static void main(String[] args) {
		String s="indiaKarnataka";
		
		String[] split = s.split("a" );
		for(int i=0;i<split.length; i++){
		System.out.println(split[i]);
		}
	}
}
