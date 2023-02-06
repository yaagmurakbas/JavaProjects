import java.util.Scanner;

public class fibonacciCal {
	public static int fibonacciN(int index) {
		int num1 = 1;
		int num2 = 1;
		int number;
		for(int i = 1; i <index-1; i++){
			number = num2;
			num2 = num1+num2;
			num1 = number;
			} 
		return num2 ;
		}
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter the index point of your fibonacci number: ");
		int userFiNum = userNum.nextInt();
		
		System.out.print("your fibonacci number is  " + fibonacciN(userFiNum));
		}
}

