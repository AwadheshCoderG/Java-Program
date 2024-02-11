import java.sql.SQLOutput;
import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute value");
        System.out.println("Please enter your number: ");
        int num1 = input.nextInt();
        int result = num1 >= 0 ? num1 : -num1;
        System.out.println("Absolute value is: " +result);
    }
}
