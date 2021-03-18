package String_prog;

import java.util.Scanner;

public class SwapTheValue {
	public static void main(String[] args) {
		int[] arr={10,20,30,40,50};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the key");
		int key=s.nextInt();
		//run the loop for number of key count
		for(int i=0; i<key;i++){
			//swap the 1st value to last value
			for (int j = 0; j < arr.length-1; j++) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		//print the final output
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
