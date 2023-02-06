import java.util.Scanner;

public class funtionCal {
	public static void main(String[] arg) {
		// function is y = 4x/3 +4
		int x = -3; 
		int y  = 4;
		
		Scanner userNumber = new Scanner(System.in);
		System.out.print("enter your cordinat numbers first x than y and take a speace beetwen them:  ");
		
		double userX = userNumber.nextDouble();
		double userY = userNumber.nextDouble();
		
		if (((x<= userX)&&(userX <= 0.0))&&((0.0 <= userY)&&(userY <= y))){
			System.out.print("this coordinate ("+userX+" , "+userY+") is in our area");
			}
		else {
			System.out.print("this coordinate ("+userX+userY+") is NOT in our area  ");
		}
	}

}
