import java.util.Scanner; // program uses class Scanner
public class Addition{
	// main method begins execution of Java application
	public static void main (String [] args){
		try (// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in)) {
			int number1;
			int number2;
			int sum;
			
			System.out.println("Enter first integer: ");
			number1 = input.nextInt();
			
			System.out.print("Enter second integer: ");
			number2 = input.nextInt();
			
			sum = number1 + number2;
			
			System.out.printf("The sum is %d\n", sum);
		}
	}
}
