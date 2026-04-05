class Solution {
    public int[] productExceptSelf(int[] arr) {
        int[] prefixArr = new int[arr.length];
        int[] suffixArr = new int[arr.length];
        prefixArr[0] = 1;
        for(int index = 1; index < arr.length;index++) {
            prefixArr[index] = prefixArr[index - 1] * arr[index - 1];
        }
            
        
        suffixArr[arr.length - 1] = 1;
        for(int index = arr.length - 2; index >= 0; index--) {
            suffixArr[index] = suffixArr[index + 1] * arr[index + 1];
        }
        for(int index = 0; index < arr.length; index++) {
            arr[index] = prefixArr[index] * suffixArr[index];
        }
        return arr;
    }
}  
