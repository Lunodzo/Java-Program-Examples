import java.util.Scanner;

public class SumFloat {
    public static void main(String[] args) {
        float number1;
        float number2;
        float sum;
        Scanner input = new Scanner(System.in);

        System.out.print("Submit the first number\n");
        number1 = input.nextFloat();

        System.out.print("Submit the second number\n");
        number2 = input.nextFloat();

        sum = number1 + number2;

        System.out.printf("The sum is %.2f\n", sum);
    }
}
