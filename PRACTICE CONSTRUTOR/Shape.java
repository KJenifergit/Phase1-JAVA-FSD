package constrctor;

public class Shape {
	int cir;
	int squ;
	int tri;
	public Shape(){
	System.out.println("inside");
	
	}
	
		
	
	public void display(long r){
		System.out.println("area of circle:"+(3.14*r*r));
		

	}
	public void display(int x,int y){
		System.out.println("area of triangle:"+(.5*x*y));
	}
	public void display(int d){
		System.out.println("area of square:"+(d*d));
		
	}
	public void display(int m,int n){
		System.out.println("area of rec:"+(m*n));
	}
	public void display(int x1,int x2){
		System.out.println("area of rhombus:"+(.5*x1*x2));
    }
	public static void main(String args[])
	{
		Shape ob=new Shape();
		ob.display(89);
		ob.display(10,7);
		ob.display(25);
		ob.display(5,31);
		ob.display(7,8);
	}
	
	
	

}
