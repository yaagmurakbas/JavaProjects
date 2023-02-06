class Person{
        private String name;
        public Person(){
                name = "";
        }
        public Person(String name){
                this.name = name;
        }
        public String getName(){
                return name;
        }
        public void setName(String name){
                this.name = name;
        }
}
class Employee extends Person {
                private double annualSalary;
        private int hireYear;
        private String ID;
        public Employee(){
                annualSalary = 0.0;
                hireYear = 2022;
                ID = "";
        }
        public Employee(String name, double annualSalary, int hireYear, String ID){
                super(name);
                this.annualSalary = annualSalary;
                this.hireYear = hireYear;
                this.ID = ID; 
        }
        public double getAnnualSalary(){
                return annualSalary;
        }
        public int getHireYear(){
                return hireYear;
        }
        public String getID(){
                return ID;
        }                       
        public void setAnnualSalary(double annualSalary){
                this.annualSalary = annualSalary;
        }
        public void setHireYear(int hireYear){
                this.hireYear = hireYear;
        }
        public void setID(String ID){
                this.ID = ID;
        }       
        public boolean equals(Employee emp){
                return this.getName().equals(emp.getName()) && 
                           annualSalary == emp.annualSalary &&
                           hireYear == emp.hireYear &&
                           ID.equals(emp.ID);
        }
}
class employeeClass{
        public static void main(String[] args) {
                // testing the constructors
                Employee emp1 = new Employee("John Doe", 24000, 2020, "A123");
                Employee emp2 = new Employee();

                System.out.println("\nDetails of Emp1:\n");

                System.out.println("Name: " + emp1.getName());
                System.out.println("Annual Salary: " + emp1.getAnnualSalary());
                System.out.println("Hire Year: " + emp1.getHireYear());
                System.out.println("ID: " + emp1.getID());
             
                emp2.setName("Marry Jane");
                emp2.setAnnualSalary(125000);
                emp2.setHireYear(2008);
                emp2.setID("A008");

                System.out.println("\n\nDetails of Emp2:\n");

                System.out.println("Name: " + emp2.getName());
                System.out.println("Annual Salary: " + emp2.getAnnualSalary());
                System.out.println("Hire Year: " + emp2.getHireYear());
                System.out.println("ID: " + emp2.getID());              

                if(emp1 == emp2){
                        System.out.println("\nEmp1 and Emp2 are equal.");
                }
                else{
                        System.out.println("\nEmp1 and Emp2 are not equal !!!");
                }
        }
}