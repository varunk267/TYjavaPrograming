package String_prog;

public class Split_String {

	public static void main(String[] args) {
		String s="indiaKarnataka";
		String[] ch = s.split("");

		for(int i=0; i<ch.length; i++){
			System.out.print(ch[i]);

		}
		for(int i=0; i<=100; i++){
			System.out.println(i);
		}
		int count=0;
		if(count<=100){
			System.out.println(count++);
			main(null);
		}

	}

}
