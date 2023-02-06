import java.util.Scanner;

public class javaHatirlamaProje1 {
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		while(true){
			System.out.print("enter your number(the number is have to be positive): ");
			int userNumber = userNum.nextInt();
			int number = 0;
			
			if(userNumber == 2){
				System.out.println(userNumber + " is a prime number ");
				break;
			}
			for(int i=2; i <userNumber/2; i++){
				if(userNumber%i==0){
					number++;
					break;
				}
			}
			if(number == 0){
				System.out.println(userNumber + " is a prime number ");
				break;
			}
			System.out.println(userNumber +" is NOT a prime number TRY AGAIN!!!");
		}	
	}
}
