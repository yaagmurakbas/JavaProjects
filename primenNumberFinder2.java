 import java.util.Scanner;

public class primenNumberFinder2{
	public static boolean primeNumberinator(int number){
		if(number==1){
			return false;
		}
		for(int i = 2; i<number; i++){
			if(number%i==0){
				return false;
				}
			}
			return true;
	}
	/* int i  = 1;
	 while(i<number){
       i = i + 1;
	     if(number%i==0){
			return false;
		}
		else{
			return true;
		}
	 }
	 */
	public static void main(String[] args) {
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your number: ");
		int userNumber = userNum.nextInt();
		System.out.print(primeNumberinator(userNumber));		
	}
	
	
	   
}

