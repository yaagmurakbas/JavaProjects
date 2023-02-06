import java.util.Scanner;

public class ebobCal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers to calculate the greatest common divider:");
		int x = input.nextInt();
		int y = input.nextInt();
		int result = gcd(x,y);
		System.out.println("GCD: "+result);
	}
    public static int gcd(int x, int y)
    {
        if (x == 0)
            return y;
         
        return gcd(y%x, x);
    }
}
