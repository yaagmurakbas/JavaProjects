import java.util.Scanner;

public class pacageShippingCostController {
	public static boolean controlKey(int number){
			if (number<=20) {
				return true;
				}
			else {
				return false;
				}	
			}
	
	public static void main(String[] arg){
		Scanner usernumber = new Scanner(System.in);
		System.out.print("enter your pacage weight: ");
		
		int number = usernumber.nextInt();
	    boolean result = controlKey(number);
	    if (result == true){
	    	if (number<= 2) {
	    		System.out.print("the shipping cost is 5$");
			    }
			else if  (number <= 4) {
				System.out.print("the shipping cost is 9$");
				}
			else if  (number <= 10) {
				System.out.print("the shipping cost is 15$");
				}
			else{
				System.out.print("the shipping cost is 21$");
				}
	    	}
 	    else {
	    	System.out.print("the pacage cannot be shipped");
	    	}
	    }
}
