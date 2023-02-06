import java.util.Scanner;

public class tipCalculator {
	public static void main(String[] arg)
	{
		Scanner totalNum = new Scanner(System.in);
		System.out.print("enter your total number and tip rate : ");
		
		double total = totalNum.nextDouble();
		double tiprate = totalNum.nextDouble();
		
		double tip = total*tiprate/100;
		double newTotal = total + tip;
		
		System.out.print("tip is :"+ tip+ " and total is: "+ newTotal);
	}
}
