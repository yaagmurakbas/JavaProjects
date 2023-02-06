import java.util.Scanner;

public class arrayPrinter {
	public static void main(String[] args){
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter your number: ");
		
		double tripleArray[][][] = new double [2] [3] [2];
		for(int x = 0; x<tripleArray.length; x++){
			for(int y = 0; y<tripleArray[x].length; y++){
				for(int z = 0; z<tripleArray[x][y].length; z++){
					tripleArray[x][y][z]= (double) userNum.nextInt();
					System.out.print("tripleArray["+x+"]["+y+"]["+z+"]="+ tripleArray[x][y][z]+" ");
				}
				System.out.println( );
			}
			System.out.println( );
		}
		
	}
}