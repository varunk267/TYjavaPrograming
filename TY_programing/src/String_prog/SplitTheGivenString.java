package String_prog;

public class SplitTheGivenString {
	public static void main(String[] args) {
		String s="123@abcd4AYGSF56$xyz";
		char[] ch = s.toCharArray();
		String num="";
		String lower="";
		String spc="";
		String upper="";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0' && ch[i]<='9'){
				num=num+ch[i];
			}else if(ch[i]>='a' && ch[i]<='z'){
				lower=lower+ch[i];
			}else if(ch[i]>='A' && ch[i]<'Z'){
				upper=upper+ch[i];
			}else{
				spc=spc+ch[i];
			}
		}
		System.out.println(num);
		System.out.println(lower);
		System.out.println(spc);
		System.out.println(upper);

	}
}
