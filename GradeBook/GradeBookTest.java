
public class GradeBookTest{
	//create the main method to begin execution
	public static void main(String [] args){
		//CREATE GRADEBOOK OBJECT and assign to myGradeBook
		GradeBook myGradeBook = new GradeBook("Introduction to Java Programming");
		
		myGradeBook.displayMessage();
		myGradeBook.inputGrades();
		myGradeBook.displayGradeReport();
		System.out.println(); // outputs a blank line
	}
}