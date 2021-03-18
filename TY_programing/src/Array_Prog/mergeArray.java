package Array_Prog;

public class mergeArray {

	public static void main(String[] args) {
		int arr[]={5,10,15,20};
		int arr1[]={25,30,35};

		int length=arr.length+arr1.length;
		//System.out.println(length);
		int sum[]=new int[length];
		for(int i=0; i<arr.length; i++){
			sum[i]=arr[i];
		}
		int count=0;
		for(int i=length-(arr.length-1); i<=length-1; i++){
			sum[i]=arr1[count];
			count++;
		}
		for(int i=0;i<sum.length; i++){
			System.out.println(sum[i]);
		}
	}
}
