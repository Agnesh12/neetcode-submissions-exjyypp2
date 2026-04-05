class Solution {
    static int Target(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public int search(int[] arr, int target) {
        return Target(arr, target);
    }
}
