import java.util.Scanner;

public class sumOfArray{
	public static int sumArray(int[] array){
		int sum = 0;
		for(int i=0; i<50; i++){
			sum+=array[i];
		}
		return sum;
	}
	
	public static void main(String[] args){
		int[] numberArray = new int[50];
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your number: ");
		int userNumber;
		for(int i=0; i<50; i++){
			userNumber = userNum.nextInt();
			numberArray[i]=userNumber;
			System.out.println(sumArray(numberArray));
		}
	}
}