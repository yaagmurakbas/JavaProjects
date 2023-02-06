import java.util.Scanner;
import java.util.Random;

public class numberGuessingGame1 {
	public static void main(String[] args) {
		Random randomNum = new Random();
		int num1 = randomNum.nextInt(10);
		int num2 = randomNum.nextInt(10);
		int result = num1 + num2;
		
		Scanner userNum = new Scanner(System.in);
		System.out.print("Example \nwhat is "+num1+" + "+num2+" = ");
		int userAnswer = userNum.nextInt();
		
		while(userAnswer != result){
			System.out.println("Wrong answer try again Loser :)");
			System.out.print("Example \nwhat is "+num1+" + "+num2+" = ");
			userAnswer = userNum.nextInt();
			}
		System.out.print("GOOD JOB :)");
		}
}