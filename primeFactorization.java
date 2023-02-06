import java.util.Scanner;

public class primeFactorization{
	public static int numberDigits(int number) {
		int digit =0;
		while(number!=0){
			number = number/10; 
			digit = digit+1;
			}
		return digit;
		}
	
	public static void primeFactorization(int number) {
		int i = 2;
		while(number!=1){
			int digits = numberDigits(number);
			if (number%i==0){
				System.out.printf("%" + digits + "d | %d\n", number, i);
				number = number/i;
				}
			else{
				i = i+1;
				}
			}
	   System.out.print(1 + " | ");
	   }
	
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your number: ");
		int userNumber = userNum.nextInt();
		primeFactorization(userNumber);
		}
}