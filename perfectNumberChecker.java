import java.util.Scanner;

public class perfectNumberChecker {
	public static boolean perfectNumber(int number){
		int numberSum = 0;
		for(int i=1; i<=number/2 ; i=i+1){
			if(number%i==0){
				numberSum = numberSum+i;
			}
		}
		if(numberSum == number){
			return true;
			}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your number: ");
		int userNumber = userNum.nextInt();
		System.out.println("if the result is true your number is a perfect number, if its false its not a perfect number ");
		System.out.print(perfectNumber(userNumber));
	}
}




