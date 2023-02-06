import java.util.Scanner;

public class areaAndPerimeterOfTriangleCal2 {
	public static boolean triangleInequalityFunction(int x, int y, int z){
		if ((x<y+z)&&(y<x+z)&&(z<x+y)) {
			return true;
			}
		else {
			return false;
		}
	}	
	public static void triangleFunction(int x, int y, int z) {
		if(triangleInequalityFunction(x,y,z)== true){
			System.out.println("The perimeter of the triangle is " + trianglePerimeterFunction(x,y,z));
			System.out.println("The area of the triangle is " + triangleAreaFunction(x,y,z));
			} 
		else {
			System.out.print("Invalid input ");
			}
	}
	public static double trianglePerimeterFunction(int x, int y, int z) {
		double perimeter = (x+y+z);
		return perimeter;
	}
	public static double triangleAreaFunction(int x, int y, int z) {
		double p = trianglePerimeterFunction(x,y,z)/2;
		double area = Math.sqrt(p*(p-x)*(p-y)*(p-z));
		return area;
	}
	public static void main(String[] args) {
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your radius value: ");
		int a = userNum.nextInt();
		int b = userNum.nextInt();
		int c = userNum.nextInt();
		
		triangleFunction(a,b,c);
	}
	
}
	
	
	
	
	


