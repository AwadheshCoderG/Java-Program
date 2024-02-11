import java.util.Scanner;

class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrences\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Please enter the number which you want to find: ");
        int nums = input.nextInt();
        int occurrences = noOfOccurrences(numArr, nums);
        System.out.println("Your number was found "+ occurrences +" times in Array.");
    }

    public static int noOfOccurrences(int[] numArr, int nums){
        int occ = 0;
        for(int num : numArr){
            if(num == nums){
                occ++;
            }
        }
        return occ;
    }
}
