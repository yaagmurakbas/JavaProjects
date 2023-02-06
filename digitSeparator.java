import java.util.Scanner;

public class digitSeparator{
	public static void main(String[] arg) {
		Scanner userNumber = new Scanner(System.in);
		System.out.print("enter your number: ");
		int number = userNumber.nextInt();
		int first = number/100;
		int second = ((number%100)/10);
		int third = number%10;
		System.out.print("first number is " +  first + " second number is " + second + " third number is " + third);
	}

}
