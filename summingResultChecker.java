import java.util.Scanner;

public class summingResultChecker{
	public static void main(String[] arg) {
		Scanner userNum = new Scanner(System.in);
		System.out.print("please enter first and second num after enter the result you need to take a space with every number:  ");
		
		int firstNum = userNum.nextInt();
		int secondNum = userNum.nextInt();
		int userResult = userNum.nextInt();
		
		int correctResult = firstNum + secondNum;
		
		System.out.print(correctResult == userResult);
	}

}
