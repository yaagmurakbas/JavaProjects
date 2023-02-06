public class  largestPerfectNumberFinder{
	public static void main(String[] args){
		for(int number = 999; number>100; number--){
			int sum = 0;
			for(int i =1; i< number; i++ ){
				if(number%i==0){
					sum+=i;	
				}	
			}
			if(number==sum){
				System.out.print("largest perfect number is : " + number);
				break;
			}
		}	
	}
}