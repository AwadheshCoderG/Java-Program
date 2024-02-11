import java.util.Scanner;

class GreatestOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to world of three ");
        System.out.println("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("Now, Enter your second number: ");
        int num2 = input.nextInt();
        System.out.println("Now, Please enter your third number: ");
        int num3 = input.nextInt();
        if (num1 >= num2 && num1 >= num3)
        {
            System.out.println(num1 +" is greatest number.");
        }
        else if (num2 >= num3)
        {
            System.out.println(num2 +" is greatest number.");
        }
        else
        {
            System.out.println(num3 +" is greatest number.");
        }
    }
}
