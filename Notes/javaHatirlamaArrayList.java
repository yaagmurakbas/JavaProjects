import  java.util.ArrayList;

public class javaHatirlamaArrayList {
	public static void main(String[] args){
		int[] arrayI = {10, 20, 30, 40, 50};
		
		ArrayList<String> arrayL = new ArrayList<String>(); //arraylist olusturma
		
		arrayL.add("babanen");
		arrayL.add("nin");             //eleme yapma
		arrayL.add("amk");
		
		//arrayL.remove(2);             // index numarasiyla cikarma yapma 
		//arrayL.remove("amk");         // isim ile cikarma yapma
		
		arrayL.size();               // listin uzunlugunu bulmak icin  
		
		arrayL.indexOf("babanen");   // herhangi bir elemanin index numarasini bulmak icin 
		
		
		
		for(int i = 0; i<arrayI.length; i++){
			System.out.print(arrayL.get(i));
		}	
		for(String s:arrayL){
			System.out.println(s);
		}
	}

} 