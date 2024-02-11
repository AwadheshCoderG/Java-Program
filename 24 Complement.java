import java.util.Scanner;

class Complement {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to Complement/NOT operator");
        System.out.println(" Please enter your number: ");
        int number = input.nextInt();
        int complement = ~ number;
        System.out.println("Your result is: "+ complement);
    }
}
