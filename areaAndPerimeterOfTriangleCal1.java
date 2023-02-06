import java.util.Scanner;

public class areaAndPerimeterOfTriangleCal1 {
	public static void main(String[] arg) {
		Scanner numbers = new Scanner(System.in);
		System.out.print("enter your traingle numbers: ");
		
		int a = numbers.nextInt();
		int b = numbers.nextInt();
		int c = numbers.nextInt();
		
		if ((a<b+c)&&(b<a+c)&&(c<a+b)) {
			int perimeter = a+b+c;
			double x = perimeter/2;
			double area = Math.sqrt(x*(x-a)*(x-b)*(x-c));
			double roundedArea = Math.round(100 * area) / 100.0;
			System.out.println("The perimeter of the triangle is " + perimeter);
			System.out.println("The area of the triangle is " + roundedArea);
			}
		else{
			System.out.println("Invalid input");	
		}
	}
}
