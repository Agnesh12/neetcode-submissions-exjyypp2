class Solution {
    public int maxArea(int[] arr) {
        int maxContainer = 0;
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            int areaContainer = Math.min(arr[left], arr[right]) * (right - left);
            maxContainer = Math.max(areaContainer, maxContainer);
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
