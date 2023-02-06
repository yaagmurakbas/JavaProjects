public class signCounter {
	public static void main(String[] args){
		int totalLine = 4;
		for(int line = 0; line<totalLine; line++){
			for(int space = 0; space<line; space++){
				System.out.print(" ");
				}
			for(int star=1; star<=2*(totalLine-line)-1; star++){
				System.out.print("*");
				}
			for(int number = 2*line+1; number>0; number--){
				System.out.print(number);
				}
			System.out.println( );
		}	
	}
}	