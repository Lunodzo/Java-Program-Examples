import java.util.*;

public class Grading{
    static int average;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade, total = 0;
        int counter = 0;
        while (counter < 10) {
            System.out.println("Enter Grade");
            grade = input.nextInt();
            total = total + grade;
            counter = counter + 1;
            System.out.printf("You have entered %d scores\n", counter);
        }
        average = total / counter;

        System.out.printf("Total score is %d\n", total);
        System.out.printf("Average score is %d\n", average);

        String one = "2";
        int mwinuka = (int) luno(Double.parseDouble(one), 3);

        System.out.println("TOTAL: "+mwinuka);

        Map<String, String> lunod = new HashMap<>();
        lunod.put("name", "Lunodzo");
        lunod.put("occupation", "Lecturer");
        
        System.out.println("OBJECT: "+lunod);

    }

    public static double luno(double num1, double num2){
        double sum = (num1+num2)/2;
        double total = Math.ceil(sum);

        return total;
    }
    
}