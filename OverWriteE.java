public class OverWriteE {
	private String name;
	private String departmant;
	private int salary;
	
	public OverWriteE(String name, String departmant, int salary) {
		super();
		this.name = name;
		this.departmant = departmant;
		this.salary = salary;
	}
	
	public void showInfos(){
		System.out.println("name: " + this.name);
		System.out.println("departmant: " + this.departmant);
		System.out.println("salary: " + this.salary);
	}

	public String getName() {
		return name;
	}

	public String getDepartmant() {
		return departmant;
	}

	public int getSalary() {
		return salary;
	}
}
