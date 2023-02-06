import java.util.Scanner;

public class armstrongNumberChecker {
	public static boolean armstrongNumber(int number){
		double digitSum = 0;
		for(int i = number;i!=0; i/=10){
			digitSum+=Math.pow((i%10), 3);
		}
		if(digitSum == number){
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
		System.out.print(armstrongNumber(userNumber));
		
	}
}