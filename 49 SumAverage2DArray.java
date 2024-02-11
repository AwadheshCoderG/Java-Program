class SumAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average of 2D Array");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        double avg = average(numArr);
        System.out.println("Sum of 2D Array is : "+sum);
        System.out.println("Average of 2D array is : "+avg);
    }

    public static double average(int[][] numArr){
        if(numArr.length == 0){
            return 0;
        }
        int rows = numArr.length;
        int columns = numArr[0].length;
        double size = rows * columns;
        return sum(numArr) / size;
    }

    public static long sum(int[][] numArr){
        int sum = 0;
        int i = 0;
        while(i < numArr.length){
            int j = 0;
            while(j < numArr[i].length){
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
