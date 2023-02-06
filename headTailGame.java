import java.util.Random;

public class headTailGame{
	public static String headTail(){
		Random randomNum = new Random();
		int numberR = randomNum.nextInt(10000);
		if (numberR%2 == 0) {
			return "h";
		}
		else {
			return "t";
		}
	}
	public static void main(String args[]) {
		System.out.print("Result is: "+ headTail()+ headTail() + headTail() + headTail()+ headTail());
	}	
}