import java.util.Scanner;

public class bmiCalculator1{
	public static void main(String[] arg) 
	{
		Scanner userInfo = new Scanner(System.in);
		System.out.print("please  first enter your height than enter your weight info : ");
		
	    double userH = userInfo.nextInt();
		double userW = userInfo.nextInt();
		
		double bmi = userW/(userH*userH);
		
		if (bmi < 18.5){
			System.out.print("underweight");
		}
		else if (bmi < 25.0){
			System.out.print("normal");
		}
		else if (bmi < 30.0){
			System.out.print("overweight");
		}
		else{
			System.out.print("obese");
		}	
	}
}
