import java.util.Scanner;

public class bmiCalculator2{
	public static void bmiCalculater(double weight, double height) {
		double bmi = weight/(height*height);
		if (bmi < 18.5){
			System.out.print("underweight"+" (bmi number: "+bmi+")");
			}
		else if (bmi < 25.0){
			System.out.print("normal"+" (bmi number: "+bmi+")");
			}
		else if (bmi < 30.0){
			System.out.print("overweight"+" (bmi number: "+bmi+")");
			}
		else{
			System.out.print("obese"+" (bmi number: "+bmi+")");
			}
		}
	public static void main(String args[]) {
	Scanner userInfo = new Scanner(System.in);
	System.out.print("please  first enter your height than enter your weight info : ");
    double userH = userInfo.nextInt();
	double userW = userInfo.nextInt();
	
	bmiCalculater(userW, userH);
	}
}