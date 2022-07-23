package PROJECT;
import java.util.Scanner;
public class Calculator{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int x=sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int y=sc.nextInt();
		
		System.out.println("Select the operation(+,-,*,/,%):");
	    char op=sc.next().charAt(0);
	    solve(x,y,op);
	}
	public static int solve(int x,int y, char op)
	{
		int res=0;
		//add
		if(op=='+') {
			res=x+y;
	
		}
		//sub
		else if(op=='-') {
		      res=x-y;
		}
		//multiply
		else if(op=='*') {
			    res=x*y;
		}
		//division
		else if(op=='/') {
		       res=x/y;
		}
		else if(op=='%') {
		       res=x%y;
		}
		
		//priniting tha final result
		System.out.println("Answer is:"+res);
		return res;
	}
	
	    
			
		
		
		
	}
	
	
	


