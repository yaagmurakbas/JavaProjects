import java.util.Scanner;

public class celsiusToFahrenheit{
	public static void main(String[] args)
	{
		Scanner userNum = new Scanner(System.in);
		
		System.out.println("enter the celsius: ");
		double celsius = userNum.nextDouble();
		
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.println("\n fahrenheit : "+ fahrenheit);	
	}

}

