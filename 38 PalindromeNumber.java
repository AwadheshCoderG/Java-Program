import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Check Palindrome Number");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        boolean isPalindrome= isPalindrome(num);
        if(isPalindrome) {
            System.out.println("Your number is Palindrome Number.");
        }else
            {
                System.out.println("Your number is not a Palindrome Number.");
            }
    }
    public static boolean isPalindrome(int num){
        int reverse = reverse(num);
        return num == reverse;
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
