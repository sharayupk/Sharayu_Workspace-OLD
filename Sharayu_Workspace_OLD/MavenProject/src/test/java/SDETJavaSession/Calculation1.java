package SDETJavaSession;

public class Calculation1 
{
	int x,y,z;
	
	Calculation1(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
	}
	
	void sum()
	{
		System.out.println(x+y+z);
	}

	public static void main(String[] args) 
	{

		Calculation1 cal=new Calculation1(10,20,30);
		cal.sum();

	}

}
