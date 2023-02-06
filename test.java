public class test{
	int x =  5;
	public static void main(String[] args){
		test myObj1 = new test();
		test myObj2 = new test();
		secondClass method = new secondClass();
		
		
		myObj1.x = 50;   // xdegerini degistirebilirim cunku private degil 
		System.out.println(myObj1.x); // degistirmis oldugum x degerini bastiri
	    System.out.println(myObj2.x);  //ammabunlar farkli birobje oldugundan dolayi referans numarali farkli
	    //bu nedenle obj1 dekix degerini degistirsemde obj2 ayni kalir 
	    
	    method.printMethod();
	}
}

class secondClass{
	static void printMethod(){
		System.out.print("babanenin amk...");
	}
	
}








