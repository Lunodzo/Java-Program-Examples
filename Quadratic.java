import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Quadratic{
	public static void main(String [] args){
		double a,b,c;
		double root1;
		double root2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a = input.nextDouble();
		
		System.out.println("Enter the value of b: ");
		b = input.nextDouble();
		
		System.out.println("Enter the value of c: ");
		c = input.nextDouble();
		
		double dtmnt = (b*b)-(4*a*c);
		double root = Math.sqrt(dtmnt);
		
		if(dtmnt>0){
			root1 = (-b +  root) / (2*a) ;
			root2 = (-b -  root) / (2*a) ;
			System.out.println("The roots of the equation are "+root1+" and "+root2);
		}
		
		if(dtmnt==0){
			root1 = (-b +  root) / (2*a) ;
			System.out.println("The root of the equation is "+root1);
		}
		
		if(dtmnt<0){
			System.out.println("The equation has no roots");
		}
	}
}