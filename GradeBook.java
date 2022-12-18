import java.util.Scanner; // program uses class Scanner
public class GradeBook{
	private String courseName; // name of course this GradeBook represents
	private int total; //To store sum of grades,  int instance variables are initialized to 0 by default
	private int gradeCounter; // number of grades entered

	// constructor initializes courseName;
	public GradeBook(String name){
		courseName = name;
	}//end constructor

	// method to set the course name
	public void setCourseName(String name){ //First method
		courseName = name; // store the course name
	} // end method setCourseName

	public String getCourseName(){  //Method to get Course name
		return courseName;
	}//end of method

	public void displayMessage(){ //Third method
		System.out.printf("Welcome to the Gradebook for %s!\n", getCourseName());
	}

	public void inputGrades(){
		Scanner input = new Scanner(System.in);
		int grade;
		System.out.printf("Enter grades in the range of 0-100\n");
		System.out.printf("Enter -1 to terminate\n");

		while(true){
			grade = input.nextInt(); //Read grades
			if(grade < 0 || grade > 100){
				break;
			}	
			total = total + grade; //add grade to total
			++gradeCounter;
		}
	}

	public void displayGradeReport(){
		System.out.println( "\nGrade Report:" );
		if(gradeCounter != 0){
			//calculate average
			double average = (double) total/gradeCounter;

			//output summary results
			System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total);
			System.out.printf("Class Average is %.2f\n", average);
		}
		else{
			System.out.printf("No Grade were entered\n");
		}
	}
}