import javax.swing.JOptionPane;

public class Addition2 {
    public static void main(String[] args) {
        //Read inputs from JOptionPane
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");

        //Convert the strings into integers
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;

        JOptionPane.showMessageDialog( null, "The sum is " +sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE );
    }
}
