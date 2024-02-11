import java.util.Scanner;

class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bitwise XOR Calculator");
        System.out.println("Please enter your first number: ");
        int first = input.nextInt();
        System.out.println("Please enter your second number: ");
        int second = input.nextInt();
        int bitwiseXORValue = first ^ second;
        System.out.println("Value is: " + bitwiseXORValue);
    }
}
