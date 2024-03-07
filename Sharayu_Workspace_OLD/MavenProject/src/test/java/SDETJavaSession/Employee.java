package SDETJavaSession;

public class Employee {
	
	int empid;
	String empname;
	int salary;
	int deptno;
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	/*Employee(int id,String name,int sal,int dno)
	{
		empid=id;         //this.empid=empid--->We can specify same name of parameters and class var,but we need to use this keyword to differentiate between them
		empname=name;
		salary=sal;
		deptno=dno;
	}*/
	
	void setData(int id,String name,int sal,int dno)
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
	}

	public static void main(String[] args) 
	{
		//Class variables and methods can be accessed by 3 ways:
		//1]By creating object of that class:
		
		/*Employee emp1=new Employee();
		emp1.empid=1;
		emp1.empname="Raj";
		emp1.salary=200;
		emp1.deptno=10;
		
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.empid=2;
		emp2.empname="Raju";
		emp2.salary=2000;
		emp2.deptno=11;
		
		emp2.display();*/
		
		//2]By using Constructor:
		
		/*Employee emp1=new Employee(1,"raj",200,10);
		emp1.display();*/
		
		//3]By creating method:
		Employee emp1=new Employee();
		emp1.setData(1, "raj", 200, 10);
		
		emp1.display();

		
		
		
		
		
	}

}
