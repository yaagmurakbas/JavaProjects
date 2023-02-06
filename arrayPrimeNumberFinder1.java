import java.util.Scanner;
import java.util.Arrays;

public class  arrayPrimeNumberFinder1 {
	public static int[] primeArray(int number){
		int[] userArray = new int[number];
		userArray[0] = 2;
		int index = 1;
		int x = 0;
		for(int numbers = 3; numbers < userArray.length-1 ; numbers++){
			x = 0;
			for(int i = 2; i < numbers; i++){
				if(numbers%i==0){
					x++;
					break;
				}
			}
			if(x==0){
				userArray[index] = numbers;
				index++;
				}	
		}
		return userArray;
	}
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your number: ");
		int userNumber = userNum.nextInt();
		System.out.print(Arrays.toString(primeArray(userNumber)));		
	}
}
