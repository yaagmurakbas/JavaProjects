import java.util.Scanner;

public class javaHatirlamaProje2 {
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your number: ");
		int userNumber = userNum.nextInt();
		int sum = 0;
		
		for(int i = 1; i<userNumber; i++){
			if(userNumber%i==0){
				sum=sum+i;
			}
		}
		
		if(sum == userNumber){
			System.out.print(userNumber + " is a Perfect Number");
		} 
		else{
			System.out.print(userNumber + " is NOT a Perfect Number");
		}	
	}
}
