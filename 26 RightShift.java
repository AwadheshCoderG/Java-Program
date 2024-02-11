import java.util.Scanner;

class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Right Shift operator");
        System.out.println("Please enter your number: ");
        int number = input.nextInt();
        System.out.println("Now, please enter how many bits you want to shift: ");
        int number1 = input.nextInt();
        int rightShift = number >> number1;
        System.out.println("Result is: "+ rightShift);
    }
}
