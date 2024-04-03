package reference.quiz;

public class Quiz2 {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("둘리", 50, 5000000, 20);
		Employee employee2 = new Employee("또치", 40, 4000000, 10);
		Employee employee3 = new Employee("도우너", 30, 3000000, 3);
		
		Depatment depatment = new Depatment(employee1, employee2, employee3);
	}
}
class Employee {
	
	String name;
	int age;
	int salary;
	int years;
	
	
	public Employee(String name, int age, int salary, int years) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.years = years;
		
	}
	
}
class Depatment {
	
	Employee head;
	Employee chief;
	Employee senior;
	
	public Depatment(Employee head, Employee chief, Employee senior) {
		super();
		this.head = head;
		this.chief = chief;
		this.senior = senior;
	}
	
	
	
}









