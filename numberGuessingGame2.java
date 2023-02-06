import java.util.Scanner;
import java.util.Random;

public class numberGuessingGame2 {
	public static void main(String args[]) {
		Random randomNum = new Random();
		int answer  = randomNum.nextInt(100);
		while (true){
			Scanner userNum = new Scanner(System.in);
			System.out.print("guess the number: ");
			int userGuess = userNum.nextInt();
			
			if(userGuess == answer) {
				System.out.print("good job you win the game :)");
				break;
			}
			else {
				if (userGuess>answer) {
					System.out.println("wrong answer your answer is too high");
				}
				else {
					System.out.println("wrong answer your answer is too low");
				}
			}
		}
	}
}