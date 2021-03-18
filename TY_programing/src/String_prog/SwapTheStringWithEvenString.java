package String_prog;

public class SwapTheStringWithEvenString {
	public static void main(String[] args) {
		String s="welcome to india mandya";
		String[] st = s.split(" ");
		//for even index value
		for(int i=0; i<st.length; i++){
			if(i%2==0){
				String temp=st[i];
				st[i]=st[i+1];
				st[i+1]=temp;
			}
		}
		for(int i=0; i<st.length; i++){
			System.out.print(st[i]+" ");
		}
		System.out.println();


		//for odd index values
		
		String s1="welcome to india";
		String[] st1 = s1.split(" ");
		int n = st1.length-1;
		for(int i=0; i<n; i++){
		if(i%2!=0){
			
			String temp=st1[0];
			st1[0]=st1[1];
			st1[1]=temp;
		}
		}
		for (int j = 0; j < st1.length; j++) {
			System.out.print(st1[j]+" ");
		}
	}
}
