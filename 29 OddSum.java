import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum Calculator");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("OddSum till "+ num +" is: "+sum);
    }

    public static int oddSum(int num) {
        int i = 1;
        int sum = 0;
        while(i <= num)
        {
            sum += i;
            i += 2;
        }
        return sum;

    }
}
