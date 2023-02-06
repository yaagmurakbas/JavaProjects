public class hersey{
	int x =  5;	
	public void printMethodfirst(){
		System.out.print("babanenin amk...");
	}

	public static void main(String[] args){
		
		hersey myObj1 = new hersey();
		hersey myObj2 = new hersey();
		
		myObj1.x = 50;   // xdegerini degistirebilirim cunku private degil 
		System.out.println(myObj1.x); // degistirmis oldugum x degerini bastiri
	    System.out.println(myObj2.x);  //ammabunlar farkli birobje oldugundan dolayi referans numarali farkli
	    //bu nedenle obj1 dekix degerini degistirsemde obj2 ayni kalir 
		
	    secondClassForMethods method2 = new secondClassForMethods();
		method2.printMethodSecond();                 //bu extra class olusturup icine method yazma
		
		hersey method1 = new hersey();
		method1.printMethodfirst();                //bu ana dosyanin icinde method olusturarak method yazma 
		
		

		
		EmployeeT employee1 = new EmployeeT("dolunay", 4568, 0);
		ManagerT manager1 = new ManagerT("yagmur", 834548,889);
		
		System.out.println(employee1.getName());
		System.out.println(manager1.getName());
		
		System.out.print(employee1.numEmployeeCalculator());
		System.out.println(manager1.numEmployeeCalculator());
		
		manager1.getName();
		
		System.out.println(manager1.getNumEmployee());
		
		
	}
}

class secondClassForMethods{
	static void printMethodSecond(){
		System.out.print("babanenin amk...");
	}
	
}  


class EmployeeT{
	private String name;
	private int Id;
	private int lvl;
	
	public EmployeeT(String name, int id, int lvl){
		this.name = name;
		this.Id = id;
		this.lvl = lvl;
	}
	
	   // GETTER SETTER KISMI 
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setId(int id){
		this.Id = id;
	}
	public int getId(){
		return this.Id;
	}	
	
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	
	
	public int numEmployeeCalculator(){
		if(this.lvl==0){
			return 0;
		}
		else{
			int i = this.lvl*10;
			return i;
		}
	}
}


class ManagerT extends EmployeeT{
	private int numEmployee;
	
	public ManagerT(String name, int id, int lvl) {
		super(name, id, lvl);
	}
	
	public int numEmployeeCalculator() {
		this.numEmployee = super.numEmployeeCalculator();
		return this.numEmployee;
	}	
	
	public int getNumEmployee(){
		return this.numEmployee;
	}
}
