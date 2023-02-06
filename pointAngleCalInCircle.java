import java.util.Scanner;

public class pointAngleCalInCircle {
	public static void main(String[] args) {
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your radius value: ");
		Double userRadius = userNum.nextDouble();
		circlePointFunction(userRadius);
		}
	public static double circleX(double radius, double angle) {
		double x = radius*Math.cos(angle);
		return x;
		}
	public static double circleY(double radius, double angle) {
		double y = radius*Math.sin(angle);
		return y;
		}
	public static void circlePointFunction(double radius) {
		double angle1 = Math.PI/2 - 2*Math.PI/5;
		System.out.println("point1 = "+circleX(radius, angle1)+" , "+ circleY(radius, angle1));
		
		double angle2 = angle1 + 2*Math.PI/5;
		System.out.println("point2 = "+circleX(radius, angle2)+" , "+ circleY(radius, angle2));
		
		double angle3 = angle2 + 2*Math.PI/5;
		System.out.println("point3 = "+circleX(radius, angle3)+" , "+ circleY(radius, angle3));
		
		double angle4 = angle3 + 2*Math.PI/5;
		System.out.println("point4 = "+circleX(radius, angle4)+" , "+ circleY(radius, angle4));
		
		double angle5 = angle4 + 2*Math.PI/5;
		System.out.println("point5 = "+circleX(radius, angle5)+" , "+ circleY(radius, angle5));
	}

}
