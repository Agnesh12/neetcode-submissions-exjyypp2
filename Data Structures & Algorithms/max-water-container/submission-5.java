class Solution {
    public int maxArea(int[] arr) {
        int maxContainer = Integer.MIN_VALUE;
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int areaContainer = Math.min(arr[left], arr[right]) * (right - left);
            maxContainer = Math.max(maxContainer, areaContainer);
            if(arr[left] <= arr[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxContainer;
    }
}
