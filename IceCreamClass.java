
public class IceCreamClass {
	public static void main(String[] args){
		PersonIceCream person1 = new PersonIceCream();
		person1.setName("Joe");
		person1.setIceCream("chocolate");
		person1.printFuncction();
		
		PersonIceCream person2 = new PersonIceCream();
		person2.setName("babanen");
		person2.setIceCream("amk");
		person2.printFuncction();
	}
}

class PersonIceCream{
	String Name;
	String IceCream; 
	
	public void setName(String name){
		this.Name = name;
		}
	public void setIceCream(String iceCream){
		this.IceCream = iceCream;
		}
	public void printFuncction(){
		System.out.println(this.Name + " likes " + this.IceCream);
		}
}




