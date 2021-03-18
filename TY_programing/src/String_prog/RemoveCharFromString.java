package String_prog;

import java.util.LinkedHashSet;

public class RemoveCharFromString {
	public static void main(String[] args) {
		String s="india";
		char[] ch = s.toCharArray();
		//1st way
		LinkedHashSet<Character>hset=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length; i++){
			hset.add(ch[i]);
		}
		
		for(Character value:hset){
			System.out.print(value);
		}
		System.out.println();
		System.out.println("2nd way");
		
		//2nd way
		for(int i=0;i<ch.length; i++){
			for(int j=i+1; j<ch.length; j++){
				if(ch[i]==ch[j]){
					ch[j]=0;
				}
			}
		}
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=0){
				System.out.print(ch[i]);
			}
		}		
	}
}
