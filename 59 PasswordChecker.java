import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Password Checker");
        String password;
        do {
            System.out.println("Pleas enter a valid password: ");
            password = input.next();
        }
        while(!isValidPassword(password));
        {
            System.out.println("Thanks for entering a valid password.");

        }
    }


    public static boolean isValidPassword(String password){
        return password.length() > 6;
    }
}
