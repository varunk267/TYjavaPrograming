package String_prog;

import java.util.HashSet;

public class FindTheNoOfDuplicateChar {
	public static void main(String[] args) {
		String s="nithin";
		//store the char in array
		char[] ch = s.toCharArray();
		//create dummy hashset
		HashSet<Character> set=new HashSet<Character> ();
		//add value from char array to hashset by useing for loop
		for(int i=0; i<ch.length; i++){
			set.add(ch[i]);
		}
		//run the loop for every char in hashset
		int count1=0;
		for(char c1:set)
		{
			//initialize the count to find the repetation
			int count=0;
			for(int i=0; i<ch.length; i++)
			{
				//compare the hashset-char with char-array
				if(c1==ch[i]){
					count++;
				}
			}
			if(count>1){
				count1++;
			}
		}
		System.out.println(count1);
	}
}
