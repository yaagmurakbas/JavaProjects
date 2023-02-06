public class exceptionExercise {
	public static void A(){
		try{
        	B();    
        	}
        catch(Exception e){
        	System.out.println("Exception caught in A");
        }
    }
    
    public static void B() throws Exception{
            C();   
    }
    
    public static void C() throws Exception{
          Exception exception = new Exception();
          throw(exception);
    }
    
    public static void main(String[] args){
    	A();
    }
        
}

/*
Trying
Starting sampleMethod
Catching
From sampleMethod with love.
*/

