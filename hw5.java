import java.util.Scanner;

public class hw5 {
	public static void main(String[] arg) 
	{
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter a number between 99 and 1000(int): ");
		
		int num = userNum.nextInt();
		int firstDigit = num%10;
		int newNum = num/10;
		int secentDigit = newNum%10;
		int lastDigit = newNum/10;
		int result = firstDigit*secentDigit*lastDigit;
		
		System.out.print("multiplication of all digit in "+ num +" is: "+ result  );
	}
}
