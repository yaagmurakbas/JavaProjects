public class primenNumberFinder1{
	public static int primeinator(int a, int b){
		int primeNumber = 0;
		for(int x = a; x > b; x = x -2){
			int counter = 0;
			for(int i  = 2; i < x/2; i++){
				if(x%i==0){
					counter++;
					}
				}
			if(counter==0){
				primeNumber = x;
				break;
			} 
		}
		return primeNumber;
	}
	public static void main(String[] args){
		System.out.print("biggest prime number between 100 and 999 is : " + primeinator(999,100) );
	}
}