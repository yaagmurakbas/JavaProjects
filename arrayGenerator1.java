import java.util.Scanner;

public class arrayGenerator1{
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		double[] [] [] userArray = new double[2][2][2];
		for(int x = 0; x< userArray.length; x++){
			for(int y = 0; y< userArray[x].length; y++){
				for(int z = 0; z< userArray[x][y].length; z++){
					System.out.print("enter your number (the number have to be smaller than 10): ");
					double userNumber = userNum.nextDouble();
					while(userNumber>10){
						System.out.print("enter your number again (the number have to be smaller than 10): ");
						userNumber = userNum.nextDouble();
						}
					userArray[x][y][z] = userNumber;
					System.out.println("userArray["+x+"]["+y+"]["+z+"] = "+ userArray[x][y][z]+" ");
				}
			}
		}
	}
}