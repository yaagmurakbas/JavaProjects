import java.util.HashMap;
import java.util.Scanner;
 
public class letterCounterJavaHw{
	public static void main(String[] args){
    	Scanner userInput  = new Scanner(System.in);
		System.out.print("enter your sentences: ");
		String sentence  = userInput.next();
        HashMap<Object, Object> hmap = new HashMap<Object, Object>();
        
        for (int i = 0; i < sentence .length(); i++){
            if(!hmap.containsKey(sentence.charAt(i))){
                  hmap.put(sentence.charAt(i),1); 
            }
            else{
            	int count= (int)hmap.get(sentence.charAt(i));
                hmap.put(sentence.charAt(i),count+1);
            }    
        }
        System.out.println(sentence);
        System.out.print(hmap);
    }
 
}
