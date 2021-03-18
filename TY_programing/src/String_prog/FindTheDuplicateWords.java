package String_prog;

import java.util.HashSet;

public class FindTheDuplicateWords {
	 static void main(String[] args) {
		String s="welcome to india welcome to";
		String[] sp = s.split(" ");

		HashSet<String> hs=new HashSet<String>();
		for(int i=0; i<=sp.length; i++){
			hs.add(sp[i]);
			
		}
		for(String st:hs){
			int count=0;
			for(int i=0;i<sp.length; i++){
				if(st==sp[i]){
					count++;
				}
			}
			System.out.println(st+" "+count);
		}
	}
}
