class SortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sorted Array Check post");
        int[] numArr = ArrayUtility.inputArray();
        boolean isIncrease = isIncrease(numArr);
        boolean isDecrease = isDecrease(numArr);
        if(isIncrease || isDecrease){
            System.out.println("Array is sorted.");
        }
        else{
            System.out.println("Array is not sorted.");
        }
    }

    public static boolean isIncrease(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if(numArr[i] < numArr[i - 1]){
                return false;
            }
            i++;
        }
        return true;
    }


    public static boolean isDecrease(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if(numArr[i] > numArr[i - 1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
