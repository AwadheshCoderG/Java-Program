class MaxArray {
    public static void main(String[] args) {
        System.out.println("Welcome to find max array");
        int[] arr = ArrayUtility.inputArray();
        int max = Integer.MIN_VALUE;

        for(int num : arr){
            if(max < num){
                max = num;
            }
        }
        System.out.println("Maximum number is "+max);
    }
}
