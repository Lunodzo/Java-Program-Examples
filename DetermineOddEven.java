import java.util.Scanner;

public class DetermineOddEven {
    public static void main(String[] args) {
        int number1;
        Scanner input = new Scanner(System.in);

        System.out.print("Submit the number\n");
        number1 = input.nextInt();

        if (number1%2==0) {
            System.out.println("This is even\n");
        }else{
            System.out.println("This is odd\n");
        }
    }
}
