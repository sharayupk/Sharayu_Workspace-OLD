package SDETJavaSession;

public class Calculation {
	
	int x=10;
	int y=20;
	
	void sum(int a,int b)
	{
		System.out.println(x+y);
		
		x=a;
		y=b;
		
		System.out.println(a+b);
		System.out.println(x+y);
	}
	
	void display()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) 
	{
		Calculation cal=new Calculation();
		cal.sum(30,40);
		cal.display();
	}

}
