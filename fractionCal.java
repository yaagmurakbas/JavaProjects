import java.util.Scanner;

public class fractionCal {
	public static void main(String[] args) {
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your numerator and denominator value please take a space between them: ");
		int numerator = userNum.nextInt();
		int dominator = userNum.nextInt();
		
		fractionFunction(numerator,dominator);
		}
	public static void fractionFunction(int numerator, int denominator) {
		if(numerator<denominator) {
			System.out.println("proper fraction = "+ numerator+"/"+denominator);
			}
		else {
			System.out.print("improper fraction = "+ numerator+ "/" + denominator);
			if(numerator%denominator==0) {
				System.out.print(" And this fraction is equal to = "+ numerator/denominator);
				}
			else {
				System.out.print(" And this fraction is an mixed function = "+ numerator/denominator + "+" + numerator%denominator+"/"+denominator);
				}
			}
		}

}
