import java.util.Scanner;

public class calculatorClass {
	public static void main(String[] args){
		calculatorAct operation = new calculatorAct();
		Scanner userNum = new Scanner(System.in);
		while(true){
			System.out.print("enter your 2 number: ");
			double userNumber1 = userNum.nextDouble();
			double userNumber2 = userNum.nextDouble();
			System.out.print("enter the operator (1:+ 2:- 3:/ 4:*): ");
			int userOperation = userNum.nextInt();
			
			if(userOperation == 1){
				System.out.print(operation.addition(userNumber1, userNumber2));
				break;
			}
			else if(userOperation == 2){
				System.out.print(operation.subtraction(userNumber1, userNumber2));
				break;
			}
			else if(userOperation == 3){
				System.out.print(operation.division(userNumber1, userNumber2));
				break;
			}
			else if(userOperation == 4){
				System.out.print(operation.multiplication(userNumber1, userNumber2));
				break;
			}
			else{
				System.out.println("enter your numbers again");
				
				
			}
		}
		
	}
	

}
