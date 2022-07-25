package PROJECT;

public class Typecast {
	public static void main(String[] args){
	//double to int to char
	    double a=100.56;
		int b=(int)a;
		char x=(char)b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
	//float to long
		float c=8786445666.9f;
	    long d=(long)c;
	    System.out.println(c);
	    System.out.println(d);
	 //char to int
	    char e='A';
		int f=e;
		float g=e;
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	   //double to long to int to char
		double y=96.7;
	    long z =(long)y;
	    int u=(int)z;
	    char v=(char)u;
	    System.out.println(y);
	    System.out.println(z);
	    System.out.println(u);
	    System.out.println(v);
	    //long to byte
	    long l=150;
	    byte m=(byte)l;
	    System.out.println(l);
	    System.out.println(m);
	    //int to double to long
	    int p=56;
	    double r=(double)p;
	    long q=(long)r;
	    System.out.println(p);
	    System.out.println(r);
	    System.out.println(q);
  }

}


