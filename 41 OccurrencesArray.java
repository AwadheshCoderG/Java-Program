import java.util.Scanner;

class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrences\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Please enter the number which you want to find: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(numArr, num);
        System.out.println("Your number was found "+ occurrences +" times in Array.");
    }

    public static int noOfOccurrences(int[] numArr, int num){
        int occ = 0;
        int i = 0;
        while(i < numArr.length){
            if(numArr[i] == num ){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
