import java.util.Scanner;

public class Statement {
    public static void main(String [] args) {
        int number1;
        int number2;
        Scanner input = new Scanner(System.in);

        System.out.print("Submit the first number\n");
        number1 = input.nextInt();

        System.out.print("Submit the second number\n");
        number2 = input.nextInt();

        if(number1==number2)
            System.out.printf("The number %d and %d are equal\n", number1, number2);

        if(number1!=number2)
            System.out.printf("The number %d and %d are not equal\n", number1, number2);
        
        if(number1>number2)
            System.out.printf("The number %d is greater than %d\n", number1, number2);
    }


}
