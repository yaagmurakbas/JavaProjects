import java.util.Scanner;

public class arrayController {
	public static boolean arrayController(int[] userArray, int userGuess){
		for(int i=0; i<5; i++){
			if(userArray[i]!=userGuess){
				return false;
			}
			else{
				break;
			}
		}  
		return true;
	}
	public static void main(String[] args){
		int[] userArray = new int[5];
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter 5 numbers: ");
		
		for(int i=0; i<5 ; i++){
			int userNumber = userNum.nextInt();
			userArray[i] = userNumber;
		}
		System.out.print("enter your guess: ");
		int userGuess = userNum.nextInt(); 
		System.out.print(arrayController(userArray, userGuess));
	}	
}