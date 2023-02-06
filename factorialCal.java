import java.util.Scanner ;
public class factorialCal {
	public static Integer factorialCal(int number){
		int result = 1;
		if (number>0) {
			for(int i =1; i<number+1; i=i+1) {
				result = i*result;
				}
			/* OTHER WAY WITH USING WHILE METHODS
			 int i = 1;
			 while(i<number+1){
			      result = i*result;
			      i = i+1;
			      }        */
			}
		else if (number<0){
				result = -1;
			}
		else {
			result = 0;
			}
		return result;
		
	}
	public static void main(String[] args) {
		Scanner userNum = new Scanner(System.in);
		System.out.print("eneter your number: ");
		int userNumber = userNum.nextInt();
		System.out.print("factorial of your numbers is "+"["+userNumber+"!] "+factorialCal(userNumber));
		
	}	
}