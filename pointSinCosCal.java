import java.util.Scanner;

public class pointSinCosCal {
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your radius value: ");
		double userRadius = userNum.nextDouble();
		pentagonPoints(userRadius);
		}
		
	public static void pentagonPoints(double radius){
		double angle = Math.PI/2 - 2*Math.PI/5;
		for(int i =1 ; i<6; i=i+1){
			double xPoint = radius * Math.cos(angle);
			double yPoint = radius * Math.sin(angle);
			System.out.println("point" + i + " = " + "[" + xPoint + " , " + yPoint + "]");
			angle = angle+2*Math.PI/5;
			}		
	}
}