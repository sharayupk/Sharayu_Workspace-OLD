package SDETJavaSession;

public class ConstructorDemo {
	
	int x=10;
	int y=20;
	
	ConstructorDemo(int a,int b)
	{
		x=a;
		y=b;
		
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		
		ConstructorDemo cons=new ConstructorDemo(30,40);
		
	}

}
