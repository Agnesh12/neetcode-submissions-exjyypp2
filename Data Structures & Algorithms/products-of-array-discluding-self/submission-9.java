class Solution {
    public int[] productExceptSelf(int[] arr) {
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        prefix[0] = 1;
        for(int index = 1; index < arr.length; index++) {
            prefix[index] = arr[index - 1] * prefix[index - 1];
        }
        suffix[arr.length - 1] = 1;
        for(int index = arr.length - 2; index >= 0; index--) {
            suffix[index] = arr[index + 1] * suffix[index + 1];
        }
        for(int index = 0; index < arr.length; index++) {
            arr[index] = prefix[index] * suffix[index];
        }
        return arr;
    }
}  
