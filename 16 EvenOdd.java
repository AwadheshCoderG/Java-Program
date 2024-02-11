import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number checker");
        System.out.println("Please enter your number: ");
        int number = input.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("Your number "+ number +" is Even.");
        }
        else
        {
            System.out.println("Your number "+ number +" is Odd.");
        }

    }
}
