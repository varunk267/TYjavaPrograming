package Integer;

public class MulGivenNum {

	public static void main(String[] args) {
		int n=2546;
		int n1=n;
		int count=0;
		while(n1!=0){
			count++;
			n1=n1/10;
			
		}
		//System.out.println(count);
		for (int i = 1; i <=count; i++) {
			int mul=1;
			 n1=n;
			for (int j = 1; j <=count; j++) {
				int mod=n1%10;
				if(i!=j){
					mul=mul*mod;
				}
				n1=n1/10;
			}
			System.out.println(mul);
		}
	}
}
