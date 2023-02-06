public class classProjeProduct {
	public static void main(String[] args){
		Product product = new Product();
		product.name = "laptop"; 
		product.discription = "babanen";
		product.price = 14708484;
		product.stockAmount = 87846; 
		
		//2 tanimlama var biri bu sekilde biri constructor yaparsan class icinde bunu kabul etmez cunku 
		//eger constructor eklersen bu onun calismasi icin calismaktan kastim main icinde new dite tanitmani kastettim 
		//ilk satirdaaki new diye tanitirken senden degiskenleri girmeni ister constructorlar nasil vermen gerekti
		//tigini san asimdi ornek olarak altta vericem ayni sekilde  class icindede acikliycam nasil tanimlaman gerektigini 
		// yorum yapicam cunku calismasini engelliyo amk
		
	    Product productConstructor = new Product(5, "laptop", "babanen", 5, 9);
	
		
		product.setId(10); 
		// burda atama yaptik set id 1i alir this id yi degistirir yani class icindeki id 1ken 10 olur 
		ProductManager productManager = new ProductManager();
		productManager.Add((product));
		
		//her class sadece bir is yapar
		//bu nedenle product kismindaki class da sadece itemleri tanimladim 
		// productManager kisminda koutlari verdim bu nedenle her class ta 1 is yapmam gerekli 
	}
}
