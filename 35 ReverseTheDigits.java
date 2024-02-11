import java.util.Scanner;

class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse the digits of a number");
        System.out.println("Please enter your name: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of the number is: "+ reverse);
    }
    public static int reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num %10;
            newNum = newNum * 10 +digit;
            num /= 10;
        }
        return newNum;
    }
}
