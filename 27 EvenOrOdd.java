import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number checker using Bitwise Operator");
        System.out.println("Please Enter your number: ");
        int number = input.nextInt();
        if((number & 1) == 1)
        {
            System.out.println("Your number "+ number + " is Odd.");
        }
        else
        {
            System.out.println("Your number "+ number +" is Even.");
        }


    }
}
