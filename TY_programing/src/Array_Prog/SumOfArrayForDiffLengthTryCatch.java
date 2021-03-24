package Array_Prog;

import java.lang.reflect.Method;

public class SumOfArrayForDiffLengthTryCatch {

	public static void main(String[] args) throws Throwable {
		int [] a={1,2,3,4};
		int [] b={5,6,7,8,5,6};
		
		int count = b.length;
		if(count<b.length){
			count=a.length;
		}		
		int []c=new int[count];

		for (int i = 0; i < count; i++) {
			try {
				c[i]=a[i]+b[i];
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				try {
					c[i]=a[i];
				} catch (ArrayIndexOutOfBoundsException e1){
					c[i]=b[i];
				}
			}
			System.out.println(c[i]);
		}
	}
}
