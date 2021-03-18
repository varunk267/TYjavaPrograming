package String_prog;

import java.util.HashSet;

public class SumOfNumberArray {
	public static void main(String[] args) {
		int []arr={1,3,4,5,2,6,9,7};
		int find=7;

		for(int i=0;i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]+arr[j]==find){
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
		System.out.println("2nd method output ");

		//2nd way to get by removing duplicate
		int [] arr1={1,3,4,5,2,6,9,7,4,3,2,1};
		//create dummy hashset 
		HashSet<Integer> hs=new HashSet<Integer>();
		//add arr1 values to hashset
		for(int i=0;i<arr1.length; i++){
			hs.add(arr1[i]);
		}
		//create dummy array and add hashset value to 2nd array
		int [] arr2=new int[hs.size()];
		//create global variable to pass the index value inside the array
		int count=0;
		//call for each and add hashset value into 2nd array
		for( Integer value:hs){
			arr2[count]=value;
			count++;			
		}
		//compare the value with new array
		for(int i=0;i<arr2.length; i++){
			for(int j=i+1; j<arr2.length; j++){
				if(arr2[i]+arr2[j]==find){
					System.out.println(arr2[i]+" "+arr2[j]);
				}
			}
		}
	}
}

