import java.util.Scanner;
public class Madarasa{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int average, grade=1, score, counter=0, total = 0;
        String darasa;
        System.out.println("Enter 1 for Grade1, 2 for Grade2 and 3 for Grade3");
        grade = input.nextInt();

        switch(grade){
            case 1:
                System.out.println("You are into Grade One, enter scores");
                while (counter < 10) {
                    System.out.println("Enter Score");
                    score = input.nextInt();
                    total = total + score;
                    counter = counter + 1;
                    System.out.printf("You have entered %d scores\n", counter);
                }
                average = total / counter;

                System.out.printf("Total score is %d\n", total);
                System.out.printf("Average score is %d\n", average);
                break;

            case 2:
                System.out.println("You are into Grade Two, enter scores");
                while (counter < 10) {
                    System.out.println("Enter Score");
                    score = input.nextInt();
                    total = total + score;
                    counter = counter + 1;
                    System.out.printf("You have entered %d scores\n", counter);
                }
                average = total / counter;

                System.out.printf("Total score is %d\n", total);
                System.out.printf("Average score is %d\n", average);
                break;
            
            case 3:
                System.out.println("You are into Grade Three, enter scores");
                while (counter < 10) {
                    System.out.println("Enter Score");
                    score = input.nextInt();
                    total = total + score;
                    counter = counter + 1;
                    System.out.printf("You have entered %d scores\n", counter);
                }
                average = total / counter;

                System.out.printf("Total score is %d\n", total);
                System.out.printf("Average score is %d\n", average);
                break;
        }
        System.out.println("You did not choose a valid class");
    }
}