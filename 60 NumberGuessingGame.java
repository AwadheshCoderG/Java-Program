import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number guessing game");
        int num = 5 ,guess;
        do{
            System.out.println("Please guess the number between 0 and 10 : ");
            guess = input.nextInt();
        }
        while(num != guess);
        {
            System.out.println("You have successfully guessed the number");
        }
    }
}
