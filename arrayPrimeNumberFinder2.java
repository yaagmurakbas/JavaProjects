import java.util.Scanner;

public class arrayPrimeNumberFinder2 {
	public static void main(String[] args) {
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your number: ");
		int  lastNumber = userNum.nextInt();
		boolean isPrime[] = new boolean[lastNumber + 1];
		 
		for(int i=2; i<isPrime.length; i++){
			 isPrime[i] = true;
			 }
	
		 for(int n=2; n*n<=lastNumber; n++){
			 if(isPrime[n] == true){
				 for(int i=n*n; i<=lastNumber; i+=n){
					 isPrime[i] = false;
				 }
			 }
		 }
		 System.out.print("[ ");
		 for(int i=2; i<=lastNumber; i++){
			 if(isPrime[i] == true){
				 System.out.print(i + " ");
				 }
			 }
		 System.out.print("]");
				     
	}
}