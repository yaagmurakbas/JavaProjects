public class OverWriteM extends OverWriteE{
	private int numOfEmployee;
	
	public OverWriteM(String name, String departmant, int salary, int numOfEmployee){
		super(name, departmant, salary);
		this.numOfEmployee = numOfEmployee;
	}
	
	public void raiseSalary(int amount){
		System.out.println(amount+" dolar added to " + this.numOfEmployee + "'s salary");
	}
	
	public void showInfos(){
		// burda 2 yol varya over write yapicam yada super kullancam 
		// over write yapmak icin bize get methodu gerekli cunku diger classta objeleri private yaptik
		
		/*           BU OVERWRITE OLUR 
		System.out.println("name: " + getName());
		System.out.println("departmant: " + getDepartmant());
		System.out.println("salary: " + getSalary()); 
		*/
		
		super.showInfos();
		System.out.println("the number of employes: " + this.numOfEmployee);
	}

}
