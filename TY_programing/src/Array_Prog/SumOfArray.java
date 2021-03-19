package Array_Prog;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[]={10,20,30,10};
		int arr1[]={5,10,15};
		
		//initialize empty array
		int sum[]=new int[arr.length];
		
		//run the loop and add 2 array and store it in sum[]
		for(int i=0;i<arr.length-1; i++)
		{
			sum[i]=arr[i]+arr1[i];
		}
		
		//print the sum array
		for(int i=0; i<sum.length; i++)
		{
		System.out.println(sum[i]);
		}
		
		
	}
}
