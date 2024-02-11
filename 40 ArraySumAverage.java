class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sum and Average");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double average = average(numArray);
        System.out.println("Sum of the number is: "+ sum);
        System.out.println("Average of the number is: "+ average);
    }

    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray){
        long sum = sum(numArray);
        return (sum / numArray.length);
    }
}
