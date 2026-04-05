class Solution {
    static int Speed(int[] arr, int target) {
     int left = 1;
     int right = 0;
     for(int num : arr) {
        right = Math.max(right, num);
     }
     int ans = -1;
     while(left <= right) {
        int totalHours = 0;
        int mid = left + (right - left)/ 2;
        for(int num : arr) {
            totalHours += (int) Math.ceil((double) num / mid);
        }
        if(totalHours <= target) {
            ans = mid;
            right = mid - 1;
        }
        else {
            left = mid + 1;
        }
     }
     return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        return Speed(piles, h);
        
    }
}
