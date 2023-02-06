import java.util.Scanner;
public class sumOfNumBeetweenTwoNum{
	public static Integer sumFunction(int number1, int number2) {
		int result = 0;
		while (number1!=number2+1) {
			result = number1 + result;
			number1 = number1+1;
			}
		return result;
	}
	public static void main(String[] args) {
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your 2 number please take a speace between them: ");
		int userNum1 = userNum.nextInt();
		int userNum2 = userNum.nextInt();
		System.out.print("sum of your numbers from ["+userNum1+" , "+userNum2+"]: "+ sumFunction(userNum1, userNum2));
	}
}