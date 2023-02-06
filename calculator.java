import java.util.Scanner;

public class calculator{
	
	public static void main(String[]  arg) {
		Scanner userinfo = new Scanner(System.in);
		System.out.println("enter your first numbers: ");
		int num1 = userinfo.nextInt();
		
		System.out.println("enter your second numbers: ");
		int num2 = userinfo.nextInt();
		
		System.out.println("(+ = 1)\n(- = 2)\n(* = 3)\n(/ = 4)\nenter your operation : ");
		int operation = userinfo.nextInt();
		
		
		if (operation == 1){
			System.out.print("RESULT: "+num1+num2);
			}
		
		else if (operation == 2) {
			System.out.print("RESULT: "+(num1-num2));
			}
		
		else if (operation == 3) {
			System.out.print("RESULT: "+num1*num2);
			}
		
		else if (operation == 4) {
			System.out.print("RESULT: "+num1/num2);
			}
		else {
		System.out.print("pls enter correct format!!!!");	
			}		
	} 

}
