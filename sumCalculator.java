import java.util.Scanner;

public class sumCalculator{
	public static void main(String[] args)
	{
		Scanner usernum = new Scanner(System.in);
		
		System.out.print("enter the fisrt number: ");
		int number1 = usernum.nextInt();                  
		
		System.out.print("enter the second number: ");
        int number2 = usernum.nextInt();
        
        System.out.print("\nresult(number1*number2) is : "+ number1 * number2);
	}
}
