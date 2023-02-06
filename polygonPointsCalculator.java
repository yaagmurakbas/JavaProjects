import java.util.Scanner;
public class polygonPointsCal {
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your radius  and number of sides(please take a space between them): ");
		double userSide = userNum.nextDouble();
		double userRadius = userNum.nextDouble();
		polygonPoints(userSide, userRadius);
		}

	public static void polygonPoints(double side, double radius){
		double angle = 0;
		for(int i =1 ; i<side+1; i=i+1){
			double xPoint = radius * Math.cos(angle);
			double yPoint = radius * Math.sin(angle);
			System.out.println("point" + i + " = " + "[" + xPoint + " , " + yPoint + "]");
			angle = angle+2*Math.PI/side;
			}		
	}
	
}