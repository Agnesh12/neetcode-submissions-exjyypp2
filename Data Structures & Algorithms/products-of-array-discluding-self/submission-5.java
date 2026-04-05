class Solution {
    public int[] productExceptSelf(int[] arr) {
     int[] leftArr = new int[arr.length];
     int[] rightArr = new int[arr.length];
     leftArr[0] = 1;
     for(int index = 1; index < arr.length; index++) {
        leftArr[index] = arr[index - 1] * leftArr[index - 1];
     }
     rightArr[arr.length - 1] = 1;
     for(int index = arr.length - 2; index >= 0; index--) {
        rightArr[index] = arr[index + 1] * rightArr[index + 1];
     }
     
     for(int index = 0; index < arr.length; index++) {
       arr[index] = leftArr[index] * rightArr[index];
     }
     return arr;
    }
}  
