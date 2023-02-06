import java.util.Scanner;

public class arrayOperations {
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your numbers");
		int[] userArray = new int[5];
		for(int i = 0; i < userArray.length; i++){
			userArray[i] = userNum.nextInt();
		}
		
		for(int i = 0; i < userArray.length; i++){
			System.out.print(userArray[i]);
		} 
		
		int secondArray[] = copyArray(userArray);
		
		System.out.print(sumArray(userArray));
		
		System.out.print(maxArray(userArray));
		
		System.out.print(minArray(userArray));
		
		System.out.print(shiftingArray(userArray));
	}
	
	public static int[] copyArray(int[] array){
		int[] second = new int[array.length];
		for(int i = 0; i < array.length; i++){
			array[i] = second[i];
		}
		return second;	
	}
	
	public static int sumArray(int[] array){
		int sum = 0;
		for(int i = 0; i<array.length; i++ ){
			sum = sum + i;
			}
		return sum;
	}
	
	public static int maxArray(int[] array){
		int max = 0;
		int index = 0;
		for(int i = 0; i<array.length; i++){
			if (array[i] > max){
				max = array[i];
				index = i;
				}
			}
		return index;
	}
	
	public static int minArray(int[] array){
		int min = 100000;
		int index = 0;
		for(int i = 0; i < array.length; i++){
			if (array[i] < min ){
				min = array[i];
				index = i;
				}
			}
		return index;
	}
	
	public static int[] shiftingArray(int[] array){
		int firstValue = array[0];
		for(int i = 0; i < array.length; i++){ // veya i = 1 den baslamali
			array[i] =array[i+1];    	       // ve   i = i-1 geriye dogru otelenir
		}
		array[0] = array[array.length-1];     // ve i = array.length-1
		return array;
	}
	
}