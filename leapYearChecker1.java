import java.util.Scanner;

public class leapYearController1 {
	public static void main(String[] arg) {
		Scanner year = new Scanner(System.in);
		System.out.print("enter your year info: ");
		
		int userYear = year.nextInt();
		
		if ((userYear%400==0) || (userYear%4==0 && userYear%100!=0)) {
			System.out.print(userYear + " is a Leap year ");
		}
		else {
			System.out.print(userYear + " is not a Leap year");
		}
	}
}
