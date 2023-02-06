import java.util.Scanner;

public class areaAndPerimeterOfCircleCal {
	public static double circlePerimeterFunction(double number) {
		double circlePerimeter= 2*Math.PI*number;
		return circlePerimeter;
		}
    public static double circleAreaFunction(double number) {
    	double circleArea =  Math.PI*Math.pow(number, 2);
    	return circleArea;
    	}
	public static void main(String[] arg) {
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your number: ");
		double userNumber = userNum.nextDouble();

		System.out.println("area of your circle: " + circleAreaFunction(userNumber)+"\nperimeter of your circle: " + circlePerimeterFunction(userNumber) );
		}
	
}

