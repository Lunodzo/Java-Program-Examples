//creating a Gradebook object and calling its displayMessage method
import java.util.Scanner;
public class GradeBookTest{
	//create the main method to begin execution
	public static void main(String [] args){
		//create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		//CREATE GRADEBOOK OBJECT and assign to myGradeBook
		GradeBook myGradeBook = new GradeBook("Introduction to Java Programming");
		
		myGradeBook.displayMessage();
		myGradeBook.inputGrades();
		myGradeBook.displayGradeReport();
		System.out.println(); // outputs a blank line
	}
}