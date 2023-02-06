public class arrayGenerator2 {
	public static int[] selectionArray(int[] array){
		int minIndex;
		int extraValue = 0;
		for(int i  = 0; i<array.length; i++){
			minIndex = i;
			for(int a = i+1; a < array.length; a++){
				if(array[minIndex] >= array[a]){
					extraValue = array[i]; 
					array[i] = array[a];
					array[a] = extraValue;
					}
				}
			}
		return array;
	}
	public static void main(String[] args){
		int[] randomArray = new int[10];
		for(int i  = 0; i<randomArray.length; i++){
			randomArray[i] = (int) (1 + Math.random()*99);
			}
		System.out.print("{ ");
		for(int i = 0; i < randomArray.length; i++){
			System.out.print(randomArray[i] + " ");
		} 	
		System.out.println("}");
		
		int[] correctArray = selectionArray(randomArray);
		
		System.out.print("{ ");
		for(int i = 0; i < correctArray.length; i++){
			System.out.print(correctArray[i] + " ");
		} 	
		System.out.print("}");
	}	
}