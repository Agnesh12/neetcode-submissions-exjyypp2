class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int value : piles) {
            right = Math.max(right, value);
        }
        int result = 0;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int timeTaken = 0;
            for(int value : piles) {
                timeTaken += Math.ceil((double)value / mid);
            }
            if(timeTaken <= h) {
                result = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return result;
    }
}
