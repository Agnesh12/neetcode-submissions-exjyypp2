class Solution {
    public int[] productExceptSelf(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = 1;
        for(int index = 1; index < arr.length; index++) {
            res[index] = res[index - 1] * arr[index - 1];
        }
        int postfix = 1;
        for(int index = arr.length - 1; index >= 0; index--) {
            res[index] *= postfix;
            postfix *= arr[index];
        }
        return res;

    }
}  
