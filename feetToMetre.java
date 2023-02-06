import java.util.Scanner;
public class feetToMetre {
	public static void main (String[] args) {
		Scanner userNum =new Scanner(System.in);
		System.out.print("enter your number: ");
		
		Double feet = userNum.nextDouble();
		Double metre = feet* 0.305;
		
		System.out.print(feet+ " feet = "+ metre +" metre");	
	}
}
