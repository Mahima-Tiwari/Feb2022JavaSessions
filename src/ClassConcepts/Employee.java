package ClassConcepts;

public class Employee {
	String name;
	int age;
	String city;
	double salary;
	char initialName;
	boolean isActtive;

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.name="mahima";
		e1.age=30;
		e1.city="LA";
		e1.salary=12.33;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.city+" "+e1.salary);
		System.out.println(e1.initialName);// empty space
		System.out.println(e1.isActtive); //default value false
		
		
		
	}

}
