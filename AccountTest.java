import java.util.Scanner;
public class AccountTest{
    public static void main(String[] args) {
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.54);
        System.out.printf("Account1 balance: TShs. %.2f\n", account1.getBalance());
        System.out.printf("Account2 balance: TShs. %.2f\n", account2.getBalance());
        Scanner input = new Scanner(System.in);
        double depositAmount;
        System.out.printf("Enter deposit amount for Account1: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nAdding %.2f to Account1 balance\n\n", depositAmount);
        account1.credit(depositAmount);
        System.out.printf("Account1 balance is TShs. %.2f\n", account1.getBalance());
        System.out.printf("Account2 balance is TShs. %.2f\n\n", account2.getBalance());
        System.out.printf("Enter deposit amount for Account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nAdding %.2f to Account2 balance\n\n", depositAmount);
        account2.credit(depositAmount);
        System.out.printf("Account1 balance is TShs. %.2f\n", account1.getBalance());
        System.out.printf("Account2 balance is TShs. %.2f\n", account2.getBalance());
    }
}