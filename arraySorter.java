import java.util.Arrays;

public class arraySorter {
    public static int[] arraySorter(int[] array ) {
    	int extraNumber; 
    	int j;
        for (int i = 1; i<array.length; i++){
        	extraNumber = array[i];
            j = i-1;
            while(j >= 0 && array[j]>extraNumber){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = extraNumber;
        }
        return array;
    }
	public static void main(String[] args) {
    	int [] arrayNumbers = {5,2,9,1};
    	System.out.println(Arrays.toString(arrayNumbers));
        int [] output = arraySorter(arrayNumbers);
        System.out.print(Arrays.toString(output));
    }
}
