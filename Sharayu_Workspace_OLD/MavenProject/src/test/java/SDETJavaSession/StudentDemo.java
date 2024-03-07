package SDETJavaSession;

public class StudentDemo {
	
	int sid;
	String sname;
	double sub1,sub2,sub3;
	
	void getStuData(int id,String name)
	{
		sid=id;
		sname=name;
	}
	
	void getStuMarks(double m1,double m2,double m3)
	{
		sub1=m1;
		sub2=m2;
		sub3=m3;
	}
	
	void totalMarks()
	{   
		System.out.println("Student Details---->"+sid +"    "+sname);
		System.out.println("Total Marks---->"+(sub1+sub2+sub3));
	}

	public static void main(String[] args) 
	{
		StudentDemo stu1=new StudentDemo();
		stu1.getStuData(1,"Rahul");
		stu1.getStuMarks(10,20,30);
		stu1.totalMarks();
		
		StudentDemo stu2=new StudentDemo();
		stu2.getStuData(2,"Shraddha");
		stu2.getStuMarks(100,200,300);
		stu2.totalMarks();

	}

}
