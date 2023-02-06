import java.util.Scanner;

public class lotteryGame{
	public static void main(String[] arg) {
		int number = 45;
		int firstNumber = number%10;
		int secondNumber = number/10;
		
		Scanner userNumber = new Scanner(System.in);
		System.out.print("enter your number: ");
		
		int userN = userNumber.nextInt();
		int firstUserNumber = userN%10;
		int secondUserNumber = userN/10;
		
		if (userN == number) {
			System.out.print("you win the lottery price is 100.000");
		}
		
		else if ((firstUserNumber == secondNumber)&& (secondUserNumber == firstNumber)){
			System.out.print("you win the lottery price is 10.000");
		}
		
		else if ((firstUserNumber == secondNumber)||(secondUserNumber == firstNumber)||(firstUserNumber == firstNumber)||(secondUserNumber == secondNumber)){
			System.out.print("you win the lottery price is 1000");
		}
		
		else {
			System.out.print("you lose it ");
			
		}
		
		
		
		
		
	}

}
