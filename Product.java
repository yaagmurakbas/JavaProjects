

public class Product {
	///burda constructor kismini bu sekilde istedik yani bu bilesenleri alarak new
	//class tanimlamasina izin verdirk 
	public Product(int id,String name, String discription,int price, int stockAmount){
	    System.out.print("yapici blok calisti");
	    this.id = id;
	    this.name = name;
	    this.discription = discription;
	    this.price = price;
	    this.stockAmount = stockAmount;
	    //burda extradan set etmemiz gerek cunku degiskenleri ana classtaki degiskenlerle sitlememi laizm 
	    // yoksa bu constructir icinde kalir 
	    }
	public Product(){
		
	}
	private int id;
	public String name;
	public String discription;
	public double price;
	public int stockAmount;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id; 
		// this demek islem yaptigimiz sey o icerisinde bulundugu class in icinde olan deger demek
		//bizim burda this id den kast privite dedifimiz en ustteki id olur 
	}

}
