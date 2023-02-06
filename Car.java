
public class Car {
	// fields v
	private String color;
	public String model;
	public int doors;
	
	//burda bir bir atama yapmka yerine constructor ile atama yapiyroum cok degisken olfugunda eger privatesa atamak cok zor olue 
	//bu nedenle constructor kullaniyoruzki atmasi kolay olsun 
	public Car(String color, String model, int doors){
		this.color  = color;
		this.model = model;
		this.doors = doors;
		
	}	
	
	public void setColor(String color){    //color private olsa bile biz colora basja bir classtan atama yapabiliriz 
		this.color = color;
	}
	
	//get methoduyla print alirken getirebilirsin set methoduyla atama yapabilirsin 
	public String getColor(){
		return this.color;
	}

	//getter setter otomatik yapmak icin ters tikla--source--genarate getter setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors){
		this.doors = doors;
	}
	
	public void startCar(){
		System.out.print("the engine started...");
	}
	public void stopCar(){
		System.out.print("\nthe engine stoped...");
	}
	
	public void getInfo(){
		System.out.println("the color of the car is " + this.color);
		System.out.println("the model of the car is " + this.model);
		System.out.println("the number of the doors of the car is " + this.doors);
		
	}

}
