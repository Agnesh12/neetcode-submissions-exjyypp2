class Solution {
    public int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxContainer = 0;
        while(left < right) {
            int areaContainer = Math.min(arr[left], arr[right]) * (right - left);
            maxContainer = Math.max(maxContainer, areaContainer);
            if(arr[left] < arr[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxContainer;
    }
}
