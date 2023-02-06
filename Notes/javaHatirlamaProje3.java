import java.util.Scanner;

public class javaHatirlamaProje3 {
	public static void numberFounder(int number, int[] numbers){
		int counter = 0;
		for(int x=0; x<numbers.length; x++){
			if(numbers[x] == number){
				counter++; 
				break;
			}
		}
		if(counter>0){
			System.out.print(number + " number is on the list");
		}
		else{
			System.out.print(number + " number is NOT on the list");
		}
	}

	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your numbers(pls take a space between them): ");
		int counter = 0;
		int[] numbers = new int[5];
		for(int i= 0; i<5; i++){
			numbers[i] = userNum.nextInt();
		}
		System.out.print("enter your other number: ");
		int number = userNum.nextInt();
		numberFounder(number, numbers);
	}
}
