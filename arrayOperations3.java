import java.util.Scanner;
public class arrayOperations3 {
	public static void main(String[] args) {
	Scanner userNum = new Scanner(System.in);
	System.out.print("enter your numbers (pls take a 0 at the end of your numbers): ");
	
	int userNumber;
	int max = 0;
	int count = 0 ;
	
	while ((userNumber = userNum.nextInt()) != 0){
		if(userNumber>max){
			max = userNumber;
			count = 1;
		    }
		else if(userNumber==max){
			count = count+1;
			}
		}
	
	System.out.print("Max: "+ max +"   Count: "+ count);
	}
}
	
