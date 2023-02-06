
public class javaHatirlama {
	public static void main(String[] args){
		//byte en kucuk ondan sonra int ondan sonra long ama sana buyuk veri gelmediginde 
		//int kullanman yeterli herey icin long kullanirsa fazla ram harcar
		
		//float ve doubledir ondalikli sayilar 
		
		//char tek bitelik veri tutur ve tek tirnak icinde kullanilir 
		//string birden fazla deger olan  primitive typrs
		//blooean true false iste amk 
		
		
		
		//EN BUYUK SAYI BULMA 1TH WAY
		int x = 5;
		int y = 7;
		int z = 9;
		
		if(x>z && x>y){
			System.out.println("biggest number is x");	
		}
		else if(y>x && y>z){
			System.out.println("biggest number is y");
		}
		else{
			System.out.println("biggest number is z");
		}
		
		
		//EN BUYUJ SAYI BULMA 2TH WAY 
		int a = 5;
		int b = 7;
		int c = 9;
		int biggestNumber = a;
		
		if(biggestNumber<b){
			biggestNumber = b;
		}
		if(biggestNumber<c){
			biggestNumber = c;
		}
		System.out.print("biggest number is " + biggestNumber);
		
		
		
		//FOR WHILE 
		for(int i = 1; i <10; i++){
			System.out.println(i);
		}
		System.out.print("end of the for loop ");
		
		int i = 1;
		while(i < 10){
			System.out.println(i);
			i++;
		}
		System.out.println("end of the while loop ");
		
		
		
		//ARRAYS
		//1
		String[] students = new String[3];
		students[0] = "babanen";
		students[1] = "in";		
		students[2] = "AMK";	
		
		for(int q=0; q<students.length; q++){
			System.out.println(students[q]);	
		}
		
		//2
		double[] numbers = {1.2, 1.3, 4.3, 5.6};
		double total = 0; 
		double max = numbers[0];
		for(double number:numbers){
			System.out.println(number);
			total=total+number;
			if(max<number){
				max = number;
			}
		}
		System.out.println(total);
		System.out.println(max);
		
		//3
		String[][] cities = new String[3][3];
		cities[0][0] = "istanbul";
		cities[0][1] = "bursa";
		cities[0][2] = "kocaeli";
		cities[1][0] = "ankara";
		cities[1][1] = "konya";
		cities[1][2] = "kayseri";
		cities[2][0] = "diyarbakur";
		cities[2][1] = "mardin";
		cities[2][2] = "gaziantep";
		
		for(int w=0; w<cities.length; w++){
			for(int v=0; v<cities[w].length; v++){
				System.out.println(cities[w][v]);	
			}
			System.out.println(" ");	
		}
		
		
		
		
		//STRING IFADELERLE CALISMAK
		String sentence = "babanenin amk ";
		
		int letterCount = sentence.length();   //uzunluk bulur 
		System.out.println(letterCount);
		
		System.out.println(sentence.charAt(4));  //o index numarasia sahip chacteri getirir
		
		System.out.println(sentence.concat("daha cok amk"));  //kullandigin degiskene ekleme yapar ama yeni bir degisken tanimlar 
		
		System.out.println(sentence.startsWith("b"));  // degiskenin o charla baslayip baslamadigini true false olarak dondurur buyuk kucuk harf onemli
		System.out.println(sentence.endsWith(" "));
		
		char[] letters = new char[5];
		sentence.getChars(0, 5, letters, 0);
		System.out.println(letters);
		
		System.out.println(sentence.indexOf("amk"));  //tirnak icine yazilan karakterlerin nerde oldugunu bulur ve index numarasini verir ve bulur bulmaz ilk indexi yazdirir
		System.out.println(sentence.lastIndexOf("amk"));  //aramaya arkadarn baslar 
		
		System.out.println(sentence.replace("amk", "AMK")); //o indexi bulur ve onu istediginle degistirir ama yeni bir degisken atar aslini degistirmez
		
		System.out.println(sentence.substring(2)); //en bastanistedigimiz indexe kadar olan kismi keser 
		System.out.println(sentence.substring(2, 4)); //2. indexten 4. indexe kadar siler 
		
		System.out.println(sentence.split(" "));  //istedigin karakterleri bulur onlarin oldugu her yeri boler 
		for(String word:sentence.split(" ")){     // ama print alirken boyle alman lazim for kullanman gerekli istersen degisken i berlirle istersen bu sekilde for yaz farketmez
			System.out.println(word);
			}
		
		System.out.println(sentence.toLowerCase());  //tum harfleri kucuk harfe cevirir
		System.out.println(sentence.toUpperCase());  //tum harfleri buyuk harfe cevirir
		
		System.out.println(sentence.trim());  // bastaki ve sondkai bosluklari siler 
	
		
		//METHODS
		//methodlarda bize ne verirse onun usutunde calisabilirsin mainden bisey cekemezsin 
		//bu nedenle isinde calistigin resultuda disarida kullanamazsino yuzden void veya return olayi var 
		
		// eger birden fazla int ile calisicaksan methodda o zaman 
		//public static void methodexample(int... numbers)  bunu dersen o zaman istedigin kadar sayi gonderebilisin methoda 

		
		//CLASS
		// calasslar referance type tir 
		// ilktur olusturuyorum orda yaptigim yeni bir tanim olusturuyorum orda degisken tanimliyorum 
		// sanki bir scanner tanimlar gibi new class yapiyorum 
		
		
		
	}
}
