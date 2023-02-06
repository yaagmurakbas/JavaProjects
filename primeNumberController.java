import java.util.Scanner;

public class primeNumberController{
	public static void main(String[] args) {
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your index number: ");
		int userIndex= userNum.nextInt();
        int primeNumber = 2;
		int primeIndex = 1;
		
		while(userIndex>2){
			primeNumber++;
			boolean primeOrNot = true;
			for(int i = 2; i<=primeNumber/2; i++){
				if(primeNumber%i==0){
					primeOrNot = false;
					break;
					}
				if(primeOrNot){
					userIndex--;
					}
				}
			}
		System.out.print(primeNumber);
		}
}

	
	