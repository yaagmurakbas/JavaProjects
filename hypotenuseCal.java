import java.util.Scanner;

public class hypotenuseCal {
      public static double hypotenuse(double a, double b) {
		double total = Math.pow(a,2)+Math.pow(b, 2);
return Math.sqrt(total);
	}
      public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the lenght of the sides:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double hypotenuse = hypotenuse(x,y);
		System.out.println("Hypotenuse:"+hypotenuse);
		
	}
}
