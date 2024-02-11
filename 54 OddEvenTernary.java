import java.util.Scanner;

class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd and Even checker");
        System.out.println("Please enter the number to check: ");
        int num1 = input.nextInt();
        String result = num1 % 2 == 0 ? "Even" : "Odd";
        System.out.println("Your number is "+result);
    }
}
