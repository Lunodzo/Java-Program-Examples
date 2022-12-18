import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number1;
            int number2;
            System.out.print("Enter first integer: ");
            number1 = input.nextInt(9);
            System.out.print("Enter second integer: ");
            number2 = input.nextInt();
            if (number1 % number2 == 0){
                System.out.printf("Number %d is divisible by number %d\n", number1, number2);
            }else{
                System.out.printf("Number %d is not divisible by number %d\n", number1, number2);
            }
        }
            
    }
}
