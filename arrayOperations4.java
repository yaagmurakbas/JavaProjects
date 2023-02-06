public class arrayOperations4 {
	public static void main(String[] args){
		int firstPartLines= 4;
		for(int line = 1;  line <= firstPartLines; line++ ){
			for (int i = 0; i <firstPartLines - line; i++){
				System.out.print(" ");
				}
			for(int i= 0; i < 2*line-1; i ++){
				System.out.print("*");
				}
			System.out.println( );
			}
		
		int secondPartLines = 5;
		for(int lines = 1; lines <= secondPartLines; lines++){
			for(int i = 0; i<2;i++){
				System.out.print(" ");
				}
			for(int i = 0; i<3; i++){
				System.out.print("*");
				}
			System.out.println();	
			}
	}
}