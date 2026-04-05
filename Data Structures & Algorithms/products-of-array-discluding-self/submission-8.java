class Solution {
    public int[] productExceptSelf(int[] arr) {
        int len = arr.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        prefix[0] = 1;
        for(int index = 1; index < len; index++) {
            prefix[index] = prefix[index - 1] * arr[index - 1];
        }
        suffix[len - 1] = 1;
        for(int index = len - 2; index >= 0; index--) {
            suffix[index] = suffix[index + 1] * arr[index + 1];
        }
        int[] result = new int[len];
        for(int index = 0; index < len; index++) {
            result[index] = suffix[index] * prefix[index];
        }
        return result;
    }
}  
