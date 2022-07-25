package PROJECT;

public class Overloading {
	public void area(int h, int b)
	{
		System.out.println("Area of trinangle:" + (.5*h*b));
	}
	public void add(int a, int c)
	{
		System.out.println("sum of two numbers:" + (a+c));
	}
	public void cirarea(long r)
	{
		System.out.println("Area  circle :" + (3.14*r*r));
	}
	public void sqarea(int d)
	{
		System.out.println("Area of square:" + (d*d));
	}
	public static void main(String args[])
	{
		Overloading cd=new Overloading();
		cd.area(5,4);
		cd.add(6,7);
		cd.cirarea(68);
		cd.sqarea(10);
	}
	
	




}


