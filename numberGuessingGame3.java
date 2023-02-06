import java.util.Scanner;
import java.util.Random;


public class numberGuessingGame3 {
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		boolean result = false;
		int number = (int) (Math.random()*100+1);
		
		for(int i=5; i>=0; i--){
			System.out.print("enter your number but be carefull you have only " + i +" try  : ");
			int userNumber = userNum.nextInt();
			if(i>0){
				if(userNumber == number){
					System.out.println("you find the number cong!!!");
					break;
				}
				else if(userNumber != number){
					if(userNumber>number){
						System.out.println("your number is too high, TRY AGAIN!!!!");
					}
					else if (userNumber<number){
						System.out.println("your number is too low, TRY AGAIN!!!!");
					}
				}
				else{
					System.out.println("YOU LOSE THE GAME LOSERRRR ");
				}
			}
		}
	}

}
