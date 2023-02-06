import java.util.Scanner;
public class sumOfDigits2{
	public static Integer sumOfDigits(int number) {
		int result = 0;
		while(number!=0) {
			result = number%10+result;
			number = number/10;
			}
		return result;
	}
	public static void main(String[] args) {
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your number: ");
		int userNumber = userNum.nextInt();
		System.out.println("sum of your numbers digits is: " + sumOfDigits(userNumber));
		
	}

	
}
