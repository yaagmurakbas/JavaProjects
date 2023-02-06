import java.util.Scanner;

public class leapYearChecker2 {
	public static boolean functionYear(int number) {
    	if((number%400 == 0)||(number%4 == 0 && number%100 !=0 )){
    		return true;
    	}
    	else{
    		return false;
    	}	
    }
	public static void main(String[] arg) { 
		Scanner usernumber = new Scanner(System.in);
		System.out.print("enter your year info: ");
		int useryear = usernumber.nextInt();
		System.out.print(functionYear(useryear));
	}
}





