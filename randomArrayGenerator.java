public class randomArrayGenerator{
	public static void main(String[] args){
		int[][] doubleArray = new int[7][8];
		for(int y = 0; y<doubleArray.length; y++){
			for(int x = 0; x<doubleArray[y].length; x++){
				doubleArray [y] [x]= (int) (Math.random()*63+15);
				System.out.print(doubleArray[y][x] +" ");
			}
			System.out.println( );
		}
	}	
}