import java.util.*;
	public class familyIncomeClass{
		public static void main(String[] args){
			Scanner userNum = new Scanner(System.in);
			int familyNumber;
			int i;
			int s;
			
			double income;
			double housing;
			double food;
			
			System.out.print("the number of the  families:  ");
			familyNumber = userNum.nextInt();
			
			Family[] fam = new Family[familyNumber];
			
			for(i=0; i<familyNumber; i++){
				System.out.println("For family "+(i+1)+": ");
				
			    System.out.print("Enter family size: :");
			    s = userNum.nextInt();
			    
			    System.out.print("Enter family income: ");
			    income = userNum.nextDouble();
			    fam[i] = new Family(income,s);
			    }
			
			System.out.print("Enter the average housing cost: ");
			housing = userNum.nextDouble();
			
			System.out.print("Enter the food cost per person:");
			food = userNum.nextDouble();
			
			System.out.println("The poor families are: ");
			for(i = 0; i < familyNumber; i++)
			   if(fam[i].isPoor(housing,food))
			          System.out.println("Family "+(i+1)+" "+fam[i].toString());
	
	}
}
	
class Family{
	private double income;
	private int size;
	
	public Family(double i, int s){
		income=i;
		this.size=s;
	}
	
	boolean isPoor(double house, double food){
		if((house + food * size) > income / 2){
			return true;
		}
		else{
			return false;
		}
	}
	public String toString(){
		return ("Income" + income + "\nFamily size: " + size);
	}
}
