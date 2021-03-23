package Integer;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("please enter the number below");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=2; i<num; i++){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		if(flag==true){
			System.out.println("its a prime number");
		}else{
			System.out.println("its not a prime number");
		}
	}
}
