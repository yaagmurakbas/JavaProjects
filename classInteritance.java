public class classInteritance {
	public static void main(String[] args){
		Customer customer =  new Customer();
		Employee employee = new Employee();
		customer.age =50; 
		employee.age = 4;	
		// simdi burdaki fark biz customerda extends yaoptik yani miras aldik
		//bunun anlami hem miras aldigimiz person classindakileri kullanabiliyorum 
		//ayni zamanda customer classindakileri kullanabilirim ve employee den bi farki yok 
		//employee normal class actim orda age objesi direk var 
		// bu nedenle direk miras extends yapabilirsin
		//SADECE BIR CLASSI EXTENDS EDILEBILIR
	}
}
