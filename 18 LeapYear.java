import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Check leap year ");
        System.out.println("Please enter your year: ");
        int year = input.nextInt();
        if (year % 400 == 0)
        {
            System.out.println(year +" is a leap year.");
        }
        else if (year % 100 == 0)
        {
            System.out.println(year +" is not a leap year.");
        }
        else if (year % 4 == 0)
        {
            System.out.println(year +" is a leap year.");
        }
        else
        {
            System.out.println(year +" is not a leap year.");
        }
    }
}
