import java.util.Scanner;
public class stockMarket{
	public static void main(String[] args)
	{
		Scanner usermoney = new Scanner(System.in);
		
		System.out.println(" TL: ");
		double moneyTL = usermoney.nextDouble();
		
		double moneyUSD = moneyTL/8.85;
	    double moneyEuro = moneyTL/10.26;
	    double moneyGBP = moneyTL/12.0;
	    double moneyYen = moneyTL/0.08;
	    double moneyCAD = moneyTL/6.98;
	    double moneyRuble = moneyTL/0.12;
	    
	    System.out.println(moneyTL + " TL =  " + moneyUSD + " USD" );
	    System.out.println(moneyTL + " TL =  " + moneyEuro + " Euro" );
	    System.out.println(moneyTL + " TL =  " + moneyGBP + " GBP" );
	    System.out.println(moneyTL + " TL =  " + moneyYen + " Yen" );
	    System.out.println(moneyTL + " TL =  " + moneyCAD + " CAD" );
	    System.out.println(moneyTL + " TL =  " + moneyRuble + " Ruble" );
	}
	

}
