package Integer;

public class PrimeNumber1to100 {

	public static void main(String[] args) {
		int num=100;
		for(int i=0; i<=num; i++){
			boolean flag=true;
			for(int j=2; j<i; j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.println("this is prime number "+i);
			}else{
				System.out.println("this is not prime number "+i);
			}
		}
	}
}
