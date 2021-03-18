package String_prog;

public class ReverseTheWordInString {
	public static void main(String[] args) {
		String s="welcome to india welcome to mandya";
		String[] words = s.split(" ");

		for(int i=0;i<words.length; i++){
			for (int j = i+1; j < words.length; j++) {
				if(words[i].equals(words[j])){
					words[j]="0";
				}
			}
		}
		for (int i = 0; i < words.length; i++) {
			if(words[i]!="0"){
				System.out.print(words[i]+" ");
			}
		}
	}
}
