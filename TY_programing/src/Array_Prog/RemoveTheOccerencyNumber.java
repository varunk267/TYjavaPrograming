package Array_Prog;

import java.util.HashMap;

import javax.swing.SpringLayout.Constraints;

public class RemoveTheOccerencyNumber {

	public static void main(String[] args) {
		int [] arr={1,2,3,4,99,1,2,3,4};
		
		HashMap<Integer, Integer> map=new HashMap<>();
		int num=1;
		int count=1;
		for(int i=0; i<arr.length; i++){
			if (map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1 );
			}else {
				map.put(arr[i],count );
			 }			
		}
		for(Integer val:map.values()){
			if(map.get(val)<2){
				System.out.println(val+" "+map.get(val));
			}
		}
	}
}
