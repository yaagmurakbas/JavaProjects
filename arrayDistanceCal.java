import java.util.Scanner;
import java.util.Arrays;  
	
public class arrayDistanceCal {
	public static double area(double[] side){
		double s = (side[0] + side[1] + side[2]) / 2;
		double area = Math.sqrt(s*(s-side[0])*(s-side[1])*(s-side[2]));
		return area;
	}
	public static double[] side(double[][] points) {
		double dist;
		double[] side = new double[points.length];
		int index = 0;
		for(int y=0; y<points.length; y++) {
			for(int x = y + 1; x<points.length; x++) {
				dist = Math.sqrt(Math.pow(points[x][0]-points[y][0],2)+Math.pow(points[x][1]-points[y][1],2));
				side[index] = dist;
				index++;
			}
		}
		return side;
	}
	
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your 6 numbers: ");
		double[][] pointCordinateArray = new double[3][2];
		for(int y = 0; y < pointCordinateArray.length; y++){
			for(int x = 0; x<pointCordinateArray[y].length; x++){
				pointCordinateArray[y][x] = userNum.nextDouble();
			}
		}
		for (int i = 1; i <= pointCordinateArray.length; i++) { 
			double[] point = pointCordinateArray[i-1];
			System.out.print("x and y coordinates for corner point " + i + ": ");
			System.out.println(Arrays.toString(point));
			}
		System.out.println("Distances between the given points: " + Arrays.toString(side(pointCordinateArray)));
		double result = area(side(pointCordinateArray));
		if(result == 0) {
			System.out.println("Given points do not form a valid triangle.");
		}
		else {
			System.out.println("Area of the formed triangle: " + area(side(pointCordinateArray)));
		}
	}
}