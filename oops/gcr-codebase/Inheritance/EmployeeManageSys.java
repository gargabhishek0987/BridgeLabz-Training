public class EmployeeManageSys {
    String name;
    int id;
    double salary;

    public EmployeeManageSys(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        
    }
    public void displayDetails() {
    	System.out.println(name);
    	System.out.println(id);
    	System.out.println(salary);
    	
    	
    	
    }
    class Developer extends EmployeeManageSys{
    	String programmingLanguage;
    	
    	public Developer(String name , int id , double salary , String programmingLanguage) {
    		super(name , id ,salary);
    		this.programmingLanguage = programmingLanguage;
    		
    	}
    	 
    	public void displayDetails() {
    		super.displayDetails();
    		System.out.println(programmingLanguage);
    		
    	}
    }
    class Manager extends EmployeeManageSys{
    	String teamSize;
    	public Manager (String name , int id , double salary , String teamSize) {
    		super(name , id ,salary);
    		this.teamSize  =teamSize;
    	}
    	public void displayDetails() {
    		super.displayDetails();
    		System.out.println(teamSize);
    	}
    	
    }
    class Intern extends EmployeeManageSys{
    	double internshipPeriod;
    	public Intern (String name, int id , double salary , double internshipPeriod) {
    		super(name , id , salary);
    		this.internshipPeriod = internshipPeriod;
    		
    	}
    	public void displayDetails() {
    		super.displayDetails();
    		System.out.println(internshipPeriod);
    	}
    }
    
}