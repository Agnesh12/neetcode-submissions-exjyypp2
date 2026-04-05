class Solution {
    public int trap(int[] arr) {
        int[] leftArr = new int[arr.length];
        int[] rightArr = new int[arr.length];
        int leftMax = Integer.MIN_VALUE;
        for(int index = 0; index < arr.length; index++) {
           leftMax= Math.max(leftMax, arr[index]);
            leftArr[index] = leftMax;
        }
        int rightMax = Integer.MIN_VALUE;
        for(int index = arr.length - 1; index >= 0; index--) {
            rightMax = Math.max(rightMax, arr[index]);
            rightArr[index] = rightMax;
        }
        int totalWater = 0;
        for(int index = 0; index < arr.length; index++) {
            totalWater += Math.min(leftArr[index], rightArr[index]) - arr[index];
        }
        return totalWater;
    }
}
