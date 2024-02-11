import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator ");
        System.out.println("Please enter your percentage: ");
        int percentage = input.nextInt();
        if (percentage >= 90)
        {
            System.out.println("Wow! you have got A grade.");
        }
        else if (percentage >= 75 )
        {
            System.out.println("You have got B grade.");
        }
        else if (percentage >=60)
        {
            System.out.println("You have got C grade.");
        }
        else if (percentage >= 30)
        {
            System.out.println("You have got D grade.");
        }
        else
        {
            System.out.println("You have got F grade.");
        }
    }
}
