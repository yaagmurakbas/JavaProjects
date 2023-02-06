import java.util.Arrays;

public class arrayBubbleSort {
	 public static int [ ] bubbleSort (int[ ] array) {
	        int i;
	        int j;
	        int extraNumber = 0;
	        boolean doesItPass = true;
	        for(i = 1; i<array.length&&doesItPass; i++){
	            for(j = 0; j<array.length-i; j++){
	                doesItPass = false;
	                if (array[ j ] > array[j + 1]) {
	                	extraNumber = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = extraNumber;
	                    doesItPass = true;
	                }
	            }
	        }
	        return array;
	    }
	public static void main(String[] args) {
        int[] numbers = {9,4,2,7};
        System.out.println(Arrays.toString(numbers));
        int[] result = bubbleSort(numbers);
        System.out.println(Arrays.toString(result));
    }
}
