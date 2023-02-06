import java.util.Scanner;

public class javaHatirlamaArray{	
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter the number of the item:  ");
		int item = userNum.nextInt();
		int[] array = new int[item];
		int sum = 0;
		
		System.out.print("enter the numbers: ");
		for(int x = 0; x < array.length; x++){
			array[x] = userNum.nextInt();
			sum += array[x];
			System.out.print(array[x]+" ");
		}
		
		System.out.println("\nthe sum of the array is " + sum+ "\nthe avarage of the array is "+sum/item);
		
		// bu kisimdan sonrasi arrayi basini sona sonunu basa getirmek icin yani ters cevirip yazmak icin olan kod
		
		int[] result = new int[array.length];
		for (int i = 0, j = result.length-1; i < array.length; i++, j--){
			result[j] = array[i];
		}// bundan sonrasi sadece yeni arrayi yazdirmak icin
		for(int a = 0; a < result.length; a++){
			System.out.print(result[a]+" ");
		}
	}
}

