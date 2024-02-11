import java.util.Scanner;

class PrintPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Print Patterns");
        System.out.println("Please enter the number of rows: ");
        int rows = input.nextInt();
        printRightHalfPyramid(rows);
        printReverseRightHalfPyramid(rows);
        printLeftHalfPyramid(rows);
    }

    public static void printLeftHalfPyramid(int maxRows) {
        System.out.println("Here is Left Half Pyramid. ");
        int rows = maxRows;

        while (rows > 0) {
            int j = 0;
            while (j < rows - 1) {
                System.out.print(" ");
                j++;
            }

            int i = 0;
            while (i < (maxRows - rows + 1)) {
                System.out.print(" *");
                i++;
            }

            System.out.println("");
            rows--;
        }
    }

    public static void printReverseRightHalfPyramid(int maxRows){
        System.out.println("Here is Reverse Right Half Pyramid.");
        int rows = maxRows;
        while(rows > 0){
            int i = 0;
            while(i < rows){
                System.out.print("* ");
                i++;
            }
            System.out.println("");

            rows--;
        }

    }

    public static void printRightHalfPyramid(int maxRows) {
        System.out.println("Here is Right Half Pyramid.");
        int row = 0;
        while (row < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < row) {
                System.out.print(" *");
                i++;

            }
            System.out.println("");
            row++;
        }
    }

}