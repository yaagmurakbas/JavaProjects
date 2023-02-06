import java.util.Scanner;

public class multipyTwoNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers to multipy:");
		int x = input.nextInt();
		int y = input.nextInt();
		int result = isMultiple(x,y);
		System.out.println("Result: "+result);
	}
	public static int isMultiple(int x,int y) {
		return x*y;
	}
}
