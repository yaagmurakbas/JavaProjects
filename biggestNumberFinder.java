import java.util.Scanner; 

public class biggestNumberFinder{
	public static int function(int x, int y, int z){
		if ((x>=y)&&(x>=z)){
			return x;
		}
		else if((y>=x)&&(y>=z)){
			return y;
		}
		else{
			return z;
		}
	}
	
	public static void main(String[] arg) {
		Scanner userNum = new Scanner(System.in);
		System.out.print("enter 3 number please take a space between every number: ");
		
		int num1 = userNum.nextInt();
		int num2 = userNum.nextInt();
		int num3 = userNum.nextInt();	
		
		System.out.print(function(num1,num2,num3));
	}

}
