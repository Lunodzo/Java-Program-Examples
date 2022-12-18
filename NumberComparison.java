import java.util.Scanner;

public class NumberComparison{
    public static void main(String [] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        //Read numbers
        number1 = input.nextInt();
        number2 = input.nextInt();

        if(number1==number2){
            System.out.printf("Number %d and %d are equal\n", number1, number2);
        }else{
            System.out.printf("Numbers are not equal");
        }
    }
}