import java.util.Scanner;

class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to age calculator ");
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        if (age >= 60)
        {
            System.out.println("You are a senior citizen.");
        }
        else if (age >= 20)
        {
            System.out.println("You are an adult person.");

        }
        else if (age >= 13)
        {
            System.out.println("You are a teenager.");
        }
        else
        {
            System.out.println("You are a child.");
        }
    }
}
