package Array_Prog;

public class Array_max {
	public static void main(String[] args) {
		int arr[]={10,20,15,6,8};
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		//max value
		System.out.println(arr[0]);

		//min value
		
			
		System.out.println(arr[arr.length-1]);
		
		//2nd min value
		System.out.println(arr[arr.length-2]);

		//2nd max value
		System.out.println(arr[1]);

		System.out.println(arr[0]+arr[1]+arr[2]);

		int sum=0;
		//get the 3 max value from array 
		for(int i=0; i<=2; i++){

			sum=sum+arr[i];
		}
		System.out.println(sum);


		int minsum=0;
		//get the sum of first 3 min value
		for(int i=arr.length-1; i>=arr.length-3; i--){
			minsum=minsum+arr[i];
		}
		System.out.println(minsum);
	}
	
}
