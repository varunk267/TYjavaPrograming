package Integer;

import java.util.Scanner;

import org.omg.PortableServer.RequestProcessingPolicyOperations;

public class Fibonacy {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("enter the count value");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b);
		for(int i=2; i<=num; i++){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
			
		
	}
}
