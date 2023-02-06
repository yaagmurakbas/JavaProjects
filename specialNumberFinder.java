public class specialNumberFinder{
	public static void main(String[] args){
		int numbersSum = 0;
		int numberSum = 0;
		for(int number = 2; number<1000; number++){
			for(int i=1; i<=number ; i++){
				if(number%i==0){
					numberSum = numberSum+i;
				}
			}
			if(numberSum == number){
				numbersSum = numbersSum+number; 
			}
		}
		System.out.print("sum of number which is the sum of its prime divisors is equal to itself from 1 to 1000: "+ numbersSum);
	}
}