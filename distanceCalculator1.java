import java.util.Scanner;
import java.lang.Math;

public class distanceCalculator1 {
	public static double function(int x1, int y1, int x2, int y2){
		double result = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		return result;
	}
    public static void main(String[] arg) {
    	Scanner userC = new Scanner(System.in);
    	System.out.println("enter your 2 coordiates x and y value (example:x1 y1 x2 y2):  ");
    	
    	int x1 = userC.nextInt();
    	int y1 = userC.nextInt();
    	int x2 = userC.nextInt();
    	int y2 = userC.nextInt();
    	
    	System.out.println(function(x1,y1,x2,y2));
    	
    }
}
