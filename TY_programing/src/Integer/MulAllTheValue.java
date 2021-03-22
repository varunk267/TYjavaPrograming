package Integer;

public class MulAllTheValue {

	public static void main(String[] args) {
		int n=1236;
		int count=0;
		while(n!=0){
			n=n/10;
			count++;
		}
		//System.out.println(count);

		for (int i =1; i <=count; i++) {
			int fact=1;
			for (int j =1; j <=count; j++) {
				if(i!=j){
					fact=fact*j;
				}
			}
			System.out.println(fact);
		}
	}
}