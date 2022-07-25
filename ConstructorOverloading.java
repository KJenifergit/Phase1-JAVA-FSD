package PROJECT;

public class ConstructorOverloading {
	int length,breadth,side;
	float radius;
	ConstructorOverloading(int p,int q)
	{
		length=p;
		breadth=q;
		
	}
	ConstructorOverloading(int d)
	{
		side=d;
	}
	ConstructorOverloading(float p)
	{
		radius=p;
	}
	void areaofcircle()
	{
		double area=3.14*radius*radius;
		System.out.println("Area of circle"+ area);
	}
	void areaofsquare()
	{
		int sarea=side*side;
		System.out.println("Area ofsquare"+ sarea);
	}
	void areaofrectangle()
	{
		int rarea=length*breadth;
		System.out.println("Area of rectangle"+ rarea);
	}
	void areaofrhombus()
	{
		int rharea=side*side;
		System.out.println("Area of rhombus"+ rharea);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading cs1=new ConstructorOverloading(10);
		ConstructorOverloading cs2=new ConstructorOverloading(20);
		ConstructorOverloading cs3=new ConstructorOverloading(12,23);
		ConstructorOverloading cs4 = new ConstructorOverloading(23.6F);
		cs1.areaofsquare();
		cs3.areaofrectangle();
		cs2.areaofrhombus();
		cs4.areaofcircle();
}
}


