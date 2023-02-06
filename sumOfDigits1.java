import java.util.Scanner;

public class sumOfDigits1 {
	public static void main(String[] arg) {
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your number : ");
		int userNumber = userNum.nextInt();
		System.out.println(numberFunction(userNumber));
		}
	public static double numberFunction(int number) {
	    double first = Math.pow(number/100, 2) ;
	    double second = Math.pow(((number%100)/10), 2);
		double third = Math.pow(number%10, 2);
		double result = first+second+third;
		
		return result;	
	}

}
