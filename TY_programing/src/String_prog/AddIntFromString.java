package String_prog;

public class AddIntFromString {
	public static void main(String[] args) {
		String s="ghskhs123ghsdvs4";
		char[] ch = s.toCharArray();
		int sum=0;
		for(int i=0; i<ch.length;i++){
			if(ch[i]>='0' && ch[i]<='9'){
				int n = ch[i]-48;//49-48
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}
}
