import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker ");
        System.out.println("Please enter your number: ");
        int number = input.nextInt();
        if (number > 0)
        {
            System.out.println(number +" is positive.");
        }
        else if (number < 0)
        {
            System.out.println(number +" is negative.");
        }
        else
        {
            System.out.println("Number is zero.");
        }
    }
}
