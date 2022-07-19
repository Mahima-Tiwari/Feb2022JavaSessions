package METHODCONCEPTS;

public class Application {
	
	public void test() {
		System.out.println("TEst menthod");
	}
	public void addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	//2. no input some return
	public String getName() {
		System.out.println("Get name method...");
		String name="Tom";
		return name;
	}
	public int getSum() {
		System.out.println("Get some methos..");
		int a=10;
		int b=20;
		int sum=a+b;
		return sum;
	}
	
	//3.some input some return
	public int add(int x, int y) {
		int z=x+y;
		return z;
	}
	
	//WAF: input-->studentName (String)
	//returns marks of the student (int)
	public int getMarks(String studentName) {
		System.out.println("getting student name: "+studentName);
		if (studentName.equals("Mahima")) {
			return 90;
		}
		else if (studentName.equals("Shivi")) {
			return 95;
		}
		else if (studentName.equals("Shivya")) {
			return 100;
		}
		else {
			System.out.println("student is not found:  "+studentName);
			return 0;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application app=new Application();
		app.addition();
		app.test();
		String n=app.getName();
		System.out.println("My Trainer name is :   "+n);
		System.out.println(app.getName());
		
		int s1=app.getSum();
		System.out.println("sum is"+(s1+5));
		
		int d1=app.add(20, 30);
		System.out.println(d1);
		
		
	}

}
