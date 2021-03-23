package Array_Prog;

public class SumOfArrayForDiffLength {
	public static void main(String[] args) {

		int [] a={1,2,3,4};
		int [] b={5,6,7,8,5,6};
		int count = a.length;

		if(count<b.length){
			count=b.length;

		}		
		int [] c=new int[count];
		// logic if 2 array length is same
		if(a.length==b.length){
			for (int i = 0; i < a.length; i++) {
				c[i]=a[i]+b[i];
				System.out.println(c[i]);
			}
			
		// logic id array ais greater
		}else if(a.length>b.length){
			for (int i = 0; i < b.length; i++) {
				c[i]=a[i]+b[i];
				System.out.println(c[i]);
			}
			for (int i = b.length; i < a.length; i++) {
				c[i]=a[i];
				System.out.println(c[i]);
			}
		}else{
			// logic if array b is greater
			for (int i = 0; i < a.length; i++) {
				c[i]=a[i]+b[i];
				System.out.println(c[i]);
			}
			for (int i = a.length; i < b.length; i++) {
				c[i]=b[i];
				System.out.println(c[i]);
			}
		}
	}
}
