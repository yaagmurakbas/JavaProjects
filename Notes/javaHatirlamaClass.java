public class javaHatirlamaClass{
	public static void main(String[] args){
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		CustomerManagerPackage customerManagerP = new CustomerManagerPackage();
		customerManagerP.babanen();
		//simdi package class olusturursan sadece new diye tanimlaman yetiyo ama
		//eger public class olusutrursan yukarda import etmen gerekiyo 
		
		
		int[] number1 = new int[] {1, 2, 3}; 
		int[] number2 = new int[] {4, 5, 6}; 
		
		number1 = number2;
		number2[0] = 10;
		System.out.print(number1[0]);
		//burdaki cikti 10 olur cunku diziler arrayler yani referans typetir yani esitledikte sonra 
		//referans numarasi degildir bunlar normal sayilar gii degil normal sayilarda esitledikten sonra 
		//degiskemi degistirsende etkilemez ama bunda etkiler cunku direk referans numarasi esitlendi 
		// esitledikten sonra bellekte 1 nesne var 2 degisken 1 nesneyi tutuyo 
		
	
   }
}
